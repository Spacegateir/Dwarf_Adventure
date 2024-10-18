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
    DWARF_STEEL(MiningLevels.IRON, 500, 9.0f, 2.0f, 30,
            () -> Ingredient.ofItems(ModItems.HOT_INGOT)),

    QUINTESSENCE(MiningLevels.DIAMOND,3122,12,3.0f,30,
            () -> Ingredient.ofItems(ModItems.ELEMENTAL_GEM)),

    AER(MiningLevels.DIAMOND,3122,12,3.0f,30,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_AER)),

    IGNIS(MiningLevels.DIAMOND,3122,12,3.0f,30,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_IGNIS)),

    AQUA(MiningLevels.DIAMOND,3122,12,3.0f,30,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_AQUA)),

    TERA(MiningLevels.DIAMOND,3122,12,3.0f,30,
            () -> Ingredient.ofItems(ModItems.FORGING_HOT_TERA)),

    MAGIRITE(NETHERITE,4062,15,4.0f,30,
            () -> Ingredient.ofItems(ModItems.MOLTEN_MAGIRITE_INGOT)),

    MYTHRIL(5,8124,18,6.0f,60,
            () -> Ingredient.ofItems(ModItems.PUREFICATED_MYTHRIL)),

    ADAMANTITE(6,16248,21,8.0f,60,
            () -> Ingredient.ofItems(ModItems.MOLTEN_ADAMANTITE_INGOT)),

    ORIKALKUM(7,32496,24,10.0f,100,
            () -> Ingredient.ofItems(ModItems.MOLTEN_ORIKALKUM_INGOT)),

    DRAGON_BANE(8,32496,27,12.0f,10000,
            () -> Ingredient.ofItems(ModItems.MOLTEN_DRAGON_BANE_INGOT)),

    WAR_HAMMER(4,2500,10,10.0f,30,
            () -> Ingredient.ofItems(Items.NETHERITE_BLOCK)),

    DWARF_HAMMER(6, 5000,15,1f,60,
            () -> Ingredient.ofItems(ModBlocks.ADAMANTITE_BLOCK)),

    PRESSURE_HAMMER(8,7500,20,1.5f,100,
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
