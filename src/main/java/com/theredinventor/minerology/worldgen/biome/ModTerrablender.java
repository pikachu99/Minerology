package com.theredinventor.minerology.worldgen.biome;

import com.theredinventor.minerology.Minerology;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(ResourceLocation.fromNamespaceAndPath(Minerology.MODID, "overworld"), 5));
    }
}
