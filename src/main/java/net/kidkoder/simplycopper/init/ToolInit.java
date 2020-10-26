package net.kidkoder.simplycopper.init;

import net.kidkoder.simplycopper.SimplyCopperMod;
import net.kidkoder.simplycopper.tool.CopperPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class ToolInit {

    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, SimplyCopperMod.MODID);

    public static final RegistryObject<Item> COPPER_PICKAXE = TOOLS.register("copper_pickaxe", () ->
            new CopperPickaxe(SimplyCopperMaterials.COPPER, 3, -2.4F, new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));

}
