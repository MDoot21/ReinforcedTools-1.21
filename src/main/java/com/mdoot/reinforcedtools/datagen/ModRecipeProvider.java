package com.mdoot.reinforcedtools.datagen;

import com.mdoot.reinforcedtools.block.ModBlocks;
import com.mdoot.reinforcedtools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_BLOCK, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.STEEL_BLOCK), conditionsFromItem(ModBlocks.STEEL_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.CUT_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.CUT_STEEL_BLOCK), conditionsFromItem(ModBlocks.CUT_STEEL_BLOCK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_STEEL_SLAB, 6)
                .pattern("RRR")
                .input('R', ModBlocks.CUT_STEEL_BLOCK)
                .criterion(hasItem(ModBlocks.CUT_STEEL_BLOCK), conditionsFromItem(ModBlocks.CUT_STEEL_BLOCK))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_BUTTON)
                .input(ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.STEEL_PRESSURE_PLATE)
                .pattern("RR")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BARS, 16)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_INGOT)
                .pattern("T")
                .pattern("R")
                .input('R', Items.IRON_INGOT)
                .input('T', Items.COAL)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_ROD)
                .pattern("R")
                .pattern("R")
                .input('R', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_SHARD, 9)
                .input(Items.OBSIDIAN)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.OBSIDIAN)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.OBSIDIAN_SHARD)
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THICK_STICK)
                .pattern("R")
                .pattern("R")
                .input('R', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE)
                .pattern("RSR")
                .pattern("RTR")
                .pattern("RRR")
                .input('R', Items.DIAMOND)
                .input('T', ModItems.STEEL_INGOT)
                .input('S', ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .criterion(hasItem(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(recipeExporter);

//STEEL SET:
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("R")
                .input('R', Items.STICK)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                .pattern("TTT")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', Items.STICK)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                .pattern("TT")
                .pattern("RT")
                .pattern("R ")
                .input('R', Items.STICK)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                .pattern("T")
                .pattern("R")
                .pattern("R")
                .input('R', Items.STICK)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                .pattern("TT")
                .pattern("R ")
                .pattern("R ")
                .input('R', Items.STICK)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
//OBSIDIAN SET
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("R")
                .input('R', ModItems.THICK_STICK)
                .input('T', ModItems.OBSIDIAN_SHARD)
                .criterion(hasItem(ModItems.THICK_STICK), conditionsFromItem(ModItems.THICK_STICK))
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_PICKAXE)
                .pattern("TTT")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.THICK_STICK)
                .input('T', ModItems.OBSIDIAN_SHARD)
                .criterion(hasItem(ModItems.THICK_STICK), conditionsFromItem(ModItems.THICK_STICK))
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_AXE)
                .pattern("TT")
                .pattern("RT")
                .pattern("R ")
                .input('R', ModItems.THICK_STICK)
                .input('T', ModItems.OBSIDIAN_SHARD)
                .criterion(hasItem(ModItems.THICK_STICK), conditionsFromItem(ModItems.THICK_STICK))
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SHOVEL)
                .pattern("T")
                .pattern("R")
                .pattern("R")
                .input('R', ModItems.THICK_STICK)
                .input('T', ModItems.OBSIDIAN_SHARD)
                .criterion(hasItem(ModItems.THICK_STICK), conditionsFromItem(ModItems.THICK_STICK))
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HOE)
                .pattern("TT")
                .pattern("R ")
                .pattern("R ")
                .input('R', ModItems.THICK_STICK)
                .input('T', ModItems.OBSIDIAN_SHARD)
                .criterion(hasItem(ModItems.THICK_STICK), conditionsFromItem(ModItems.THICK_STICK))
                .criterion(hasItem(ModItems.OBSIDIAN_SHARD), conditionsFromItem(ModItems.OBSIDIAN_SHARD))
                .offerTo(recipeExporter);
