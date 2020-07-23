package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EuropiumOre extends Block {
    public EuropiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
