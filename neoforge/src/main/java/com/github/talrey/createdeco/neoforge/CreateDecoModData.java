package com.github.talrey.createdeco.neoforge;

import com.github.talrey.createdeco.BlockStateGenerator;
import com.github.talrey.createdeco.CreateDecoMod;
import com.simibubi.create.infrastructure.data.GeneratedEntriesProvider;
import com.tterrag.registrate.providers.ProviderType;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.loading.DatagenModLoader;

import java.util.concurrent.CompletableFuture;


public class CreateDecoModData {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        CreateDecoMod.LOGGER.info("Can The Data Generator run?");

//        if (!event.getMods().contains(CreateDecoMod.MOD_ID))
//            return;

//        CreateDecoMod.LOGGER.info("Running Data Generator");

        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

//        CreateDecoMod.REGISTRATE.addDataGenerator(ProviderType.BLOCKSTATE, provider -> {
//        });


//        CreateDecoMod.REGISTRATE.addDataGenerator(ProviderType.BLOCKSTATE, event::addProvider);
//        CreateDecoMod.REGISTRATE.addDataGenerator(ProviderType.LANG, event::addProvider);
//        CreateDecoMod.REGISTRATE.addDataGenerator(ProviderType.ITEM_MODEL, event::addProvider);


//        ExistingFileHelper helper = new ExistingFileHelper();
//
//        CreateDecoMod.REGISTRATE.setDataGenerator(event.createProvider())
    }

}
