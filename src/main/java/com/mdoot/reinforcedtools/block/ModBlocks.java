package com.mdoot.reinforcedtools.block;


import com.mdoot.reinforcedtools.ReinforcedTools;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(6.0f,7.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));
    public static final Block CUT_STEEL_BLOCK = registerBlock("cut_steel_block",
            new Block(AbstractBlock.Settings.copy(STEEL_BLOCK)));

    public static final Block CUT_STEEL_STAIRS = registerBlock("cut_steel_stairs",
            new StairsBlock(ModBlocks.CUT_STEEL_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .strength(6.0f, 7.0f)
                            .sounds(BlockSoundGroup.METAL)
                            .requiresTool()));
    public static final Block CUT_STEEL_SLAB = registerBlock("cut_steel_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(6.0f, 7.0f)
                    .sounds(BlockSoundGroup.METAL)
                    .requiresTool()));

    public static final Block STEEL_BUTTON = registerBlock("steel_button",
            new ButtonBlock(BlockSetType.IRON, 2,
                    AbstractBlock.Settings.create()
                            .strength(2f)
                            .sounds(BlockSoundGroup.METAL)
                            .requiresTool()
                            .noCollision()));
    public static final Block STEEL_PRESSURE_PLATE = registerBlock("steel_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON,
                    AbstractBlock.Settings.create()
                            .strength(2f)
                            .sounds(BlockSoundGroup.METAL)
                            .requiresTool()));
    public static final Block STEEL_BARS = registerBlock("steel_bars",
            new PaneBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(6.0F, 7.0F)
                    .sounds(BlockSoundGroup.METAL)
                    .nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ReinforcedTools.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ReinforcedTools.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ReinforcedTools.LOGGER.info("Registering Mod Block for " + ReinforcedTools.MOD_ID);
    }

}
