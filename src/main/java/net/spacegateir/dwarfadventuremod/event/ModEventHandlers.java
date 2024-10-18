package net.spacegateir.dwarfadventuremod.event;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.spacegateir.dwarfadventuremod.CauldronConversions.LavaCauldronRecipes;
import net.spacegateir.dwarfadventuremod.CauldronConversions.WaterCauldronRecipes;

public class ModEventHandlers {

    public static void registerBlockInteractionEvent() {
        UseBlockCallback.EVENT.register((PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) -> {
            BlockPos blockPos = hitResult.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);

            // Get the item the player is holding
            ItemStack heldItem = player.getStackInHand(hand);

            // Check if the block is a water cauldron
            if (blockState.isOf(Blocks.WATER_CAULDRON)) {
                // Call the cauldron recipes
                ActionResult result = WaterCauldronRecipes.handleWaterCauldronRecipes(blockState, world, blockPos, player, hand, heldItem);

                // If it returns a result that indicates a recipe was handled, return that result
                if (result != ActionResult.PASS) {
                    return result; // Return whatever result was received from the recipes
                }
            }

            // Check if the block is a water cauldron
            if (blockState.isOf(Blocks.LAVA_CAULDRON)) {
                // Call the cauldron recipes
                ActionResult result = LavaCauldronRecipes.handleLavaCauldronRecipes(blockState, world, blockPos, player, hand, heldItem);

                // If it returns a result that indicates a recipe was handled, return that result
                if (result != ActionResult.PASS) {
                    return result; // Return whatever result was received from the recipes
                }
            }

            // If the block is not a cauldron or recipes didn't handle it, allow normal block placement
            return ActionResult.PASS; // Allow normal block placement to occur
        });
    }
}
