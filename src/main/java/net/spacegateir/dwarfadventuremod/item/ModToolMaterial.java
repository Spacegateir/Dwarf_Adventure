package net.spacegateir.dwarfadventuremod.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;

import java.util.function.Supplier;

import static net.fabricmc.yarn.constants.MiningLevels.NETHERITE;

public enum ModToolMaterial implements ToolMaterial {
    DWARF_STEEL(MiningLevels.IRON, 300, 6.0f, 2.5f, 16,
            () -> Ingredient.ofItems(ModItems.HOT_INGOT)),

    DWARF_GOLD(MiningLevels.IRON, 128, 12.0f, 0.0f, 30,
            () -> Ingredient.ofItems(ModItems.MOLTEN_DWARF_GOLD_INGOT)),

    QUINTESSENCE(MiningLevels.DIAMOND,1750,8,3.5f,18,
            () -> Ingredient.ofItems(ModItems.ELEMENTAL_GEM)),

    AER(MiningLevels.DIAMOND,500,16,3.5f,18,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_AER)),

    IGNIS(MiningLevels.DIAMOND,850,8,6.0f,18,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_IGNIS)),

    AQUA(MiningLevels.DIAMOND,1750,10,4.5f,10,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_AQUA)),

    TERA(MiningLevels.DIAMOND,3500,4,3.5f,5,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_TERA)),

    MAGIRITE(NETHERITE,2300, 9.0F, 4.5F, 18,
            () -> Ingredient.ofItems(ModItems.MOLTEN_MAGIRITE_INGOT)),

    MYTHRIL(5,2500,10,5.0F,30,
            () -> Ingredient.ofItems(ModItems.PUREFICATED_MYTHRIL)),

    ADAMANTITE(6,3000,11,5.5F,20,
            () -> Ingredient.ofItems(ModItems.MOLTEN_ADAMANTITE_INGOT)),

    ORIKALKUM(7,3500,12,6.0F,25,
            () -> Ingredient.ofItems(ModItems.MOLTEN_ORIKALKUM_INGOT)),

    DRAGON_BANE(8,5000,13,7F,10000,
            () -> Ingredient.ofItems(ModItems.MOLTEN_DRAGON_BANE_INGOT)),

    WAR_HAMMER(4,2500,10,10.0F,30,
            () -> Ingredient.ofItems(Items.NETHERITE_BLOCK)),

    DWARF_HAMMER(6, 5000,13,0F,60,
            () -> Ingredient.ofItems(ModBlocks.ADAMANTITE_BLOCK)),

    PRESSURE_HAMMER(8,7500,15,0F,100,
            () -> Ingredient.ofItems(ModBlocks.DRAGON_BANE_BLOCK));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
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
    public int getMiningLevel() {
        return this.miningLevel;
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
