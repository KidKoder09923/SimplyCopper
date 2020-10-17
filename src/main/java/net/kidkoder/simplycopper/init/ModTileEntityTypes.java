package net.kidkoder.simplycopper.init;

import net.kidkoder.simplycopper.tileenity.CopperCoreTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, "simplycopper");
    public static final RegistryObject<TileEntityType<CopperCoreTileEntity>> COPPER_CORE = TILE_ENTITY_TYPES.register("copper_core", () -> TileEntityType.Builder.create(CopperCoreTileEntity::new, BlockInit.COPPER_CORE).build(null));
}
