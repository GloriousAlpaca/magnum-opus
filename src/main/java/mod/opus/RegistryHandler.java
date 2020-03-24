package mod.opus;

import mod.opus.blocks.BlockHolder;
import mod.opus.util.ItemHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		
		Block oreblock = new Block(Block.Properties.create(Material.ROCK)
		.lightValue(0)
		.hardnessAndResistance(3,15)
		.harvestLevel(1)
		.harvestTool(net.minecraftforge.common.ToolType.PICKAXE));
		
		Block sulfurore = oreblock.setRegistryName("opus:sulfurore");
		Block cinnabarore = oreblock.setRegistryName("opus:cinnabarore");
		Block saltore = oreblock.setRegistryName("opus:saltore");
		
	    event.getRegistry().registerAll(
	    		sulfurore,
	    		cinnabarore,
	    		saltore
	    		);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		
	    event.getRegistry().registerAll(
	    		ItemHelper.ItemfromBlock(BlockHolder.sulfurore),
	    		ItemHelper.ItemfromBlock(BlockHolder.cinnabarore),
	    		ItemHelper.ItemfromBlock(BlockHolder.saltore)
	    		);
	}
	
}
