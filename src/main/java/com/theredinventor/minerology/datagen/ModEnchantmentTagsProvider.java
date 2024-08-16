package com.theredinventor.minerology.datagen;

import com.theredinventor.minerology.enchantment.ArmorEnchantments;
import com.theredinventor.minerology.enchantment.ModEnchantmentTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EnchantmentTagsProvider;
import net.minecraft.tags.EnchantmentTags;

import java.util.concurrent.CompletableFuture;

public class ModEnchantmentTagsProvider extends EnchantmentTagsProvider {
    public ModEnchantmentTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider) {
        super(pOutput, pLookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModEnchantmentTags.UNIQUE_EFFECT)
                .add(ArmorEnchantments.Illumination)
                .add(ArmorEnchantments.Curse_Of_Attraction)
                .add(ArmorEnchantments.Curse_Of_Repulsion)
                .add(ArmorEnchantments.Radiation_Protection)
                .add(ArmorEnchantments.Curse_Of_Radiation);
        tag(EnchantmentTags.ARMOR_EXCLUSIVE)
                .add(ArmorEnchantments.Illumination)
                .add(ArmorEnchantments.Curse_Of_Attraction)
                .add(ArmorEnchantments.Curse_Of_Repulsion)
                .add(ArmorEnchantments.Radiation_Protection);
    }
}