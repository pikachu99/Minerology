package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ManganeseBlock extends Block{
    public ManganeseBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.5f, 10f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
