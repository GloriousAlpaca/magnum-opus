package mod.opus.util;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemHelper {

	
	public static BlockItem ItemfromBlock(Block p) {
		return (BlockItem) new BlockItem(p, (new Item.Properties()).group(ItemGroup.BUILDING_BLOCKS));
	}
}
