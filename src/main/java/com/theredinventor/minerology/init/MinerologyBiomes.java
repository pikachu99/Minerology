package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.world.biomes.CaveBiome;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MinerologyBiomes {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, Minerology.MOD_ID);

    public static final RegistryObject<Biome> CAVE = BIOMES.register("cave", () -> new CaveBiome(new Biome.Builder().precipitation(Biome.RainType.NONE).scale(0f).temperature(1.0f).waterColor(0x68a0b0).waterFogColor(0x68a0b0)
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState()))
            .category(Biome.Category.NONE).downfall(0f).depth(0.12f).parent(null)));
    public static void registerBiome(){
        registerBiome(CAVE.get(), BiomeDictionary.Type.DRY);
    }
    private static void registerBiome(Biome biome, BiomeDictionary.Type... types){
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }
}
