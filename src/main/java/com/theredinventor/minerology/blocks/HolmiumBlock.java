package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HolmiumBlock extends Block {
    public HolmiumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(1.65f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}