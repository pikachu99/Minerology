package com.theredinventor.minerology.util;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.blocks.ActiniumOre;
import com.theredinventor.minerology.blocks.BlockItemBase;
import com.theredinventor.minerology.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Minerology.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Minerology.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Items
    public static final RegistryObject<Item> Actinium_Ingot = ITEMS.register( "actinium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Berylium_Ingot = ITEMS.register( "berylium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Aluminum_Ingot = ITEMS.register( "aluminum_ingot", ItemBase::new);
    public static final RegistryObject<Item> Americium_Ingot = ITEMS.register( "americium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Barium_Ingot = ITEMS.register( "barium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Berkelium_Ingot = ITEMS.register( "berkelium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Bismuth_Ingot = ITEMS.register( "bismuth_ingot", ItemBase::new);
    public static final RegistryObject<Item> Bohrium_Ingot = ITEMS.register( "bohrium_ingot", ItemBase::new);

    public static final RegistryObject<Item> Cadmium_Ingot = ITEMS.register( "cadmium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Caesium_Ingot = ITEMS.register( "caesium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Calcium_Ingot = ITEMS.register( "calcium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Californium_Ingot = ITEMS.register( "californium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Cerium_Ingot = ITEMS.register( "cerium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Chromium_Ingot = ITEMS.register( "chromium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Cobalt_Ingot = ITEMS.register( "cobalt_ingot", ItemBase::new);
    public static final RegistryObject<Item> Copernicium_Ingot = ITEMS.register( "copernicium_ingot", ItemBase::new);

    public static final RegistryObject<Item> Copper_Ingot = ITEMS.register( "copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> Curium_Ingot = ITEMS.register( "curium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Darmstadium_Ingot = ITEMS.register( "darmstadtium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Dubnium_Ingot = ITEMS.register( "dubnium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Dysprosium_Ingot = ITEMS.register( "dysprosium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Einsteinium_Ingot = ITEMS.register( "einsteinium_ingot", ItemBase::new);

    public static final RegistryObject<Item> Erbium_Ingot = ITEMS.register( "erbium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Europium_Ingot = ITEMS.register( "europium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Fermium_Ingot = ITEMS.register( "fermium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Flerovium_Ingot = ITEMS.register( "flerovium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Francium_Ingot = ITEMS.register( "francium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Gadolinium_Ingot = ITEMS.register( "gadolinium_ingot", ItemBase::new);


    public static final RegistryObject<Item> Gallium_Ingot = ITEMS.register( "gallium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Hafnium_Ingot = ITEMS.register( "hafnium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Hassium_Ingot = ITEMS.register( "hassium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Holmium_Ingot = ITEMS.register( "holmium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Indium_Ingot = ITEMS.register( "indium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Iridium_Ingot = ITEMS.register( "iridium_ingot", ItemBase::new);


    public static final RegistryObject<Item> Lanthanum_Ingot = ITEMS.register( "lanthanum_ingot", ItemBase::new);
    public static final RegistryObject<Item> Lawrencium_Ingot = ITEMS.register( "lawrencium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Lead_Ingot = ITEMS.register( "lead_ingot", ItemBase::new);
    public static final RegistryObject<Item> Lithium_Ingot = ITEMS.register( "lithium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Livermorium_Ingot = ITEMS.register( "livermorium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Lutetium_Ingot = ITEMS.register( "lutetium_ingot", ItemBase::new);

    public static final RegistryObject<Item> Magnesium_Ingot = ITEMS.register( "magnesium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Manganese_Ingot = ITEMS.register( "manganese_ingot", ItemBase::new);
    public static final RegistryObject<Item> Meithnerium_Ingot = ITEMS.register( "meithnerium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Mendelevium_Ingot = ITEMS.register( "mendelevium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Mercury_Ingot = ITEMS.register( "mercury_ingot", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block>  Actinium_Ore = BLOCKS.register("actinium_ore", ActiniumOre:: new);

    // Blocks Items
    public static final RegistryObject<Item> Actinium_Ore_Item = ITEMS.register("actinium_ore", () -> new BlockItemBase(Actinium_Ore.get()));

}