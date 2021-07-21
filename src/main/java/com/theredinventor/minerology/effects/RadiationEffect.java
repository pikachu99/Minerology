package com.theredinventor.minerology.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

public class RadiationEffect extends Effect
{
	public RadiationEffect()
	{
		super(EffectType.HARMFUL, 0xd5d500);
	}
	
	@Override
	public void performEffect(LivingEntity entityLivingBaseIn, int amplifier)
	{
		entityLivingBaseIn.attackEntityFrom(DamageSource.WITHER, 1.0F);
	}
	
	@Override
	public boolean isReady(int duration, int amplifier)
	{
		int j = 25 >> amplifier;
		
		if (j > 0)
		{
			return duration % j == 0;
		}
		else
		{
			return true;
		}
		
	}
}
