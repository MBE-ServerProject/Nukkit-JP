package cn.nukkit.blockentity;

import cn.nukkit.Player;
import cn.nukkit.item.Item;
import cn.nukkit.block.Block;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.utils.DyeColor;

public class BlockEntityBanner extends BlockEntitySpawnable {

    public int color;
	
	
	public DyeColor getDyeColor() {
		return DyeColor.getByWoolData(color);
	}
}