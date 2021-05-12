package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ZirconiumBlock extends Block {
    public ZirconiumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(5)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
