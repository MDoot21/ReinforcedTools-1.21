package com.mdoot.reinforcedtools.datagen;

import com.mdoot.reinforcedtools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture){
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.REINFORCED_NETHERITE_SWORD)
                .add(ModItems.REINFORCED_DIAMOND_SWORD)
                .add(ModItems.REINFORCED_GOLD_SWORD)
                .add(ModItems.REINFORCED_IRON_SWORD)
                .add(ModItems.REINFORCED_STEEL_SWORD)
                .add(ModItems.STEEL_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.REINFORCED_NETHERITE_PICKAXE)
                .add(ModItems.REINFORCED_DIAMOND_PICKAXE)
                .add(ModItems.REINFORCED_GOLD_PICKAXE)
                .add(ModItems.REINFORCED_IRON_PICKAXE)
                .add(ModItems.REINFORCED_STEEL_PICKAXE)
                .add(ModItems.STEEL_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.REINFORCED_NETHERITE_AXE)
                .add(ModItems.REINFORCED_DIAMOND_AXE)
                .add(ModItems.REINFORCED_GOLD_AXE)
                .add(ModItems.REINFORCED_IRON_AXE)
                .add(ModItems.REINFORCED_STEEL_AXE)
                .add(ModItems.STEEL_AXE);


        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.REINFORCED_NETHERITE_SHOVEL)
                .add(ModItems.REINFORCED_DIAMOND_SHOVEL)
                .add(ModItems.REINFORCED_GOLD_SHOVEL)
                .add(ModItems.REINFORCED_IRON_SHOVEL)
                .add(ModItems.REINFORCED_STEEL_SHOVEL)
                .add(ModItems.STEEL_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.REINFORCED_NETHERITE_HOE)
                .add(ModItems.REINFORCED_DIAMOND_HOE)
                .add(ModItems.REINFORCED_GOLD_HOE)
                .add(ModItems.REINFORCED_IRON_HOE)
                .add(ModItems.REINFORCED_STEEL_HOE)
                .add(ModItems.STEEL_HOE);
    }
}
