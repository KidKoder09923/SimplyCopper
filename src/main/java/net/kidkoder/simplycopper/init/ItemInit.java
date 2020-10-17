package net.kidkoder.simplycopper.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemInit {
    public static Item COPPER_INGOT;
    public static Item COPPER_ORE_ITEM;
    public static Item COPPER_BLOCK_ITEM;
    public static Item COPPER_CORE_ITEM;
    public static Item BATTERY;

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(
                COPPER_ORE_ITEM = new BlockItem(BlockInit.COPPER_ORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("copper_ore"),
                COPPER_BLOCK_ITEM = new BlockItem(BlockInit.COPPER_BLOCK, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("copper_block"),
                COPPER_CORE_ITEM = new BlockItem(BlockInit.COPPER_CORE, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("copper_core")
        );
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                COPPER_INGOT = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("copper_ingot")
        );
    }
}
