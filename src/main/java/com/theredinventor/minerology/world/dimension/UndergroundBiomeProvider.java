package com.theredinventor.minerology.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.theredinventor.minerology.init.MinerologyBiomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Random;
import java.util.Set;

public class UndergroundBiomeProvider extends BiomeProvider {

    private Random rand;

    public UndergroundBiomeProvider() {
        super(biomeList);
        rand = new Random();
    }

    private static final Set<Biome> biomeList = ImmutableSet.of(MinerologyBiomes.CAVE.get());

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return MinerologyBiomes.CAVE.get();
    }
}
