package com.theredinventor.minerology.util;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.MinerologyDimensions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Minerology.MOD_ID, bus = Bus.FORGE)
public class ForgeEventBusSubscriber {

    //@SubscribeEvent
    //public static void registerDimensions(final RegisterDimensionsEvent event){
    //    if(DimensionType.byName(Minerology.Underground_Type) == null){
    //        DimensionManager.registerDimension(Minerology.Underground_Type, MinerologyDimensions.UNDERGROUND.get(), null, false);
    //    }
    //    Minerology.LOGGER.info("Dimensions Registered!");

    //}
}
