package cn.nukkit.item;

import cn.nukkit.block.BlockWallBanner;

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
        super(BANNER, 0, count, "Banner");
        this.block = new BlockWallBanner();
    }

    @Override
    public int getMaxStackSize() {
        return 16;
    }
}
