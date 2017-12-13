package cn.nukkit.item;

import cn.nukkit.block.BlockWallBanner;
import cn.nukkit.utils.DyeColor;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class ItemBanner extends Item {

    public ItemBanner() {
        this(0, 1);
    }

    public ItemBanner(Integer meta) {
        this(meta, 1);
    }

    public ItemBanner(Integer meta, int count) {
        super(BANNER, meta, count, DyeColor.getByWoolData(meta).getName() + " Banner");
        this.block = new BlockWallBanner(DyeColor.getByDyeData(meta));
    }

    @Override
    public int getMaxStackSize() {
        return 16;
    }
}
