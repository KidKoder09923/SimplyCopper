package net.kidkoder.simplycopper.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum  SimplyCopperMaterials implements IItemTier {


    COPPER(2, 300, 7.0F, 0.0F, 0, () -> {
        return Ingredient.fromItems(ItemInit.COPPER_INGOT);
    });
    private final int harvestLevel;
    private final int maxUses;
    private final float efficincy;
    private final float atkDmg;
    private final int enchantabily;
    private final Supplier<Ingredient> repairMaterial;

    SimplyCopperMaterials(int harvestLevel, int maxUses, float efficincy, float atkDmg, int enchantabily, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficincy = efficincy;
        this.atkDmg = atkDmg;
        this.enchantabily = enchantabily;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficincy;
    }

    @Override
    public float getAttackDamage() {
        return atkDmg;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantabily;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
