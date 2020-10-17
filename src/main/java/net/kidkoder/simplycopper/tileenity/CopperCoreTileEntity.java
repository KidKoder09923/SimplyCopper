package net.kidkoder.simplycopper.tileenity;

import net.kidkoder.simplycopper.helper.NBTHelper;
import net.kidkoder.simplycopper.init.ModTileEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.*;
import net.minecraft.util.text.ITextComponent;

public class CopperCoreTileEntity extends TileEntity implements ITickableTileEntity {
    private long power = 0;
    private long tick;
    private boolean inited;

    public CopperCoreTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }
    public CopperCoreTileEntity() {
        this(ModTileEntityTypes.COPPER_CORE.get());
    }

    public long getPower() {
        return power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    public void tick() {
        if(!inited) init();
        tick++;
        if(power > 100 & tick == 1200) {
            power--;
        }
    }

    private void init() {
        inited  = true;
        tick = 0;
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        compound.putLong("power", power);
        return compound;
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT nbt) {
        super.func_230337_a_(state, nbt);
        this.power = nbt.getInt("power");
    }

}
