package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
//import com.theredinventor.minerology.world.dimension.UndergroundModDimension;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = Minerology.MOD_ID)
public class MinerologyDimensions {

    /*public static final DeferredRegister<> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries., Minerology.MOD_ID);
    public static final RegistryObject<> UNDERGROUND = MOD_DIMENSIONS.register("underground", UndergroundModDimension::new);

    @SubscribeEvent
    public static void onRegisterDimType(RegisterDimensionsEvent event)
    {
        DimensionManager.registerOrGetDimension(UNDERGROUND.getId(), UNDERGROUND.get(), null, false);

    }*/
}
