package com.theredinventor.minerology.enchantment;

import com.theredinventor.minerology.Minerology;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.enchantment.Enchantment;

public class ModEnchantmentTags {
    public static final TagKey<Enchantment> BLOCK_EFFECT = create("block_effect");
    public static final TagKey<Enchantment> PLAYER_EFFECT = create("player_effect");
    public static final TagKey<Enchantment> MOB_EFFECT = create("mob_effect");
    public static final TagKey<Enchantment> UNIQUE_EFFECT = create("unique_effect");

    private static TagKey<Enchantment> create(String name)
    {
        return TagKey.create(Registries.ENCHANTMENT, ResourceLocation.fromNamespaceAndPath(Minerology.MODID, name));
    }

}