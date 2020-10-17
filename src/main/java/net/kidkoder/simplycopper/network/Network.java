package net.kidkoder.simplycopper.network;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;

public class Network {
    private HashMap<BlockPos, NetworkProductivityType> PRODUCTIVITY_BLOCKS = new HashMap<>();
    private BlockPos corePos;
    public Network(HashMap<BlockPos, NetworkProductivityType> PRODUCTIVITY_BLOCKS, BlockPos corePos) {
        this.PRODUCTIVITY_BLOCKS = PRODUCTIVITY_BLOCKS;
        this.corePos = corePos;
    }
    public static int getDistance(BlockPos pos1, BlockPos pos2) {
        double deltaX = pos1.getX() - pos2.getX();
        double deltaY = pos1.getY() - pos2.getY();
        double deltaZ = pos1.getZ() - pos2.getZ();

        return Integer.parseInt(String.valueOf(Math.sqrt((deltaX * deltaX) + (deltaY * deltaY) + (deltaZ * deltaZ))));
    }
    public CompoundNBT toNBT() {
        CompoundNBT nbt = new CompoundNBT();
        PRODUCTIVITY_BLOCKS.forEach((pos, type) -> {
            CompoundNBT nbt2 = new CompoundNBT();
            nbt2.putInt("x", pos.getX());
            nbt2.putInt("y", pos.getY());
            nbt2.putInt("z", pos.getZ());
            nbt2.putString("type", type.toString());
            nbt.put("block", nbt2);
        });
        return nbt;
    }
}
