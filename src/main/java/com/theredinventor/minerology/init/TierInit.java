package com.theredinventor.minerology.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier Aluminum = new ForgeTier(
            225,
            2.0f,
            1,
            14,
            BlockTags.NEEDS_IRON_TOOL,
            ()-> Ingredient.of(ItemInit.Aluminum_Ingot::get),
            BlockTags.INCORRECT_FOR_IRON_TOOL
    );
}
