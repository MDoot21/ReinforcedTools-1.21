package com.mdoot.reinforcedtools.datagen;

import com.mdoot.reinforcedtools.block.ModBlocks;
import com.mdoot.reinforcedtools.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CUT_STEEL_BLOCK)
                .add(ModBlocks.CUT_STEEL_STAIRS)
                .add(ModBlocks.CUT_STEEL_SLAB)
                .add(ModBlocks.STEEL_BARS)
                .add(ModBlocks.STEEL_BUTTON)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_BLOCK);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.CUT_STEEL_BLOCK)
                .add(ModBlocks.CUT_STEEL_STAIRS)
                .add(ModBlocks.CUT_STEEL_SLAB)
                .add(ModBlocks.STEEL_BARS)
                .add(ModBlocks.STEEL_BUTTON)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_REINFORCED_NETHERITE_TOOL)
                .forceAddTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_REINFORCED_DIAMOND_TOOL)
                .forceAddTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_REINFORCED_GOLDEN_TOOL)
                .forceAddTag(BlockTags.INCORRECT_FOR_STONE_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_REINFORCED_IRON_TOOL)
                .forceAddTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_REINFORCED_STEEL_TOOL)
                .forceAddTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL)
                .forceAddTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL)
                .forceAddTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);


        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_REINFORCED_NETHERITE_TOOL)
                .forceAddTag(ModTags.Blocks.NEEDS_REINFORCED_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_REINFORCED_DIAMOND_TOOL)
                .forceAddTag(BlockTags.NEEDS_DIAMOND_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_REINFORCED_GOLDEN_TOOL)
                .forceAddTag(BlockTags.NEEDS_STONE_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_REINFORCED_IRON_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_REINFORCED_STEEL_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_OBSIDIAN_TOOL)
                .forceAddTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }

}
