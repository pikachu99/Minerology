package com.theredinventor.minerology.util;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.blocks.ActiniumBlock;
import com.theredinventor.minerology.blocks.ActiniumOre;
import com.theredinventor.minerology.blocks.BlockItemBase;
import com.theredinventor.minerology.blocks.MolybdenumOre;
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
    public static final RegistryObject<Item> Molybdenum_Ingot = ITEMS.register("molybdenum_ingot", ItemBase::new);
    public static final RegistryObject<Item> Moscovium_Ingot = ITEMS.register("moscovium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Neodymium_Ingot = ITEMS.register("neodymium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Neptunium_Ingot = ITEMS.register("neptunium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Nickel_Ingot = ITEMS.register("nickel_ingot", ItemBase::new);
    public static final RegistryObject<Item> Nihonium_Ingot = ITEMS.register("nihonium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Niobium_Ingot = ITEMS.register("niobium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Nobelium_Ingot = ITEMS.register("nobelium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Oganesson_Ingot = ITEMS.register("oganesson_ingot", ItemBase::new);
    public static final RegistryObject<Item> Osmium_Ingot = ITEMS.register("osmium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Palladium_Ingot = ITEMS.register("palladium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Platinum_Ingot = ITEMS.register("platinum_ingot", ItemBase::new);
    public static final RegistryObject<Item> Plutonium_Ingot = ITEMS.register("plutonium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Potassium_Ingot = ITEMS.register("potassium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Praseodymium_Ingot = ITEMS.register("praseodymium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Promethium_Ingot = ITEMS.register("promethium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Protactinium_Ingot = ITEMS.register("protactinium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Radium_Ingot = ITEMS.register("radium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Rhenium_Ingot = ITEMS.register("rhenium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Rhodium_Ingot = ITEMS.register("rhodium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Roentgenium_Ingot = ITEMS.register("roentgenium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Rubidium_Ingot = ITEMS.register("rubidium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Ruthenium_Ingot = ITEMS.register("ruthenium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Rutherfordium_Ingot = ITEMS.register("rutherfordium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Samarium_Ingot = ITEMS.register("samarium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Scandium_Ingot = ITEMS.register("scandium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Seaborgium_Ingot = ITEMS.register("seaborgium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Silver_Ingot = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<Item> Sodium_Ingot = ITEMS.register("sodium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Strontium_Ingot = ITEMS.register("strontium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Tantalum_Ingot = ITEMS.register("tantalum_ingot", ItemBase::new);
    public static final RegistryObject<Item> Technetium_Ingot = ITEMS.register("technetium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Tennessine_Ingot = ITEMS.register("tennessine_ingot", ItemBase::new);
    public static final RegistryObject<Item> Terbium_Ingot = ITEMS.register("terbium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Thallium_Ingot = ITEMS.register("thallium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Thorium_Ingot = ITEMS.register("thorium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Thulium_Ingot = ITEMS.register("thulium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Tin_Ingot = ITEMS.register("tin_ingot", ItemBase::new);
    public static final RegistryObject<Item> Titanium_Ingot = ITEMS.register("titanium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Tungsten_Ingot = ITEMS.register("tungsten_ingot", ItemBase::new);
    public static final RegistryObject<Item> Uranium_Ingot = ITEMS.register("uranium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Vanadium_Ingot = ITEMS.register("vanadium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Ytterbium_Ingot = ITEMS.register("ytterbium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Yttrium_Ingot = ITEMS.register("yttrium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Zinc_Ingot = ITEMS.register("zinc_ingot", ItemBase::new);
    public static final RegistryObject<Item> Zirconium_Ingot = ITEMS.register("zirconium_ingot", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block>  Actinium_Ore = BLOCKS.register("actinium_ore", ActiniumOre:: new);
    public static final RegistryObject<Block>  Actinium_Block = BLOCKS.register("actinium_block", ActiniumBlock:: new);
    public static final RegistryObject<Block>  Molybdenum_Ore = BLOCKS.register("molybdenum_ore", MolybdenumOre:: new);

    // Blocks Items
    public static final RegistryObject<Item> Actinium_Ore_Item = ITEMS.register("actinium_ore", () -> new BlockItemBase(Actinium_Ore.get()));
    public static final RegistryObject<Item> Actinium_Block_Item = ITEMS.register("actinium_block", () -> new BlockItemBase(Actinium_Block.get()));
    public static final RegistryObject<Item> Molybdenum_Ore_Item = ITEMS.register("molybdenum_ore", () -> new BlockItemBase(Molybdenum_Ore.get()));

}