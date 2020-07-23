package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RhodiumOre extends Block {
    public RhodiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(6.0f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
