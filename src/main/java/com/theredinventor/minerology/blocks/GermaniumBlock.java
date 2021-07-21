package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GermaniumBlock extends Block {
    public GermaniumBlock() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3f, 15f)
                .sound(SoundType.METAL)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
