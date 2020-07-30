package com.theredinventor.minerology.world;

import com.theredinventor.minerology.init.MinerologyBlocks;
import com.theredinventor.minerology.init.MinerologyItems;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class MinerologyOreGen {
    public static void generationOre(){
        for(Biome biome : ForgeRegistries.BIOMES){
            ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(7, 1, 1, 10));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                    Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            MinerologyBlocks.Actinium_Ore.get().getDefaultState(), 10)).withPlacement(customConfig));
        }
    }
}
