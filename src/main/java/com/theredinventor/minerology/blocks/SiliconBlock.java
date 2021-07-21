package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SiliconBlock extends Block {
    public SiliconBlock() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(6.5f, 5f)
                .sound(SoundType.METAL)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
