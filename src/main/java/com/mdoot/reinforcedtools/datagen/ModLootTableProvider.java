package com.mdoot.reinforcedtools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import com.mdoot.reinforcedtools.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;


import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.CUT_STEEL_BLOCK);
        addDrop(ModBlocks.CUT_STEEL_STAIRS);
        addDrop(ModBlocks.CUT_STEEL_SLAB, slabDrops(ModBlocks.CUT_STEEL_SLAB));
        addDrop(ModBlocks.STEEL_BUTTON);
        addDrop(ModBlocks.STEEL_PRESSURE_PLATE);
        addDrop(ModBlocks.STEEL_BARS);
    }

}