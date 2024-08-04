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
    //Registry for Actinium
    public static final RegistryObject<DropExperienceBlock> Actinium_Ore = BLOCKS.register("actinium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Actinium_Block = BLOCKS.register("raw_actinium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Actinium_Block = BLOCKS.register("actinium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Aluminum
    public static final RegistryObject<DropExperienceBlock> Aluminum_Ore = BLOCKS.register("aluminum_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Aluminum_Block = BLOCKS.register("raw_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Aluminum_Block = BLOCKS.register("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Chromium
    public static final RegistryObject<DropExperienceBlock> Chromium_Ore = BLOCKS.register("chromium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Chromium_Block = BLOCKS.register("raw_chromium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Chromium_Block = BLOCKS.register("chromium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Cobalt
    public static final RegistryObject<DropExperienceBlock> Cobalt_Ore = BLOCKS.register("cobalt_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Cobalt_Block = BLOCKS.register("raw_cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Cobalt_Block = BLOCKS.register("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Iridium
    public static final RegistryObject<DropExperienceBlock> Iridium_Ore = BLOCKS.register("iridium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Iridium_Block = BLOCKS.register("raw_iridium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Iridium_Block = BLOCKS.register("iridium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Lead
    public static final RegistryObject<DropExperienceBlock> Lead_Ore = BLOCKS.register("lead_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Lead_Block = BLOCKS.register("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Lead_Block = BLOCKS.register("lead_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Lithium
    public static final RegistryObject<DropExperienceBlock> Lithium_Ore = BLOCKS.register("lithium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Lithium_Block = BLOCKS.register("raw_lithium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Lithium_Block = BLOCKS.register("lithium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Magnesium
    public static final RegistryObject<DropExperienceBlock> Magnesium_Ore = BLOCKS.register("magnesium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Magnesium_Block = BLOCKS.register("raw_magnesium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Magnesium_Block = BLOCKS.register("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Manganese
    public static final RegistryObject<DropExperienceBlock> Manganese_Ore = BLOCKS.register("manganese_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Manganese_Block = BLOCKS.register("raw_manganese_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Manganese_Block = BLOCKS.register("manganese_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Mercury
    public static final RegistryObject<DropExperienceBlock> Mercury_Ore = BLOCKS.register("mercury_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Mercury_Block = BLOCKS.register("raw_mercury_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Mercury_Block = BLOCKS.register("mercury_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Neptunium
    public static final RegistryObject<DropExperienceBlock> Neptunium_Ore = BLOCKS.register("neptunium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Neptunium_Block = BLOCKS.register("raw_neptunium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Neptunium_Block = BLOCKS.register("neptunium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Nickel
    public static final RegistryObject<DropExperienceBlock> Nickel_Ore = BLOCKS.register("nickel_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Nickel_Block = BLOCKS.register("raw_nickel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Nickel_Block = BLOCKS.register("nickel_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Osmium
    public static final RegistryObject<DropExperienceBlock> Osmium_Ore = BLOCKS.register("osmium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Osmium_Block = BLOCKS.register("raw_osmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Osmium_Block = BLOCKS.register("osmium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Platinum
    public static final RegistryObject<DropExperienceBlock> Platinum_Ore = BLOCKS.register("platinum_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Platinum_Block = BLOCKS.register("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Platinum_Block = BLOCKS.register("platinum_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Plutonium
    public static final RegistryObject<DropExperienceBlock> Plutonium_Ore = BLOCKS.register("plutonium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Plutonium_Block = BLOCKS.register("raw_plutonium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Plutonium_Block = BLOCKS.register("plutonium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Polonium
    public static final RegistryObject<DropExperienceBlock> Polonium_Ore = BLOCKS.register("polonium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Polonium_Block = BLOCKS.register("raw_polonium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Polonium_Block = BLOCKS.register("polonium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Promethium
    public static final RegistryObject<DropExperienceBlock> Promethium_Ore = BLOCKS.register("promethium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Promethium_Block = BLOCKS.register("raw_promethium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Promethium_Block = BLOCKS.register("promethium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Radium
    public static final RegistryObject<DropExperienceBlock> Radium_Ore = BLOCKS.register("radium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Radium_Block = BLOCKS.register("raw_radium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Radium_Block = BLOCKS.register("radium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Silver
    public static final RegistryObject<DropExperienceBlock> Silver_Ore = BLOCKS.register("silver_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Silver_Block = BLOCKS.register("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Silver_Block = BLOCKS.register("silver_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Thorium
    public static final RegistryObject<DropExperienceBlock> Thorium_Ore = BLOCKS.register("thorium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Thorium_Block = BLOCKS.register("raw_thorium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Thorium_Block = BLOCKS.register("thorium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Tin
    public static final RegistryObject<DropExperienceBlock> Tin_Ore = BLOCKS.register("tin_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Tin_Block = BLOCKS.register("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Tin_Block = BLOCKS.register("tin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Titanium
    public static final RegistryObject<DropExperienceBlock> Titanium_Ore = BLOCKS.register("titanium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Titanium_Block = BLOCKS.register("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Titanium_Block = BLOCKS.register("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Tungsten
    public static final RegistryObject<DropExperienceBlock> Tungsten_Ore = BLOCKS.register("tungsten_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Tungsten_Block = BLOCKS.register("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Tungsten_Block = BLOCKS.register("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Uranium
    public static final RegistryObject<DropExperienceBlock> Uranium_Ore = BLOCKS.register("uranium_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Uranium_Block = BLOCKS.register("raw_uranium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Uranium_Block = BLOCKS.register("uranium_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    //Registry for Zinc
    public static final RegistryObject<DropExperienceBlock> Zinc_Ore = BLOCKS.register("zinc_ore",
            () -> new DropExperienceBlock(
                    UniformInt.of(4,7),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)
            ));
    public static final RegistryObject<Block> Raw_Zinc_Block = BLOCKS.register("raw_zinc_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
    public static final RegistryObject<Block> Zinc_Block = BLOCKS.register("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(3,15)
                    .requiresCorrectToolForDrops()
            ));
}
