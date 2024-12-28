package net.spacegateir.dwarfadventuremod.block.entity.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.spacegateir.dwarfadventuremod.block.entity.ModBlockEntities;

public class CoverBlockEntity extends BlockEntity {

    private boolean isStoneTexture;

    public CoverBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COVER_BLOCK_BE, pos, state);
        this.isStoneTexture = false; // Initial texture state
    }

    public boolean hasStoneTexture() {
        return isStoneTexture;
    }

    public void toggleTexture() {
        isStoneTexture = !isStoneTexture;
        markDirty(); // Mark the entity as dirty to save the new state

        // If this is on the server side, notify the client
        if (!world.isClient) {
            world.updateListeners(pos, getCachedState(), getCachedState(), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        isStoneTexture = nbt.getBoolean("isStoneTexture");
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putBoolean("isStoneTexture", isStoneTexture);
    }

}
