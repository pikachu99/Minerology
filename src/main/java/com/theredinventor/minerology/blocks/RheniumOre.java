package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RheniumOre extends Block {
    public RheniumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(7.0f, 7.5f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
