package net.kidkoder.simplycopper.tool;

import net.kidkoder.simplycopper.copper.ICopper;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class CopperAxe extends AxeItem implements ICopper {
    public CopperAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public void addVoltage(ItemStack stack, long amount) {

    }

    @Override
    public void removeVoltage(ItemStack stack, long amount) {

    }

    @Override
    public void setVoltage(ItemStack stack, long amount) {

    }

    @Override
    public float getVoltage(ItemStack stack, long amount) {
        return 0;
    }
}
