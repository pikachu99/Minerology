package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MagnesiumBlock extends Block {
    public MagnesiumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(2.5f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
