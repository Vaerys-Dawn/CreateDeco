package com.github.talrey.createdeco.blocks.subclasses;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;


public class DecoStairsBlock extends StairBlock {
    protected DecoStairsBlock(BlockState baseBlockState, Properties settings) {
        super(baseBlockState, settings);
    }

    public static DecoStairsBlock factory(BlockState baseBlockState, Properties settings) {
        return new DecoStairsBlock(baseBlockState, settings);
    }
}
