package com.theredinventor.minerology.events;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.MinerologyEffects;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Minerology.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class MinerologyClientEvents
{
	private static final ResourceLocation HEALTH_TEXTURE = new ResourceLocation(Minerology.MOD_ID, "textures/gui/health.png");
	
	@SubscribeEvent
	public static void onHUDRender(RenderGameOverlayEvent event)
	{
		if (event.getType() == ElementType.HEALTH)
		{
			Minecraft client = Minecraft.getInstance();
			
			if (client.player.getActivePotionEffect(MinerologyEffects.RADIATION.get()) != null)
			{
				if (event instanceof RenderGameOverlayEvent.Pre)
				{
					client.textureManager.bindTexture(HEALTH_TEXTURE);
				}
				else if (event instanceof RenderGameOverlayEvent.Post)
				{
					client.textureManager.bindTexture(AbstractGui.GUI_ICONS_LOCATION);
				}
			}
		}
	}
}
