package com.mdoot.reinforcedtools.datagen;

import com.mdoot.reinforcedtools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
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
//REINFORCED_STEEL_SET:
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_PICKAXE)
                .pattern("TTT")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_AXE)
                .pattern("TT")
                .pattern("RT")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_SHOVEL)
                .pattern("T")
                .pattern("R")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_STEEL_HOE)
                .pattern("TT")
                .pattern("R ")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(recipeExporter);
//REINFORCED_DIAMOND_SET:
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.DIAMOND)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_PICKAXE)
                .pattern("TTT")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.DIAMOND)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_AXE)
                .pattern("TT")
                .pattern("RT")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.DIAMOND)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_SHOVEL)
                .pattern("T")
                .pattern("R")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.DIAMOND)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_DIAMOND_HOE)
                .pattern("TT")
                .pattern("R ")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.DIAMOND)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(recipeExporter);
//REINFORCED_GOLDEN_SET:
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.GOLD_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_PICKAXE)
                .pattern("TTT")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.GOLD_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_AXE)
                .pattern("TT")
                .pattern("RT")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.GOLD_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_SHOVEL)
                .pattern("T")
                .pattern("R")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.GOLD_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_GOLDEN_HOE)
                .pattern("TT")
                .pattern("R ")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.GOLD_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(recipeExporter);
//REINFORCED_IRON_SET:
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_SWORD)
                .pattern("T")
                .pattern("T")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_PICKAXE)
                .pattern("TTT")
                .pattern(" R ")
                .pattern(" R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_AXE)
                .pattern("TT")
                .pattern("RT")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_SHOVEL)
                .pattern("T")
                .pattern("R")
                .pattern("R")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.REINFORCED_IRON_HOE)
                .pattern("TT")
                .pattern("R ")
                .pattern("R ")
                .input('R', ModItems.STEEL_ROD)
                .input('T', Items.IRON_INGOT)
                .criterion(hasItem(ModItems.STEEL_ROD), conditionsFromItem(ModItems.STEEL_ROD))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
    }
}
