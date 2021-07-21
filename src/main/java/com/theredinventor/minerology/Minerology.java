package com.theredinventor.minerology;

import com.theredinventor.minerology.init.*;
import com.theredinventor.minerology.world.MinerologyOreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod("minerology")
@Mod.EventBusSubscriber(modid = Minerology.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Minerology
{
    public static final String MOD_ID = "minerology";

    public Minerology() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MinerologyBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinerologyItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //MinerologyDimensions.MOD_DIMENSIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //MinerologyBiomes.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinerologyEffects.EFFECTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //MinerologyEntity.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }


    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static void loadCompleteEvent(BiomeLoadingEvent event){
        MinerologyOreGen.generationOres(event);
    }

    public static final ItemGroup TAB = new ItemGroup("minerology_metal"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(MinerologyItems.Actinium_Ingot.get());
        }
    };
}