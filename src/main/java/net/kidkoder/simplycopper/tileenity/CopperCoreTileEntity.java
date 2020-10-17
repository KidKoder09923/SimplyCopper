package net.kidkoder.simplycopper.tileenity;

import net.kidkoder.simplycopper.helper.NBTHelper;
import net.kidkoder.simplycopper.init.ModTileEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.*;

public class CopperCoreTileEntity extends TileEntity implements ITickableTileEntity {
    public int x, y, z;
    private int power = 0;
    private long tick;
    private boolean inited;

    public CopperCoreTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }
    public CopperCoreTileEntity() {
        this(ModTileEntityTypes.COPPER_CORE.get());
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void tick() {
        if(!inited) init();
        tick++;
        if(tick==6000 && power > 0) {
            power--;
        }
    }

    private void init() {
        inited  = true;
        x = this.pos.getX();
        y = this.pos.getY();
        z = this.pos.getZ();
        tick = 0;
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.put("initvalue", NBTHelper.coreToNBT(this));
        return super.write(compound);
    }

    @Override
    public void func_230337_a_(BlockState state, CompoundNBT nbt) {
        CompoundNBT inits = nbt.getCompound("initvalue");
        if(inits != null) {
            this.x = nbt.getInt("x");
            this.y = nbt.getInt("y");
            this.z = nbt.getInt("z");
            tick = 0;
            inited = true;
            return;
        }
        init();
    }
}
