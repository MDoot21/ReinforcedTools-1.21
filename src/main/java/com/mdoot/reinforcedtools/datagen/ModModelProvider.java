package com.mdoot.reinforcedtools.datagen;

import com.mdoot.reinforcedtools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_ROD, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.THICK_STICK, Models.GENERATED);

        itemModelGenerator.register(ModItems.REINFORCED_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_NETHERITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.REINFORCED_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.REINFORCED_GOLDEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLDEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLDEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLDEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_GOLDEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.REINFORCED_IRON_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_IRON_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.REINFORCED_STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REINFORCED_STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_HOE, Models.HANDHELD);

    }
}
