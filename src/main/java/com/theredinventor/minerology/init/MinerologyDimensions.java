package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.world.dimension.UndergroundModDimension;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE, modid = Minerology.MOD_ID)
public class MinerologyDimensions {

    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, Minerology.MOD_ID);
    public static final RegistryObject<ModDimension> UNDERGROUND = MOD_DIMENSIONS.register("underground", () -> new UndergroundModDimension());

    @SubscribeEvent
    public static void onRegisterDimType(RegisterDimensionsEvent event)
    {
        DimensionManager.registerOrGetDimension(UNDERGROUND.getId(), UNDERGROUND.get(), null, false);

    }
}
