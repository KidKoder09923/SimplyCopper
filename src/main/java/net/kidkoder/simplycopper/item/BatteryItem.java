package net.kidkoder.simplycopper.item;

import net.kidkoder.simplycopper.SimplyCopperMod;
import net.kidkoder.simplycopper.init.ModTileEntityTypes;
import net.kidkoder.simplycopper.tileenity.CopperCoreTileEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class BatteryItem extends Item {

    private long power = 0L;

    public BatteryItem(Properties properties) {
        super(properties);
    }

//    public long getPower() {
//        return power;
//    }
//
//    public void setPower(long power) {
//        this.power = power;
//    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        try {
            TileEntity core = context.getWorld().getTileEntity(context.getPos());
            if(core.getType() == ModTileEntityTypes.COPPER_CORE.get()) {
                SimplyCopperMod.LOGGER.debug("Copper core detected");
                CopperCoreTileEntity coreTileEntity = (CopperCoreTileEntity) core;
            }
        } catch (Exception e) {}
        return super.onItemUse(context);
    }
}
