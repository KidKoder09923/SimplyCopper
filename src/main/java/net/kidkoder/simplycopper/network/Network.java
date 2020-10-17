package net.kidkoder.simplycopper.network;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;

public class Network {
    private HashMap<BlockPos, NetworkProductivityType> PRODUCTIVITY_BLOCKS = new HashMap<>();
    private BlockPos corePos;

    public Network(HashMap<BlockPos, NetworkProductivityType> PRODUCTIVITY_BLOCKS, BlockPos corePos) {
        this.PRODUCTIVITY_BLOCKS = PRODUCTIVITY_BLOCKS;
        this.corePos = corePos;
    }
}
