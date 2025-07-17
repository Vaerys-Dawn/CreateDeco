package com.github.talrey.createdeco.neoforge;

import com.github.talrey.createdeco.CreateDecoMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;

@Mod(CreateDecoMod.MOD_ID)
public class CreateDecoModNeoForge {
    public CreateDecoModNeoForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = ModLoadingContext.get().getActiveContainer().getEventBus();
        CreativeTabsImpl.register(eventBus);
        CreateDecoMod.REGISTRATE.registerEventListeners(eventBus);

        // registers datagen listener to be used in the neoforge data runtime
        eventBus.addListener(CreateDecoModData::gatherData);
//        NeoForge.EVENT_BUS.register(this);
        CreateDecoMod.init();
    }
}
