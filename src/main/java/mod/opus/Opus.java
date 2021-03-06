package mod.opus;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Opus.MODID)
@Mod.EventBusSubscriber(modid = Opus.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Opus {
	
	/*Mod Identifiers*/
	public static final String MODID = "opus";
    
	// Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public Opus() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.registerall();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
    }

    private void doClientStuff(final FMLClientSetupEvent event){}
}
