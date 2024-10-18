package net.spacegateir.dwarfadventuremod.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class MortarAndPestleItem extends Item {
    public static final int MAX_DURABILITY = 64;

    public MortarAndPestleItem(Settings settings) {
        super(settings.maxDamage(MAX_DURABILITY)); // Set max durability
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        // This method is called when the item is used on a block.
        if (!context.getWorld().isClient) {
            // Damage the item by 1 when used
            context.getStack().damage(1, context.getPlayer(), (player) -> player.sendToolBreakStatus(context.getHand()));
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        // Create a copy of the current ItemStack to modify
        ItemStack remainder = stack.copy();
        // Increment the damage by 1
        remainder.setDamage(remainder.getDamage() + 1);
        // Return the damaged ItemStack
        return remainder;
    }
}
