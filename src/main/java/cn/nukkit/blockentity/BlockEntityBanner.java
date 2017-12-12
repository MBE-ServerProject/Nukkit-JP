package cn.nukkit.blockentity;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.block.Block;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.utils.DyeColor;

public abstract class BlockEntityBanner extends BlockEntitySpawnable {

    public int color;

    public BlockEntityBanner(FullChunk chunk, CompoundTag nbt) {
        super(chunk, nbt);
    }

    @Override
    protected void initBlockEntity() {
        if (!this.namedTag.contains("color")) {
            this.namedTag.putByte("color", 0);
        }

        this.color = this.namedTag.getByte("color");

        super.initBlockEntity();
    }

    @Override
    public void saveNBT() {
        super.saveNBT();
        this.namedTag.putByte("color", this.color);
    }

    @Override
    public boolean isBlockEntityValid() {
        //return this.level.getBlockIdAt(this.getFloorX(), this.getFloorY(), this.getFloorZ()) == Block.BANNER;
        return getBlock().getId() == Block.STANDING_BANNER || getBlock().getId() == Block.WALL_BANNER;
    }

    @Override
    public CompoundTag getSpawnCompound() {
        return new CompoundTag()
                .putString("id", BlockEntity.BANNER)
                .putInt("x", (int) this.x)
                .putInt("y", (int) this.y)
                .putInt("z", (int) this.z)
                .putByte("color", this.color);
    }

	public DyeColor getDyeColor() {
		return DyeColor.getByWoolData(color);
	}
}