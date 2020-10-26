package net.kidkoder.simplycopper.tool;

import net.kidkoder.simplycopper.block.BlockVoltager;
import net.kidkoder.simplycopper.copper.ICopper;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class CopperPickaxe extends PickaxeItem implements ICopper {

    private long power;
    private float destroySpeed = 7.0F;

    public CopperPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.inventoryTick(stack, worldIn, entityIn, itemSlot, isSelected);
        if(stack.hasTag() && stack.getTag().contains("power")) {
            if(stack.getTag().getInt("power") > (long) 1) {
                destroySpeed = 8.0F;
            }
        }
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return destroySpeed;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        if(stack.hasTag() && stack.getTag().contains("power")) {
            if(stack.getTag().getInt("power") > (long) 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        ItemStack stack = context.getItem();
        if(context.getWorld().getBlockState(context.getPos()).getBlock() instanceof BlockVoltager) this.addVoltage(stack, (long) 100);
        return super.onItemUse(context);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(stack.hasTag() && stack.getTag().contains("power")) {
            tooltip.add(new StringTextComponent("Power: " + Long.toString(stack.getTag().getLong("power"))));
        } else {
            tooltip.add(new StringTextComponent("Power: " + 0));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public void addVoltage(ItemStack stack, long amount) {
        if(stack.hasTag() && stack.getTag().contains("power")) {
            stack.getTag().putLong("power", stack.getTag().getLong("power") + amount);
        } else {
            CompoundNBT nbt  = new CompoundNBT();
            nbt.putLong("power", amount);
            stack.setTag(nbt);
        }
    }

    @Override
    public void removeVoltage(ItemStack stack, long amount) {
        if(stack.hasTag() && stack.getTag().contains("power")) {
            stack.getTag().putLong("power", stack.getTag().getLong("power") - amount);
        } else {
            CompoundNBT nbt  = new CompoundNBT();
            nbt.putLong("power", 0 -amount);
            stack.setTag(nbt);
        }
    }

    @Override
    public void setVoltage(ItemStack stack, long amount) {
        if(stack.hasTag() && stack.getTag().contains("power")) {
            stack.getTag().putLong("power", amount);
        } else {
            CompoundNBT nbt  = new CompoundNBT();
            nbt.putLong("power", amount);
            stack.setTag(nbt);
        }
    }

    @Override
    public float getVoltage(ItemStack stack, long amount) {
        if(stack.hasTag() && stack.getTag().contains("power")) {
            return stack.getTag().getLong("power");
        }
        return 0;
    }
}
