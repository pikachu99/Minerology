package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.world.dimension.UndergroundModDimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MinerologyDimensions {

    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, Minerology.MOD_ID);
    public static final RegistryObject<ModDimension> UNDERGROUND = MOD_DIMENSIONS.register("underground", () -> new UndergroundModDimension());
}
