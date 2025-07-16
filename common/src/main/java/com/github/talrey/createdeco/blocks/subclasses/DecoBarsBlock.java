package com.github.talrey.createdeco.blocks.subclasses;

import net.minecraft.world.level.block.IronBarsBlock;

public class DecoBarsBlock extends IronBarsBlock {

    protected DecoBarsBlock(Properties settings) {
        super(settings);
    }

    public static DecoBarsBlock factory(Properties settings) {
        return new DecoBarsBlock(settings);
    }
}
