package net.spacegateir.dwarfadventuremod.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.item.*;
import net.spacegateir.dwarfadventuremod.item.custom.PaxelItem;

public class ModEnchantmentTarget {

    public static final ModEnchantmentTarget HOE_SHEARS_PAXEL = new ModEnchantmentTarget() {
        @Override
        public boolean isAcceptableItem(Item item) {
            return item == Items.SHEARS || item instanceof ShearsItem || item instanceof HoeItem || item instanceof PaxelItem;
        }
    };

    public static final ModEnchantmentTarget AXE_OR_PAXEL = new ModEnchantmentTarget() {
        @Override
        public boolean isAcceptableItem(Item item) {
            return item instanceof AxeItem || item instanceof PaxelItem;
        }
    };

    public static final ModEnchantmentTarget PICAXE_OR_PAXEL = new ModEnchantmentTarget() {
        @Override
        public boolean isAcceptableItem(Item item) {
            return item instanceof PickaxeItem || item instanceof PaxelItem;
        }
    };

    // Default constructor
    protected ModEnchantmentTarget() {}

    // Override this method in each target to specify acceptable items
    public boolean isAcceptableItem(Item item) {
        return false;
    }
}
