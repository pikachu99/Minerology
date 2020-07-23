package com.theredinventor.minerology.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CadmiumOre extends Block {
    public CadmiumOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(0.2f, 15f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
