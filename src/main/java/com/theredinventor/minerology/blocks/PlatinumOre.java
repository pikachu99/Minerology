package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PlatinumOre extends Block {
    public PlatinumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.5f, 30f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
