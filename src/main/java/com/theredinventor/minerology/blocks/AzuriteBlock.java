package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AzuriteBlock extends Block {
    public AzuriteBlock() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(2.75f, 10f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
