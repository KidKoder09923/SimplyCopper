package net.kidkoder.simplycopper;

import net.kidkoder.simplycopper.init.ModTileEntityTypes;
import net.kidkoder.simplycopper.init.ToolInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.IModBusEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SimplyCopperMod.MODID)
public class SimplyCopperMod {
    //Directly refrence a looger4j logger
    public static final String MODID = "simplycopper";
    public static final Logger LOGGER = LogManager.getLogger();
    public SimplyCopperMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModTileEntityTypes.TILE_ENTITY_TYPES.register(bus);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);

        ToolInit.TOOLS.register(bus);

    }

    private void clientSetup(FMLClientSetupEvent e) {}
    private void serverSetup(FMLCommonSetupEvent e) {}
}
