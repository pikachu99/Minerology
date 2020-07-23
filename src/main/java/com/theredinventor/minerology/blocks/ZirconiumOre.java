package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ZirconiumOre extends Block {
    public ZirconiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(5)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
