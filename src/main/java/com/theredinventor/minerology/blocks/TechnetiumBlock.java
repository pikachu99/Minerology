package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TechnetiumBlock extends Block {
    public TechnetiumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 7.5f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
