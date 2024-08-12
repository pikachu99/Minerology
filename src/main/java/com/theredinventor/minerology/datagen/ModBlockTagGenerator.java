package com.theredinventor.minerology.datagen;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.BlockInit;
import com.theredinventor.minerology.init.TagInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Minerology.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Mine-able with Pickaxe
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.Actinium_Ore.get(),
                        BlockInit.Actinium_Block.get(),
                        BlockInit.Aluminum_Ore.get(),
                        BlockInit.Aluminum_Block.get(),
                        BlockInit.Chromium_Ore.get(),
                        BlockInit.Chromium_Block.get(),
                        BlockInit.Cobalt_Ore.get()
                );
        //Needs Stone Tools

        //Needs Iron Tools
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.Actinium_Ore.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.Actinium_Block.get());
        //Needs Diamond Tools

        //Needs Netherite Tools
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(BlockInit.Cobalt_Ore.get()).addTag(Tags.Blocks.ORES);
        //Needs Cobalt Tools
        this.tag(TagInit.NEEDS_COBALT_TOOL)
                .add(BlockInit.Neptunium_Ore.get()).addTag(Tags.Blocks.ORES);
        this.tag(TagInit.NEEDS_COBALT_TOOL)
                .add(BlockInit.Neptunium_Block.get());
        this.tag(TagInit.NEEDS_COBALT_TOOL)
                .add(BlockInit.Plutonium_Ore.get()).addTag(Tags.Blocks.ORES);
        this.tag(TagInit.NEEDS_COBALT_TOOL)
                .add(BlockInit.Plutonium_Block.get());
    }
}
