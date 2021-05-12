package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CobaltBlock extends Block {
    public CobaltBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 40f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
