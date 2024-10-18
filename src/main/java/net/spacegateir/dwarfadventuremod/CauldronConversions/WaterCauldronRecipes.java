package net.spacegateir.dwarfadventuremod.CauldronConversions;

import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.spacegateir.dwarfadventuremod.item.ModItems;

public class WaterCauldronRecipes {
    public static ActionResult handleWaterCauldronRecipes(BlockState blockState, World level, BlockPos blockPos, PlayerEntity player, Hand hand, ItemStack stack) {
        // Check if the cauldron is filled with water
        if (!blockState.isOf(Blocks.WATER_CAULDRON)) {
            return ActionResult.PASS; // If the block is not a water cauldron, return pass to allow block placement
        }
        // Ensure we are on the server side
        if (level.isClient) {
            return ActionResult.PASS; // Client-side logic, return pass
        }
        // Dwarf Steel (Hot Ingot)
        if (stack.isOf(ModItems.HOT_INGOT)) {
            return handleHotIngotConversion(stack, player, blockPos, level);
        }
        // Aer (Forgeing Hot Aer)
        if (stack.isOf(ModItems.FORGING_HOT_AER)) {
            return handleAerIngotConversion(stack, player, blockPos, level);
        }
        // Ignis (Forgeing Hot Ignis)
        if (stack.isOf(ModItems.FORGING_HOT_IGNIS)) {
            return handleIgnisIngotConversion(stack, player, blockPos, level);
        }
        // Aqua (Forgeing Hot Aqua)
        if (stack.isOf(ModItems.FORGING_HOT_AQUA)) {
            return handleAquaIngotConversion(stack, player, blockPos, level);
        }
        // Tera (Forgeing Hot Tera)
        if (stack.isOf(ModItems.FORGING_HOT_TERA)) {
            return handleTeraIngotConversion(stack, player, blockPos, level);
        }
        // Magirite (Molten Magirite Ingot)
        if (stack.isOf(ModItems.MOLTEN_MAGIRITE_INGOT)) {
            return handleMagiriteIngotConversion(stack, player, blockPos, level);
        }
        // Adamantite (Molten Adamantite Ingot)
        if (stack.isOf(ModItems.MOLTEN_ADAMANTITE_INGOT)) {
            return handleAdamantiteIngotConversion(stack, player, blockPos, level);
        }
        // Orikalkum (Molten Orikalkum Ingot)
        if (stack.isOf(ModItems.MOLTEN_ORIKALKUM_INGOT)) {
            return handleOrikalkumIngotConversion(stack, player, blockPos, level);
        }
        // Dragon Bane (Molten Dragon Bane Ingot)
        if (stack.isOf(ModItems.MOLTEN_DRAGON_BANE_INGOT)) {
            return handleDragonIngotConversion(stack, player, blockPos, level);
        }
        // Dwarf Gold (Molten Dwarf Gold Ingot)
        if (stack.isOf(ModItems.MOLTEN_DWARF_GOLD_INGOT)) {
            return handleDwarfGoldIngotConversion(stack, player, blockPos, level);
        }


        // Handle the recipes
        if (stack.isOf(ModItems.HOT_DWARF_PICKAXE_HEAD)) {
            return handleHotPickaxeHeadConversion(stack, player, blockPos, level);
        }
//        if (stack.isOf(Items.RAW_IRON)) {
//            return handleRawIronConversion(stack, player, blockPos, level);
//        }

        // If no recipe matches, return pass to allow block placement
        return ActionResult.PASS;
    }

    private static ActionResult handleHotIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.DWARF_STEEL_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleAerIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.AER_SPIRIT_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleIgnisIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.IGNIS_SPIRIT_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleAquaIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.AQUA_SPIRIT_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleTeraIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.TERA_SPIRIT_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleMagiriteIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.MAGIRITE_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleAdamantiteIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.ADAMANTITE_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleOrikalkumIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.ORIKALKUM_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleDragonIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.DRAGON_BANE_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleDwarfGoldIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.DWARF_GOLD_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }





    private static ActionResult handleHotPickaxeHeadConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.DWARF_STEEL_PICKAXE_HEAD);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

//    private static ActionResult handleRawIronConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
//        stack.decrement(1); // Decrease the stack of raw iron by 1
//
//        // Create two iron ingots
//        ItemStack dwarfIngot1 = new ItemStack(Items.IRON_INGOT);
//        ItemStack dwarfIngot2 = new ItemStack(Items.IRON_INGOT);
//
//        // Try to add both iron ingots to the player's inventory
//        if (!player.getInventory().insertStack(dwarfIngot1)) {
//            player.dropItem(dwarfIngot1, false); // Drop if inventory is full
//        }
//
//        if (!player.getInventory().insertStack(dwarfIngot2)) {
//            player.dropItem(dwarfIngot2, false); // Drop if inventory is full
//        }
//
//        // Play sounds
//        level.playSound(null, blockPos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F);
//
//        return ActionResult.SUCCESS;
//    }

}
