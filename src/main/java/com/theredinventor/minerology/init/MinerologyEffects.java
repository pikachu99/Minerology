package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.effects.RadiationEffect;

import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MinerologyEffects
{
	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Minerology.MOD_ID);
	
	public static final RegistryObject<Effect> RADIATION = EFFECTS.register("radiation", RadiationEffect::new);
}
