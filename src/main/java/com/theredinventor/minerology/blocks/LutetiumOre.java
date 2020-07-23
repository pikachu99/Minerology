package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LutetiumOre extends Block {
    public LutetiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.6f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
