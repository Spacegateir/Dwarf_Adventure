package net.spacegateir.dwarfadventuremod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShearsItem;

public class PlantShrederEnchantment extends Enchantment {

    private final ModEnchantmentTarget modTarget;

    public PlantShrederEnchantment(Rarity weight, ModEnchantmentTarget modTarget, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.BREAKABLE, slotTypes); // Use a generic target like BREAKABLE
        this.modTarget = modTarget;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return modTarget.isAcceptableItem(stack.getItem()); // Check if item matches the custom target
    }

    @Override
    public int getMinPower(int level) {
        return 10 + (level - 1) * 10;
    }

    @Override
    public int getMaxPower(int level) {
        return getMinPower(level) + 15;
    }

    @Override
    public int getMaxLevel() {
        return 1; // Max level of the enchantment
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof MendingEnchantment || other instanceof EarthSplitterEnchantment ||
                other instanceof LumberJackEnchantment || other instanceof VeinMinerEnchantment)
                && super.canAccept(other);}


    @Override
    public boolean isTreasure() {
        return false; // Not a treasure enchantment
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return true; // Allows this enchantment to be offered in villager trades
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return true; // Allows the enchantment to appear in the enchantment table
    }
}
