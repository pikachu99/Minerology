package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ChromiumOre extends Block {
    public ChromiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(8.5f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
