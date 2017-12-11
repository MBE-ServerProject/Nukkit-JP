package cn.nukkit.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;
import cn.nukkit.utils.BlockColor;

/**
 * author: meare
 * NukkitJP Project
 */
public class BlockStandingBanner extends BlockSolid {


    public BlockStandingBanner() {
        this(0);
    }

    public BlockStandingBanner(int meta) {
        super(meta);
    }
	

    @Override
    public int getId() {
        return STANDING_BANNER;
    }
	
    public BlockStandingBanner(DyeColor dyeColor) {
        this(dyeColor.getWoolData());
    }

    @Override
    public String getName() {
        return getDyeColor().getName() + " Standing Banner";
    }
	
    @Override
    public BlockColor getColor() {
        return DyeColor.getByWoolData(meta).getColor();
    }

    public DyeColor getDyeColor() {
        return DyeColor.getByWoolData(meta);
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
}