package net.kidkoder.simplycopper.copper;

import net.minecraft.item.ItemStack;

public interface ICopper {
    void addVoltage(ItemStack stack, long amount);
    void removeVoltage(ItemStack stack, long amount);
    void setVoltage(ItemStack stack, long amount);
    float getVoltage(ItemStack stack, long amount);
}
