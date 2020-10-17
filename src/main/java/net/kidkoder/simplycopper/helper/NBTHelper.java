package net.kidkoder.simplycopper.helper;

import net.kidkoder.simplycopper.tileenity.CopperCoreTileEntity;
import net.minecraft.nbt.CompoundNBT;

public class NBTHelper {

    public static CompoundNBT coreToNBT(CopperCoreTileEntity core) {
        CompoundNBT nbt = new CompoundNBT();
        nbt.putLong("power", core.getPower());
        return nbt;
    }
}
