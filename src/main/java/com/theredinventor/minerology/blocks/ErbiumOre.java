package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ErbiumOre extends Block {
    public ErbiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.0f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
