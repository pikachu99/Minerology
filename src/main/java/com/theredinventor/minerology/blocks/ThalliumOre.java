package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ThalliumOre extends Block {
    public ThalliumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(1.2f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
