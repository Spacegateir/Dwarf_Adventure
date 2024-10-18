package net.spacegateir.dwarfadventuremod.CauldronConversions;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.item.ModItems;

public class LavaCauldronRecipes {
    public static ActionResult handleLavaCauldronRecipes(BlockState blockState, World level, BlockPos blockPos, PlayerEntity player, Hand hand, ItemStack stack) {
        // Check if the cauldron is filled with lava
        if (!blockState.isOf(Blocks.LAVA_CAULDRON)) {
            return ActionResult.PASS; // If the block is not a lava cauldron, return pass to allow block placement
        }

        // Ensure we are on the server side
        if (level.isClient) {
            return ActionResult.PASS; // Client-side logic, return pass
        }

        // Handle the recipes
        //Dwarf Steel
        if (stack.isOf(ModItems.DWARF_STEEL_INGOT)) {
            return handleHotIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_DWARF_STEEL)) {
            return handleHotIngotConversion(stack, player, blockPos, level);
        }
        // Are
        if (stack.isOf(ModItems.AER_SPIRIT_INGOT)) {
            return handleForgeHotAerIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_AER_SPIRITSTONE)) {
            return handleForgeHotAerIngotConversion(stack, player, blockPos, level);
        }
        // Ignis
        if (stack.isOf(ModItems.IGNIS_SPIRIT_INGOT)) {
            return handleForgeHotIgnisIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_IGNIS_SPIRITSTONE)) {
            return handleForgeHotIgnisIngotConversion(stack, player, blockPos, level);
        }
        // Aqua
        if (stack.isOf(ModItems.AQUA_SPIRIT_INGOT)) {
            return handleForgeHotAquaIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_AQUA_SPIRITSTONE)) {
            return handleForgeHotAquaIngotConversion(stack, player, blockPos, level);
        }
        // Tera
        if (stack.isOf(ModItems.TERA_SPIRIT_INGOT)) {
            return handleForgeHotTeraIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_TERA_SPIRITSTONE)) {
            return handleForgeHotTeraIngotConversion(stack, player, blockPos, level);
        }
        // Magirite
        if (stack.isOf(ModItems.MAGIRITE_INGOT)) {
            return handleForgeHotMagiriteIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_MAGIRITE)) {
            return handleForgeHotMagiriteIngotConversion(stack, player, blockPos, level);
        }
        // Adamanitite
        if (stack.isOf(ModItems.ADAMANTITE_INGOT)) {
            return handleForgeHotAdamantiteIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_ADAMANTITE)) {
            return handleForgeHotAdamantiteIngotConversion(stack, player, blockPos, level);
        }
        // Orikalkum
        if (stack.isOf(ModItems.ORIKALKUM_INGOT)) {
            return handleForgeHotOrikalkumIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_ORIKALKUM)) {
            return handleForgeHotOrikalkumIngotConversion(stack, player, blockPos, level);
        }
        // Dragon Bane
        if (stack.isOf(ModItems.DRAGON_BANE_INGOT)) {
            return handleForgeHotDragonIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_DRAGON_BANE)) {
            return handleForgeHotDragonIngotConversion(stack, player, blockPos, level);
        }
        // Dwarf Gold
        if (stack.isOf(ModItems.DWARF_GOLD_INGOT)) {
            return handleForgeHotDwarfGoldIngotConversion(stack, player, blockPos, level);
        }
        if (stack.isOf(ModItems.CLUMP_OF_DWARF_GOLD)) {
            return handleForgeHotDwarfGoldIngotConversion(stack, player, blockPos, level);
        }

//        if (stack.isOf(Items.RAW_IRON)) {
//            return handleRawIronConversion(stack, player, blockPos, level);
//        }

        // If no recipe matches, return pass to allow block placement
        return ActionResult.PASS;
    }

    private static ActionResult handleHotIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.HOT_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotAerIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.FORGING_HOT_AER);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotIgnisIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.FORGING_HOT_IGNIS);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotAquaIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.FORGING_HOT_AQUA);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotTeraIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.FORGING_HOT_TERA);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotMagiriteIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.MOLTEN_MAGIRITE_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotAdamantiteIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.MOLTEN_ADAMANTITE_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotOrikalkumIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.MOLTEN_ORIKALKUM_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotDragonIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.MOLTEN_DRAGON_BANE_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }

    private static ActionResult handleForgeHotDwarfGoldIngotConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
        stack.decrement(1); // Decrease the stack of hot ingots by 1
        ItemStack dwarfIngot = new ItemStack(ModItems.MOLTEN_DWARF_GOLD_INGOT);

        // Try to add the dwarf ingot to the player's inventory
        if (!player.getInventory().insertStack(dwarfIngot)) {
            player.dropItem(dwarfIngot, false); // Drop if inventory is full
        }

        // Play sounds
        level.playSound(null, blockPos, SoundEvents.BLOCK_CAMPFIRE_CRACKLE, SoundCategory.BLOCKS, 15.0F, 1.0F);

        return ActionResult.SUCCESS;
    }
//
//    private static ActionResult handleRawIronConversion(ItemStack stack, PlayerEntity player, BlockPos blockPos, World level) {
//        if (stack.getCount() <= 0) return ActionResult.FAIL; // Ensure there is an item to consume
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
