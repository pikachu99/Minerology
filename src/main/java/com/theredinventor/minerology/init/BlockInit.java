package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Minerology.MODID);

    public static final RegistryObject<Block> Aluminum_Block = BLOCKS.register("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));

    public static final RegistryObject<DropExperienceBlock> Aluminum_Ore = BLOCKS.register("aluminum_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE)
            ));
}
