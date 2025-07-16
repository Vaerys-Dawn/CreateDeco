package com.github.talrey.createdeco.blocks.subclasses;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;



public class DecoDoorBlock extends DoorBlock {
    protected DecoDoorBlock(BlockSetType type, Properties settings) {
        super(type, settings);
    }

    public static DecoDoorBlock factory(BlockSetType type, Properties settings) {
        return new DecoDoorBlock(type, settings);
    }
}
