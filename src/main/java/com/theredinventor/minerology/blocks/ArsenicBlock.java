package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ArsenicBlock extends Block {
    public ArsenicBlock() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3f, 15f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
