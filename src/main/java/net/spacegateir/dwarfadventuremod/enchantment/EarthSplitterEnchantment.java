package net.spacegateir.dwarfadventuremod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.MendingEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;

public class EarthSplitterEnchantment extends Enchantment {

    private final ModEnchantmentTarget modTarget;

    public EarthSplitterEnchantment(Rarity weight, ModEnchantmentTarget modTarget, EquipmentSlot... slotTypes) {
        super(weight, EnchantmentTarget.BREAKABLE, slotTypes); // Use a generic target like BREAKABLE
        this.modTarget = modTarget;
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return modTarget.isAcceptableItem(stack.getItem()); // Check if item matches the custom target
    }

    @Override
    public int getMinPower(int level) {
        return 10;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof MendingEnchantment || other instanceof PlantShrederEnchantment ||
                other instanceof LumberJackEnchantment || other instanceof VeinMinerEnchantment)
                && super.canAccept(other);}

    @Override
    public boolean isTreasure() {
        return false;
    }

    @Override
    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    @Override
    public boolean isAvailableForRandomSelection() {
        return false;
    }
}
