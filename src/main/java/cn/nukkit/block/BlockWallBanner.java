package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.block.BlockStandingBanner;
import cn.nukkit.blockentity.BlockEntity;
import cn.nukkit.blockentity.BlockEntityBanner;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBanner;
import cn.nukkit.item.ItemTool;
import cn.nukkit.level.Level;
import cn.nukkit.math.AxisAlignedBB;
import cn.nukkit.math.BlockFace;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.nbt.tag.Tag;
import cn.nukkit.utils.BlockColor;
import cn.nukkit.utils.DyeColor;

/**
 * author: meare
 * NukkitJP Project
 */
public class BlockWallBanner extends BlockTransparent {


    public BlockWallBanner() {
        this(0);
    }

    public BlockWallBanner(int meta) {
        super(meta);
    }
	
	public BlockWallBanner(DyeColor dyeColor) {
		this(dyeColor.getWoolData());
    }

	@Override
    public String getName() {
        return getDyeColor().getName() + " Wall Banner";
    }	
	
    @Override
    public int getId() {
        return WALL_BANNER;
    }
	
    @Override
    public int getToolType() {
        return ItemTool.TYPE_AXE;
    }		
	
    @Override
    public double getHardness() {
        return 3;
    }

    @Override
    public double getResistance() {
        return 30;
    }

    @Override
    public boolean place(Item item, Block block, Block target, BlockFace face, double fx, double fy, double fz, Player player) {
        if (face != BlockFace.DOWN) {
            CompoundTag nbt = new CompoundTag()
                    .putString("id", BlockEntity.BANNER)
                    .putInt("x", (int) block.x)
                    .putInt("y", (int) block.y)
                    .putInt("z", (int) block.z)
                    .putByte("color", item.getDamage());

            if (face == BlockFace.UP) {
                meta = (int) Math.floor(((player.yaw + 180) * 16 / 360) + 0.5) & 0x0f;
                getLevel().setBlock(block, new BlockStandingBanner(meta), true);
            } else {
                meta = face.getIndex();
                getLevel().setBlock(block, new BlockWallBanner(meta), true);
            }

            new BlockEntityBanner(getLevel().getChunk((int) block.x >> 4, (int) block.z >> 4), nbt);

            return true;
        }

        return false;
    }

    @Override
    public int onUpdate(int type) {
        int[] faces = {
            3,
            2,
            4,
            5
        };
        if (type == Level.BLOCK_UPDATE_NORMAL) {
            if (this.meta >= 2 && this.meta <= 5) {
                if (this.getSide(BlockFace.fromIndex(faces[this.meta - 2])).getId() == Item.AIR) {
                    this.getLevel().useBreakOn(this);
                }
                return Level.BLOCK_UPDATE_NORMAL;
            }
        }
        return 0;
    }

    @Override
    public Item toItem() {
        return new ItemBanner(this.meta);
    }

    @Override
    public boolean canHarvestWithHand() {
        return false;
    }
	
	  @Override
    public BlockColor getColor() {
        return DyeColor.getByWoolData(meta).getColor();
    }

    public DyeColor getDyeColor() {
        return DyeColor.getByWoolData(meta);
    }

}