//REINFORCED NETHERITE SET:
        offerSteelUpgradeRecipe(recipeExporter, Items.NETHERITE_SWORD, RecipeCategory.COMBAT, ModItems.REINFORCED_NETHERITE_SWORD);
        offerSteelUpgradeRecipe(recipeExporter, Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, ModItems.REINFORCED_NETHERITE_PICKAXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.NETHERITE_AXE, RecipeCategory.TOOLS, ModItems.REINFORCED_NETHERITE_AXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.NETHERITE_SHOVEL, RecipeCategory.TOOLS, ModItems.REINFORCED_NETHERITE_SHOVEL);
        offerSteelUpgradeRecipe(recipeExporter, Items.NETHERITE_HOE, RecipeCategory.TOOLS, ModItems.REINFORCED_NETHERITE_HOE);
//REINFORCED DIAMOND SET:
        offerSteelUpgradeRecipe(recipeExporter, Items.DIAMOND_SWORD, RecipeCategory.COMBAT, ModItems.REINFORCED_DIAMOND_SWORD);
        offerSteelUpgradeRecipe(recipeExporter, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_PICKAXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.DIAMOND_AXE, RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_AXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_SHOVEL);
        offerSteelUpgradeRecipe(recipeExporter, Items.DIAMOND_HOE, RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_HOE);
//REINFORCED GOLDEN SET:
        offerSteelUpgradeRecipe(recipeExporter, Items.GOLDEN_SWORD, RecipeCategory.COMBAT, ModItems.REINFORCED_GOLDEN_SWORD);
        offerSteelUpgradeRecipe(recipeExporter, Items.GOLDEN_PICKAXE, RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_PICKAXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.GOLDEN_AXE, RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_AXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.GOLDEN_SHOVEL, RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_SHOVEL);
        offerSteelUpgradeRecipe(recipeExporter, Items.GOLDEN_HOE, RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_HOE);
//REINFORCED IRON SET:
        offerSteelUpgradeRecipe(recipeExporter, Items.IRON_SWORD, RecipeCategory.COMBAT, ModItems.REINFORCED_IRON_SWORD);
        offerSteelUpgradeRecipe(recipeExporter, Items.IRON_PICKAXE, RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_PICKAXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.IRON_AXE, RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_AXE);
        offerSteelUpgradeRecipe(recipeExporter, Items.IRON_SHOVEL, RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_SHOVEL);
        offerSteelUpgradeRecipe(recipeExporter, Items.IRON_HOE, RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_HOE);
//REINFORCED STEEL SET:
        offerSteelUpgradeRecipe(recipeExporter, ModItems.STEEL_SWORD, RecipeCategory.COMBAT, ModItems.REINFORCED_STEEL_SWORD);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.STEEL_PICKAXE, RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_PICKAXE);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.STEEL_AXE, RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_AXE);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.STEEL_SHOVEL, RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_SHOVEL);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.STEEL_HOE, RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_HOE);
//REINFORCED OBSIDIAN SET:
        offerSteelUpgradeRecipe(recipeExporter, ModItems.OBSIDIAN_SWORD, RecipeCategory.COMBAT, ModItems.REINFORCED_OBSIDIAN_SWORD);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.OBSIDIAN_PICKAXE, RecipeCategory.TOOLS, ModItems.REINFORCED_OBSIDIAN_PICKAXE);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.OBSIDIAN_AXE, RecipeCategory.TOOLS, ModItems.REINFORCED_OBSIDIAN_AXE);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.OBSIDIAN_SHOVEL, RecipeCategory.TOOLS, ModItems.REINFORCED_OBSIDIAN_SHOVEL);
        offerSteelUpgradeRecipe(recipeExporter, ModItems.OBSIDIAN_HOE, RecipeCategory.TOOLS, ModItems.REINFORCED_OBSIDIAN_HOE);


    }
    public static void offerSteelUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.STEEL_INGOT), category, result
                )
                .criterion("has_steel_ingot", conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, getItemPath(result) + "_smithing");

    }

}
