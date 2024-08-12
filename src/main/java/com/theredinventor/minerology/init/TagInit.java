package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;


public class TagInit {
    public static final TagKey<Block> NEEDS_COBALT_TOOL = tag("needs_cobalt_tool");
    private static TagKey<Block> tag(String name){
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Minerology.MODID, name));
    }
}
