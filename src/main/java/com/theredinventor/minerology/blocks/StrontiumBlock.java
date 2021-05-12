package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class StrontiumBlock extends Block {
    public StrontiumBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(1.5f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
