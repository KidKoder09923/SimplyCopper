package net.kidkoder.simplycopper.block;

import net.kidkoder.simplycopper.SimplyCopperMod;
import net.kidkoder.simplycopper.copper.ICopper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.shader.IShaderManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockVoltager extends Block {

    public BlockVoltager(Properties properties) {
        super(properties);
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return 10;
    }
}
