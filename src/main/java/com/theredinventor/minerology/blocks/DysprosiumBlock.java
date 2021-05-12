package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DysprosiumBlock extends Block {
    public DysprosiumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(1.8f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
