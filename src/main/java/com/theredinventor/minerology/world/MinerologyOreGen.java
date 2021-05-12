package com.theredinventor.minerology.world;

import com.theredinventor.minerology.init.MinerologyBlocks;
import com.theredinventor.minerology.world.biomes.CaveBiome;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class MinerologyOreGen {
    public static void generationOre(){
        for(Biome biome : ForgeRegistries.BIOMES){
            if(biome instanceof CaveBiome) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                        (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Actinium_Ore.get().getDefaultState(), 4))
                        .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 3, 5, 20))));
            }
        }
        for(Biome biome : ForgeRegistries.BIOMES){
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Actinium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Aluminum_Ore.get().getDefaultState(), 10))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 0, 0, 60))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Amber_Ore.get().getDefaultState(), 5))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(4, 0, 0, 32))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Antimony_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Apatite_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Arctite_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Balonium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Barite_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Barium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Beryllium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Bismuth_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Burptonium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Caesium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Calcium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Cerium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Chromium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Cinnabar_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Copper_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Craintum_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Dysprosium_Ore.get().getDefaultState(), 10))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 0, 0, 60))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Erbium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Fluorite_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Gadolinium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Gallium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Gingerite_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Holmium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Jenite_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Lanthanum_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Lead_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Lithium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Lutetium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Magnesium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Manganese_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Nickel_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Osmium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Palladium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Phosphorus_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Platinum_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Pootonium_Ore.get().getDefaultState(), 10))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 0, 0, 60))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Popularite_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Potassium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Praseodymium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Radium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Rhodium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Rubidium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Ruby_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Samarium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Sapphire_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Silicon_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Silver_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Sodium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Ssundium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Sulfur_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Tantalum_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Terbium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Theanum_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Thulium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Tin_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Titanium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Uranium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Yttrium_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig
                    (OreFeatureConfig.FillerBlockType.NATURAL_STONE, MinerologyBlocks.Zinc_Ore.get().getDefaultState(), 6))
                    .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 5, 0, 25))));
        }
    }
}
