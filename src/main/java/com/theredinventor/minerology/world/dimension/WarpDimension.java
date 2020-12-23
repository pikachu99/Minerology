package com.theredinventor.minerology.world.dimension;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;


public class WarpDimension{
    public static void Warp(ServerPlayerEntity player, DimensionType destinationType, BlockPos destinationPos ){
        ServerWorld nextWorld = player.getServer().getWorld(destinationType);
        nextWorld.getChunk(destinationPos);
        player.teleport(nextWorld, destinationPos.getX(), destinationPos.getY(), destinationPos.getZ(), player.rotationYaw,
                player.rotationPitch);
    }
}
