package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GermaniumOre extends Block {
    public GermaniumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3f, 7.5f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
