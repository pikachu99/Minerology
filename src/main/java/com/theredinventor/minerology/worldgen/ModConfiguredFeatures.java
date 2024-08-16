package com.theredinventor.minerology.worldgen;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.BlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> Overworld_Actinium_Ore_Key = registerKey("actinium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Overworld_Aluminum_Ore_Key = registerKey("aluminum_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context){
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceable = new BlockMatchTest(Blocks.END_STONE);
        //Overworld Ores
        List<OreConfiguration.TargetBlockState> overworldActiniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Actinium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldAluminumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Aluminum_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldChromiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Chromium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldIridiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Iridium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Lead_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldLithiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Lithium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldMagnesiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Magnesium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldManganeseOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Manganese_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldMercuryOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Mercury_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Nickel_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldOsmiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Osmium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Platinum_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPoloniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Polonium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldRadiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Radium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Silver_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldThoriumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Thorium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Tin_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTungstenOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Tungsten_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Uranium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldZincOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Zinc_Ore.get().defaultBlockState()));
        //Underground Only Ores
        List<OreConfiguration.TargetBlockState> undergroundCobaltOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Cobalt_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> undergroundNeptuniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Neptunium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> undergroundPlutoniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Plutonium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> undergroundPromethiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Promethium_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTitaniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.Titanium_Ore.get().defaultBlockState()));
        //p_161014_ = vein size
        register(context, Overworld_Aluminum_Ore_Key, Feature.ORE, new OreConfiguration(overworldAluminumOres, 10));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Minerology.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                         ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
