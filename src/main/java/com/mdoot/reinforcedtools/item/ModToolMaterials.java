package com.mdoot.reinforcedtools.item;

import com.google.common.base.Suppliers;
import com.mdoot.reinforcedtools.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    REINFORCED_NETHERITE(ModTags.Blocks.INCORRECT_FOR_REINFORCED_NETHERITE_TOOL,
            4062, 10.0F, 5.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    REINFORCED_DIAMOND(ModTags.Blocks.INCORRECT_FOR_REINFORCED_DIAMOND_TOOL,
            3122, 9.0F, 4.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
    REINFORCED_GOLD(ModTags.Blocks.INCORRECT_FOR_REINFORCED_GOLDEN_TOOL,
            64, 13.0F, 1.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    REINFORCED_IRON(ModTags.Blocks.INCORRECT_FOR_REINFORCED_IRON_TOOL,
            500, 7.0F, 3.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    REINFORCED_STEEL(ModTags.Blocks.INCORRECT_FOR_REINFORCED_STEEL_TOOL,
            614, 6.5F, 2.5F, 14, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    STEEL(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            312, 6.5F, 2.5F, 14, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    OBSIDIAN(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL,
            1281, 7.0F, 5.0F, 20, () -> Ingredient.ofItems(ModItems.OBSIDIAN_SHARD)),
    REINFORCED_OBSIDIAN(ModTags.Blocks.INCORRECT_FOR_OBSIDIAN_TOOL,
            2562, 8.25F, 6.0F, 22, () -> Ingredient.ofItems(ModItems.OBSIDIAN_SHARD));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}