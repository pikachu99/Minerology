package com.theredinventor.minerology.datagen;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Minerology.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Actinium
        blockWithItem(BlockInit.Actinium_Block);
        blockWithItem(BlockInit.Raw_Actinium_Block);
        //Aluminum
        blockWithItem(BlockInit.Aluminum_Block);
        blockWithItem(BlockInit.Raw_Aluminum_Block);
        //Chromium
        blockWithItem(BlockInit.Chromium_Block);
        blockWithItem(BlockInit.Raw_Chromium_Block);
        //Cobalt
        blockWithItem(BlockInit.Cobalt_Block);
        blockWithItem(BlockInit.Raw_Cobalt_Block);
        //Iridium
        blockWithItem(BlockInit.Iridium_Block);
        blockWithItem(BlockInit.Raw_Iridium_Block);
        //Lead
        blockWithItem(BlockInit.Lead_Block);
        blockWithItem(BlockInit.Raw_Lead_Block);
        //Lithium
        blockWithItem(BlockInit.Lithium_Block);
        blockWithItem(BlockInit.Raw_Lithium_Block);
        //Magnesium
        blockWithItem(BlockInit.Magnesium_Block);
        blockWithItem(BlockInit.Raw_Magnesium_Block);
        //Manganese
        blockWithItem(BlockInit.Manganese_Block);
        blockWithItem(BlockInit.Raw_Manganese_Block);
        //Mercury
        blockWithItem(BlockInit.Mercury_Block);
        blockWithItem(BlockInit.Raw_Mercury_Block);
        //Neptunium
        blockWithItem(BlockInit.Neptunium_Block);
        blockWithItem(BlockInit.Raw_Neptunium_Block);
        //Nickel
        blockWithItem(BlockInit.Nickel_Block);
        blockWithItem(BlockInit.Raw_Nickel_Block);
        //Osmium
        blockWithItem(BlockInit.Osmium_Block);
        blockWithItem(BlockInit.Raw_Osmium_Block);
        //Platinum
        blockWithItem(BlockInit.Platinum_Block);
        blockWithItem(BlockInit.Raw_Platinum_Block);
        //Plutonium
        blockWithItem(BlockInit.Plutonium_Block);
        blockWithItem(BlockInit.Raw_Plutonium_Block);
        //Polonium
        blockWithItem(BlockInit.Polonium_Block);
        blockWithItem(BlockInit.Raw_Polonium_Block);
        //Promethium
        blockWithItem(BlockInit.Promethium_Block);
        blockWithItem(BlockInit.Raw_Promethium_Block);
        //Radium
        blockWithItem(BlockInit.Radium_Block);
        blockWithItem(BlockInit.Raw_Radium_Block);
        //Silver
        blockWithItem(BlockInit.Silver_Block);
        blockWithItem(BlockInit.Raw_Silver_Block);
        //Thorium
        blockWithItem(BlockInit.Thorium_Block);
        blockWithItem(BlockInit.Raw_Thorium_Block);
        //Tin
        blockWithItem(BlockInit.Tin_Block);
        blockWithItem(BlockInit.Raw_Tin_Block);
        //Titanium
        blockWithItem(BlockInit.Titanium_Block);
        blockWithItem(BlockInit.Raw_Titanium_Block);
        //Tungsten
        blockWithItem(BlockInit.Tungsten_Block);
        blockWithItem(BlockInit.Raw_Tungsten_Block);
        //Uranium
        blockWithItem(BlockInit.Uranium_Block);
        blockWithItem(BlockInit.Raw_Uranium_Block);
        //Zinc
        blockWithItem(BlockInit.Zinc_Block);
        blockWithItem(BlockInit.Raw_Zinc_Block);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
