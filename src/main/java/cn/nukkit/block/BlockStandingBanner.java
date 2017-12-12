package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;
import cn.nukkit.utils.DyeColor;

/**
 * author: meare
 * NukkitJP Project
 */
public class BlockStandingBanner extends BlockTransparent {


    public BlockStandingBanner() {
        this(0);
    }

    public BlockStandingBanner(int meta) {
        super(meta);
    }
	
	public BlockStandingBanner(DyeColor dyeColor) {
		this(dyeColor.getWoolData());
    }

	@Override
    public String getName() {
        return getDyeColor().getName() + " Standing Banner";
    }	
	
    @Override
    public int getId() {
        return STANDING_BANNER;
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