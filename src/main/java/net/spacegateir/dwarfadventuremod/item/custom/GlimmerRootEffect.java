package net.spacegateir.dwarfadventuremod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.spacegateir.dwarfadventuremod.block.ModBlocks;
import net.spacegateir.dwarfadventuremod.item.ModItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GlimmerRootEffect extends Item {

    public GlimmerRootEffect(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();

        if (!world.isClient && player != null) {
            // The item consumes itself
            context.getStack().decrement(1);

            // Drop random items or blocks from the list
            Random random = new Random();
            List<ItemConvertible> modItemsAndBlocksList = new ArrayList<>(List.of(
                    // Blocks from ModBlocks
                    ModBlocks.ANCIENT_CARNATION_FLOWER,
                    ModBlocks.ANCIENT_AGAPANTHUS_FLOWER,
                    ModBlocks.ANCIENT_SNOW_DROP_FLOWER,
                    ModBlocks.ANCIENT_SPIDERLILY_FLOWER,
                    ModBlocks.ANCIENT_VIOLET_FLOWER,
                    ModBlocks.ANCIENT_BLUE_COSMOS_FLOWER,
                    ModBlocks.ANCIENT_BONSAI_FLOWER,
                    ModBlocks.ANCIENT_HYDRANGEA_FLOWER,
                    ModBlocks.ANCIENT_IRIS_FLOWER,
                    ModBlocks.ANCIENT_PRIMROSE_FLOWER,
                    ModBlocks.ANCIENT_DAFFODIL_FLOWER,
                    ModBlocks.ANCIENT_DELPHINIUM_FLOWER,
                    ModBlocks.ANCIENT_DAHLIA_FLOWER,
                    ModBlocks.ANCIENT_MIDNIGHT_MYSTIC_FLOWER,
                    ModBlocks.ANCIENT_HAWTHORN_FLOWER,
                    ModBlocks.ANCIENT_LARKSPUR_FLOWER,

                    // Items from ModItems
                    ModItems.ANCIENT_BRANCH

            ));

            int itemsToDrop = random.nextInt(5); // Random number between 0 and 5 (how to get between 1 and 8 (8) + 1;))

            for (int i = 0; i < itemsToDrop; i++) {
                ItemConvertible randomItemOrBlock = modItemsAndBlocksList.get(random.nextInt(modItemsAndBlocksList.size()));
                ItemStack itemStack = new ItemStack(randomItemOrBlock);

                BlockPos pos = context.getBlockPos().add(0, 1, 0); // Spawn above the clicked block
                ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), itemStack);
                world.spawnEntity(itemEntity);
            }

            // Optional: Play a sound when the effect happens
            world.playSound(null, player.getBlockPos(), SoundEvents.ENTITY_FIREWORK_ROCKET_LAUNCH, SoundCategory.PLAYERS, 1.0F, 1.0F);

            return ActionResult.SUCCESS;
        }

        return ActionResult.FAIL;
    }
}
