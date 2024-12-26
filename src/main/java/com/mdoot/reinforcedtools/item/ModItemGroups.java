package com.mdoot.reinforcedtools.item;

import com.mdoot.reinforcedtools.ReinforcedTools;
import com.mdoot.reinforcedtools.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MATERIALS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ReinforcedTools.MOD_ID, "materials"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT))
                    .displayName(Text.translatable("itemgroup.reinforcedtools.materials"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.OBSIDIAN_SHARD);
                        entries.add(ModItems.STEEL_ROD);
                        entries.add(ModItems.THICK_STICK);
                        entries.add(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE);
                    })).build());

    public static final ItemGroup BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ReinforcedTools.MOD_ID, "blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.STEEL_BLOCK))
                    .displayName(Text.translatable("itemgroup.reinforcedtools.blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.CUT_STEEL_BLOCK);
                        entries.add(ModBlocks.CUT_STEEL_STAIRS);
                        entries.add(ModBlocks.CUT_STEEL_SLAB);
                        entries.add(ModBlocks.STEEL_BARS);
                        entries.add(ModBlocks.STEEL_BUTTON);
                        entries.add(ModBlocks.STEEL_PRESSURE_PLATE);
                    })).build());

    public static final ItemGroup REINFORCED_TOOLS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ReinforcedTools.MOD_ID, "reinforced_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.REINFORCED_STEEL_PICKAXE))
                    .displayName(Text.translatable("itemgroup.reinforcedtools.reinforced_tools"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);

                        entries.add(ModItems.REINFORCED_STEEL_SWORD);
                        entries.add(ModItems.REINFORCED_STEEL_PICKAXE);
                        entries.add(ModItems.REINFORCED_STEEL_AXE);
                        entries.add(ModItems.REINFORCED_STEEL_SHOVEL);
                        entries.add(ModItems.REINFORCED_STEEL_HOE);

                        entries.add(ModItems.REINFORCED_GOLDEN_SWORD);
                        entries.add(ModItems.REINFORCED_GOLDEN_PICKAXE);
                        entries.add(ModItems.REINFORCED_GOLDEN_AXE);
                        entries.add(ModItems.REINFORCED_GOLDEN_SHOVEL);
                        entries.add(ModItems.REINFORCED_GOLDEN_HOE);

                        entries.add(ModItems.REINFORCED_IRON_SWORD);
                        entries.add(ModItems.REINFORCED_IRON_PICKAXE);
                        entries.add(ModItems.REINFORCED_IRON_AXE);
                        entries.add(ModItems.REINFORCED_IRON_SHOVEL);
                        entries.add(ModItems.REINFORCED_IRON_HOE);

                        entries.add(ModItems.REINFORCED_DIAMOND_SWORD);
                        entries.add(ModItems.REINFORCED_DIAMOND_PICKAXE);
                        entries.add(ModItems.REINFORCED_DIAMOND_AXE);
                        entries.add(ModItems.REINFORCED_DIAMOND_SHOVEL);
                        entries.add(ModItems.REINFORCED_DIAMOND_HOE);

                        entries.add(ModItems.REINFORCED_NETHERITE_SWORD);
                        entries.add(ModItems.REINFORCED_NETHERITE_PICKAXE);
                        entries.add(ModItems.REINFORCED_NETHERITE_AXE);
                        entries.add(ModItems.REINFORCED_NETHERITE_SHOVEL);
                        entries.add(ModItems.REINFORCED_NETHERITE_HOE);

                        entries.add(ModItems.OBSIDIAN_SWORD);
                        entries.add(ModItems.OBSIDIAN_PICKAXE);
                        entries.add(ModItems.OBSIDIAN_AXE);
                        entries.add(ModItems.OBSIDIAN_SHOVEL);
                        entries.add(ModItems.OBSIDIAN_HOE);

                        entries.add(ModItems.REINFORCED_OBSIDIAN_SWORD);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_PICKAXE);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_AXE);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_SHOVEL);
                        entries.add(ModItems.REINFORCED_OBSIDIAN_HOE);
                    })).build());


    public static void registerItemGroups(){
        ReinforcedTools.LOGGER.info("Registering Item Groups for " + ReinforcedTools.MOD_ID);
    }
}

