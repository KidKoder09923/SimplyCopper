package net.kidkoder.simplycopper.init;

import net.kidkoder.simplycopper.block.BlockCopperCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
    public static Block COPPER_ORE;
    public static Block COPPER_CORE;
    public static Block COPPER_BLOCK;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                COPPER_ORE = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName("copper_ore"),
                COPPER_BLOCK = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3).harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName("copper_block"),
                COPPER_CORE = new BlockCopperCore(Block.Properties.create(Material.IRON).hardnessAndResistance(3).harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName("copper_core")
        );
    }
}
