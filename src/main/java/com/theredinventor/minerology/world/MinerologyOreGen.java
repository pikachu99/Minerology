package com.theredinventor.minerology.world;

import com.theredinventor.minerology.init.MinerologyBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class MinerologyOreGen {
    public static void generationOres(final BiomeLoadingEvent event) {
        if (!event.getCategory().equals(Biome.Category.THEEND) && event.getCategory().equals(Biome.Category.NETHER)) {
            generationSettings(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                    MinerologyBlocks.Actinium_Ore.get().getDefaultState(),6, 5, 25, 3);
        }
        //if(event.getCategory().equals(MinerologyDimensions.UNDERGROUND)){
        //    generationSettings()
        //}
    }
    private static void generationSettings(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize,
                                           int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration
                (new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(Placement.RANGE.configure
                (new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().count(amount));
    }
}
