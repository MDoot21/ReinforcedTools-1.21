package com.mdoot.reinforcedtools.item;

import com.mdoot.reinforcedtools.ReinforcedTools;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_ROD = registerItem("steel_rod", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SHARD = registerItem("obsidian_shard", new Item(new Item.Settings()));
    public static final Item THICK_STICK = registerItem("thick_stick", new Item(new Item.Settings()));

    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword",
            new SwordItem(ModToolMaterials.OBSIDIAN, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 3, -2.4f))));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe",
            new PickaxeItem(ModToolMaterials.OBSIDIAN, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 1.0F, -2.8F))));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe",
            new AxeItem(ModToolMaterials.OBSIDIAN, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 5.0F, -3.0F))));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel",
            new ShovelItem(ModToolMaterials.OBSIDIAN, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 1.5F, -3.0F))));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe",
            new HoeItem(ModToolMaterials.OBSIDIAN, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, -4.0F, 0.0F))));

    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL, 3, -2.4f))));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 1.0F, -2.8F))));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STEEL, 5.0F, -3.0F))));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL, 1.5F, -3.0F))));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterials.STEEL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STEEL, -4.0F, 0.0F))));

    public static final Item REINFORCED_STEEL_SWORD = registerItem("reinforced_steel_sword",
            new SwordItem(ModToolMaterials.REINFORCED_STEEL, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.REINFORCED_STEEL, 3, -2.4f))));
    public static final Item REINFORCED_STEEL_PICKAXE = registerItem("reinforced_steel_pickaxe",
            new PickaxeItem(ModToolMaterials.REINFORCED_STEEL, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_STEEL, 1.0F, -2.8F))));
    public static final Item REINFORCED_STEEL_AXE = registerItem("reinforced_steel_axe",
            new AxeItem(ModToolMaterials.REINFORCED_STEEL, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_STEEL, 5.0F, -3.0F))));
    public static final Item REINFORCED_STEEL_SHOVEL = registerItem("reinforced_steel_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_STEEL, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REINFORCED_STEEL, 1.5F, -3.0F))));
    public static final Item REINFORCED_STEEL_HOE = registerItem("reinforced_steel_hoe",
            new HoeItem(ModToolMaterials.REINFORCED_STEEL, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_STEEL, -4.0F, 0.0F))));

    public static final Item REINFORCED_IRON_SWORD = registerItem("reinforced_iron_sword",
            new SwordItem(ModToolMaterials.REINFORCED_IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.REINFORCED_IRON, 3, -2.4f))));
    public static final Item REINFORCED_IRON_PICKAXE = registerItem("reinforced_iron_pickaxe",
            new PickaxeItem(ModToolMaterials.REINFORCED_IRON, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_IRON, 1.0F, -2.8F))));
    public static final Item REINFORCED_IRON_AXE = registerItem("reinforced_iron_axe",
            new AxeItem(ModToolMaterials.REINFORCED_IRON, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_IRON, 5.0F, -3.0F))));
    public static final Item REINFORCED_IRON_SHOVEL = registerItem("reinforced_iron_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_IRON, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REINFORCED_IRON, 1.5F, -3.0F))));
    public static final Item REINFORCED_IRON_HOE = registerItem("reinforced_iron_hoe",
            new HoeItem(ModToolMaterials.REINFORCED_IRON, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_IRON, -4.0F, 0.0F))));

    public static final Item REINFORCED_GOLDEN_SWORD = registerItem("reinforced_golden_sword",
            new SwordItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 3, -2.4f))));
    public static final Item REINFORCED_GOLDEN_PICKAXE = registerItem("reinforced_golden_pickaxe",
            new PickaxeItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 1.0F, -2.8F))));
    public static final Item REINFORCED_GOLDEN_AXE = registerItem("reinforced_golden_axe",
            new AxeItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 5.0F, -3.0F))));
    public static final Item REINFORCED_GOLDEN_SHOVEL = registerItem("reinforced_golden_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, 1.5F, -3.0F))));
    public static final Item REINFORCED_GOLDEN_HOE = registerItem("reinforced_golden_hoe",
            new HoeItem(ModToolMaterials.REINFORCED_GOLD, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_GOLD, -4.0F, 0.0F))));

    public static final Item REINFORCED_DIAMOND_SWORD = registerItem("reinforced_diamond_sword",
            new SwordItem(ModToolMaterials.REINFORCED_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.REINFORCED_DIAMOND, 3, -2.4f))));
    public static final Item REINFORCED_DIAMOND_PICKAXE = registerItem("reinforced_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.REINFORCED_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_DIAMOND, 1.0F, -2.8F))));
    public static final Item REINFORCED_DIAMOND_AXE = registerItem("reinforced_diamond_axe",
            new AxeItem(ModToolMaterials.REINFORCED_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_DIAMOND, 5.0F, -3.0F))));
    public static final Item REINFORCED_DIAMOND_SHOVEL = registerItem("reinforced_diamond_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REINFORCED_DIAMOND, 1.5F, -3.0F))));
    public static final Item REINFORCED_DIAMOND_HOE = registerItem("reinforced_diamond_hoe",
            new HoeItem(ModToolMaterials.REINFORCED_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_DIAMOND, -4.0F, 0.0F))));

    public static final Item REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword",
            new SwordItem(ModToolMaterials.REINFORCED_NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.REINFORCED_NETHERITE, 3, -2.4f))));
    public static final Item REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe",
            new PickaxeItem(ModToolMaterials.REINFORCED_NETHERITE, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_NETHERITE, 1.0F, -2.8F))));
    public static final Item REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe",
            new AxeItem(ModToolMaterials.REINFORCED_NETHERITE, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_NETHERITE, 5.0F, -3.0F))));
    public static final Item REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_NETHERITE, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.REINFORCED_NETHERITE, 1.5F, -3.0F))));
    public static final Item REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe",
            new HoeItem(ModToolMaterials.REINFORCED_NETHERITE, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.REINFORCED_NETHERITE, -4.0F, 0.0F))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ReinforcedTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ReinforcedTools.LOGGER.info("Registering Mod Items for " + ReinforcedTools.MOD_ID);

    }
}
