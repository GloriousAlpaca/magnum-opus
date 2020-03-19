package mod.opus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Opus.MODID)
public class Opus {
	
	/*Mod Identifiers*/
	public static final String MODID = "opus";
    public static final String NAME = "magnum opus";
    public static final String VERSION = "1.0";
    
	// Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public Opus() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
    }
}
