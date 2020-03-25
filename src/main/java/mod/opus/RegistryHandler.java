package mod.opus;

import mod.opus.blocks.BasicOre;

import mod.opus.util.ItemHelper;
import net.minecraft.block.Block;

import net.minecraft.item.Item;

import net.minecraftforge.fml.RegistryObject;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static mod.opus.Opus.MODID;

//@Mod.EventBusSubscriber
public class RegistryHandler {
	/**
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
**/
	//Register
	private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MODID);


	//Register Blocks
	public static final RegistryObject<Block> SULFUREORE_BLOCK = BLOCKS.register("sulfureore",() -> new BasicOre().ore("sulfureore"));
	public static final RegistryObject<Block> CINNABARORE_BLOCK = BLOCKS.register("cinnabarore",() -> new BasicOre().ore("cinnabarore"));
	public static final RegistryObject<Block> SALTORE_BLOCK = BLOCKS.register("saltore",() -> new BasicOre().ore("saltore"));

	//Register Items
	public static final RegistryObject<Item> SULFUREORE_ITEM = ITEMS.register("sulfureore",() -> new ItemHelper().ItemfromBlock(new BasicOre().ore("sulfureore")));
	public static final RegistryObject<Item> CINNABARORE_ITEM = ITEMS.register("cinnabarore",() -> new ItemHelper().ItemfromBlock(new BasicOre().ore("cinnabarore")));
	public static final RegistryObject<Item> SALTORE_ITEM = ITEMS.register("saltore",() -> new ItemHelper().ItemfromBlock(new BasicOre().ore("saltore")));

	public static void registerall(){

		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}