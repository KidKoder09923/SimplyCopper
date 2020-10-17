package net.kidkoder.simplycopper.events;

import net.kidkoder.simplycopper.gen.OreGeneration;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class Events {
    @SubscribeEvent
    public static void loadComplete(FMLLoadCompleteEvent event) {
        OreGeneration.setupCopperOreGen();
    }


}
