package com.mdoot.reinforcedtools.util;

import com.mdoot.reinforcedtools.ReinforcedTools;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_REINFORCED_NETHERITE_TOOL = createTag("needs_reinforced_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_REINFORCED_NETHERITE_TOOL = createTag("incorrect_for_reinforced_netherite_tool");

        public static  final TagKey<Block> NEEDS_REINFORCED_DIAMOND_TOOL = createTag("needs_reinforced_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_REINFORCED_DIAMOND_TOOL = createTag("incorrect_for_reinforced_diamond_tool");

        public static final TagKey<Block> NEEDS_REINFORCED_GOLDEN_TOOL = createTag("needs_reinforced_golden_tool");
        public static final TagKey<Block> INCORRECT_FOR_REINFORCED_GOLDEN_TOOL = createTag("incorrect_for_reinforced_golden_tool");

        public static final TagKey<Block> NEEDS_REINFORCED_IRON_TOOL = createTag("needs_reinforced_iron_tool");
        public static final TagKey<Block> INCORRECT_FOR_REINFORCED_IRON_TOOL = createTag("incorrect_for_reinforced_iron_tool");

        public static final TagKey<Block> NEEDS_REINFORCED_STEEL_TOOL = createTag("needs_reinforced_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_REINFORCED_STEEL_TOOL = createTag("incorrect_for_reinforced_steel_tool");

        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");

        public static final TagKey<Block> NEEDS_OBSIDIAN_TOOL = createTag("needs_obsidian_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBSIDIAN_TOOL = createTag("incorrect_for_obsidian_tool");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ReinforcedTools.MOD_ID, name));
        }
    }

}


