package com.github.talrey.createdeco.blocks.subclasses;

import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DecoTrapDoorBlock extends TrapDoorBlock {
    protected DecoTrapDoorBlock(BlockSetType type, Properties settings) {
        super(type, settings);
    }

    public static DecoTrapDoorBlock factory(Properties settings, BlockSetType type) {
        return new DecoTrapDoorBlock(type, settings);
    }
}
