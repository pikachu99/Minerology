package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PhosphorusOre extends Block {
    public PhosphorusOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(1f, 10f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
