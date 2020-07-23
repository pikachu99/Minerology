package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TitaniumOre extends Block {
    public TitaniumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(6.0f, 50f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
