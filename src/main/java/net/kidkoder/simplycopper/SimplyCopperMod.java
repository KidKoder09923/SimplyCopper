package net.kidkoder.simplycopper;

import net.kidkoder.simplycopper.init.ModTileEntityTypes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("simplycopper")
public class SimplyCopperMod {
    public SimplyCopperMod() {
        ModTileEntityTypes.TILE_ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
    }

    private void clientSetup(FMLClientSetupEvent e) {}
    private void serverSetup(FMLCommonSetupEvent e) {}
}
