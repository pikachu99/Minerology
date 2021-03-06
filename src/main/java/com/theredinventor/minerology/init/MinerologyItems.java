package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.blocks.BlockItemBase;
import com.theredinventor.minerology.items.ItemBase;
import com.theredinventor.minerology.util.enums.MinerologyItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MinerologyItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Minerology.MOD_ID);
    // Ingots
    public static final RegistryObject<Item> Actinium_Ingot = ITEMS.register( "actinium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Aluminum_Ingot = ITEMS.register( "aluminum_ingot", ItemBase::new);
    public static final RegistryObject<Item> Americium_Ingot = ITEMS.register( "americium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Barium_Ingot = ITEMS.register( "barium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Berkelium_Ingot = ITEMS.register( "berkelium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Beryllium_Ingot = ITEMS.register( "beryllium_ingot", ItemBase::new);
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
    public static final RegistryObject<Item> Meitnerium_Ingot = ITEMS.register( "meitnerium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Mendelevium_Ingot = ITEMS.register( "mendelevium_ingot", ItemBase::new);
    public static final RegistryObject<Item> Mercury_Ingot = ITEMS.register( "mercury_ingot", ItemBase::new);
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
    public static final RegistryObject<Item> Polonium_Ingot = ITEMS.register("polonium_ingot", ItemBase::new);
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
    public static final RegistryObject<Item> Silicon = ITEMS.register("silicon", ItemBase::new);
    public static final RegistryObject<Item> Silver_Ingot = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<Item> Sodium = ITEMS.register("sodium", ItemBase::new);
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
    // Ores Items
    public static final RegistryObject<Item> Actinium_Ore_Item = ITEMS.register("actinium_ore", () -> new BlockItemBase(MinerologyBlocks.Actinium_Ore.get()));
    public static final RegistryObject<Item> Aluminum_Ore_Item = ITEMS.register("aluminum_ore", () -> new BlockItemBase(MinerologyBlocks.Aluminum_Ore.get()));
    public static final RegistryObject<Item> Barium_Ore_Item = ITEMS.register("barium_ore", () -> new BlockItemBase(MinerologyBlocks.Barium_Ore.get()));
    public static final RegistryObject<Item> Beryllium_Ore_Item = ITEMS.register("beryllium_ore", () -> new BlockItemBase(MinerologyBlocks.Beryllium_Ore.get()));
    public static final RegistryObject<Item> Bismuth_Ore_Item = ITEMS.register("bismuth_ore", () -> new BlockItemBase(MinerologyBlocks.Bismuth_Ore.get()));
    public static final RegistryObject<Item> Cadmium_Ore_Item = ITEMS.register("cadmium_ore", () -> new BlockItemBase(MinerologyBlocks.Cadmium_Ore.get()));
    public static final RegistryObject<Item> Calcium_Ore_Item = ITEMS.register("calcium_ore", () -> new BlockItemBase(MinerologyBlocks.Calcium_Ore.get()));
    public static final RegistryObject<Item> Cerium_Ore_Item = ITEMS.register("cerium_ore", () -> new BlockItemBase(MinerologyBlocks.Cerium_Ore.get()));
    public static final RegistryObject<Item> Caesium_Ore_Item = ITEMS.register("caesium_ore", () -> new BlockItemBase(MinerologyBlocks.Caesium_Ore.get()));
    public static final RegistryObject<Item> Chromium_Ore_Item = ITEMS.register("chromium_ore", () -> new BlockItemBase(MinerologyBlocks.Chromium_Ore.get()));
    public static final RegistryObject<Item> Cobalt_Ore_Item = ITEMS.register("cobalt_ore", () -> new BlockItemBase(MinerologyBlocks.Cobalt_Ore.get()));
    public static final RegistryObject<Item> Copper_Ore_Item = ITEMS.register("copper_ore", () -> new BlockItemBase(MinerologyBlocks.Copper_Ore.get()));
    public static final RegistryObject<Item> Dysprosium_Ore_Item = ITEMS.register("dysprosium_ore", () -> new BlockItemBase(MinerologyBlocks.Dysprosium_Ore.get()));
    public static final RegistryObject<Item> Erbium_Ore_Item = ITEMS.register("erbium_ore", () -> new BlockItemBase(MinerologyBlocks.Erbium_Ore.get()));
    public static final RegistryObject<Item> Europium_Ore_Item = ITEMS.register("europium_ore", () -> new BlockItemBase(MinerologyBlocks.Europium_Ore.get()));
    public static final RegistryObject<Item> Francium_Ore_Item = ITEMS.register("francium_ore", () -> new BlockItemBase(MinerologyBlocks.Francium_Ore.get()));
    public static final RegistryObject<Item> Gadolinium_Ore_Item = ITEMS.register("gadolinium_ore", () -> new BlockItemBase(MinerologyBlocks.Gadolinium_Ore.get()));
    public static final RegistryObject<Item> Gallium_Ore_Item = ITEMS.register("gallium_ore", () -> new BlockItemBase(MinerologyBlocks.Gallium_Ore.get()));
    public static final RegistryObject<Item> Hafnium_Ore_Item = ITEMS.register("hafnium_ore", () -> new BlockItemBase(MinerologyBlocks.Hafnium_Ore.get()));
    public static final RegistryObject<Item> Holmium_Ore_Item = ITEMS.register("holmium_ore", () -> new BlockItemBase(MinerologyBlocks.Holmium_Ore.get()));
    public static final RegistryObject<Item> Indium_Ore_Item = ITEMS.register("indium_ore", () -> new BlockItemBase(MinerologyBlocks.Indium_Ore.get()));
    public static final RegistryObject<Item> Iridium_Ore_Item = ITEMS.register("iridium_ore", () -> new BlockItemBase(MinerologyBlocks.Iridium_Ore.get()));
    public static final RegistryObject<Item> Lanthanum_Ore_Item = ITEMS.register("lanthanum_ore", () -> new BlockItemBase(MinerologyBlocks.Lanthanum_Ore.get()));
    public static final RegistryObject<Item> Lead_Ore_Item = ITEMS.register("lead_ore", () -> new BlockItemBase(MinerologyBlocks.Lead_Ore.get()));
    public static final RegistryObject<Item> Lithium_Ore_Item = ITEMS.register("lithium_ore", () -> new BlockItemBase(MinerologyBlocks.Lithium_Ore.get()));
    public static final RegistryObject<Item> Lutetium_Ore_Item = ITEMS.register("lutetium_ore", () -> new BlockItemBase(MinerologyBlocks.Lutetium_Ore.get()));
    public static final RegistryObject<Item> Magnesium_Ore_Item = ITEMS.register("magnesium_ore", () -> new BlockItemBase(MinerologyBlocks.Magnesium_Ore.get()));
    public static final RegistryObject<Item> Manganese_Ore_Item = ITEMS.register("manganese_ore", () -> new BlockItemBase(MinerologyBlocks.Manganese_Ore.get()));
    public static final RegistryObject<Item> Mendelevium_Ore_Item = ITEMS.register("mendelevium_ore", () -> new BlockItemBase(MinerologyBlocks.Mendelevium_Ore.get()));
    public static final RegistryObject<Item> Mercury_Ore_Item = ITEMS.register("mercury_ore", () -> new BlockItemBase(MinerologyBlocks.Mercury_Ore.get()));
    public static final RegistryObject<Item> Molybdenum_Ore_Item = ITEMS.register("molybdenum_ore", () -> new BlockItemBase(MinerologyBlocks.Molybdenum_Ore.get()));
    public static final RegistryObject<Item> Neodymium_Ore_Item = ITEMS.register("neodymium_ore", () -> new BlockItemBase(MinerologyBlocks.Neodymium_Ore.get()));
    public static final RegistryObject<Item> Nickel_Ore_Item = ITEMS.register("nickel_ore", () -> new BlockItemBase(MinerologyBlocks.Nickel_Ore.get()));
    public static final RegistryObject<Item> Niobium_Ore_Item = ITEMS.register("niobium_ore", () -> new BlockItemBase(MinerologyBlocks.Niobium_Ore.get()));
    public static final RegistryObject<Item> Osmium_Ore_Item = ITEMS.register("osmium_ore", () -> new BlockItemBase(MinerologyBlocks.Osmium_Ore.get()));
    public static final RegistryObject<Item> Palladium_Ore_Item = ITEMS.register("palladium_ore", () -> new BlockItemBase(MinerologyBlocks.Palladium_Ore.get()));
    public static final RegistryObject<Item> Platinum_Ore_Item = ITEMS.register("platinum_ore", () -> new BlockItemBase(MinerologyBlocks.Platinum_Ore.get()));
    public static final RegistryObject<Item> Polonium_Ore_Item = ITEMS.register("polonium_ore", () -> new BlockItemBase(MinerologyBlocks.Polonium_Ore.get()));
    public static final RegistryObject<Item> Potassium_Ore_Item = ITEMS.register("potassium_ore", () -> new BlockItemBase(MinerologyBlocks.Potassium_Ore.get()));
    public static final RegistryObject<Item> Praseodymium_Ore_Item = ITEMS.register("praseodymium_ore", () -> new BlockItemBase(MinerologyBlocks.Praseodymium_Ore.get()));
    public static final RegistryObject<Item> Protactinium_Ore_Item = ITEMS.register("protactinium_ore", () -> new BlockItemBase(MinerologyBlocks.Protactinium_Ore.get()));
    public static final RegistryObject<Item> Radium_Ore_Item = ITEMS.register("radium_ore", () -> new BlockItemBase(MinerologyBlocks.Radium_Ore.get()));
    public static final RegistryObject<Item> Rhenium_Ore_Item = ITEMS.register("rhenium_ore", () -> new BlockItemBase(MinerologyBlocks.Rhenium_Ore.get()));
    public static final RegistryObject<Item> Rhodium_Ore_Item = ITEMS.register("rhodium_ore", () -> new BlockItemBase(MinerologyBlocks.Rhodium_Ore.get()));
    public static final RegistryObject<Item> Rubidium_Ore_Item = ITEMS.register("rubidium_ore", () -> new BlockItemBase(MinerologyBlocks.Rubidium_Ore.get()));
    public static final RegistryObject<Item> Ruthenium_Ore_Item = ITEMS.register("ruthenium_ore", () -> new BlockItemBase(MinerologyBlocks.Ruthenium_Ore.get()));
    public static final RegistryObject<Item> Samarium_Ore_Item = ITEMS.register("samarium_ore", () -> new BlockItemBase(MinerologyBlocks.Samarium_Ore.get()));
    public static final RegistryObject<Item> Scandium_Ore_Item = ITEMS.register("scandium_ore", () -> new BlockItemBase(MinerologyBlocks.Scandium_Ore.get()));
    public static final RegistryObject<Item> Silicon_Ore_Item = ITEMS.register("silicon_ore", () -> new BlockItemBase(MinerologyBlocks.Silicon_Ore.get()));
    public static final RegistryObject<Item> Silver_Ore_Item = ITEMS.register("silver_ore", () -> new BlockItemBase(MinerologyBlocks.Silver_Ore.get()));
    public static final RegistryObject<Item> Sodium_Ore_Item = ITEMS.register("sodium_ore", () -> new BlockItemBase(MinerologyBlocks.Sodium_Ore.get()));
    public static final RegistryObject<Item> Strontium_Ore_Item = ITEMS.register("strontium_ore", () -> new BlockItemBase(MinerologyBlocks.Strontium_Ore.get()));
    public static final RegistryObject<Item> Tantalum_Ore_Item = ITEMS.register("tantalum_ore", () -> new BlockItemBase(MinerologyBlocks.Tantalum_Ore.get()));
    public static final RegistryObject<Item> Terbium_Ore_Item = ITEMS.register("terbium_ore", () -> new BlockItemBase(MinerologyBlocks.Terbium_Ore.get()));
    public static final RegistryObject<Item> Thallium_Ore_Item = ITEMS.register("thallium_ore", () -> new BlockItemBase(MinerologyBlocks.Thallium_Ore.get()));
    public static final RegistryObject<Item> Thorium_Ore_Item = ITEMS.register("thorium_ore", () -> new BlockItemBase(MinerologyBlocks.Thorium_Ore.get()));
    public static final RegistryObject<Item> Thulium_Ore_Item = ITEMS.register("thulium_ore", () -> new BlockItemBase(MinerologyBlocks.Thulium_Ore.get()));
    public static final RegistryObject<Item> Tin_Ore_Item = ITEMS.register("tin_ore", () -> new BlockItemBase(MinerologyBlocks.Tin_Ore.get()));
    public static final RegistryObject<Item> Titanium_Ore_Item = ITEMS.register("titanium_ore", () -> new BlockItemBase(MinerologyBlocks.Titanium_Ore.get()));
    public static final RegistryObject<Item> Tungsten_Ore_Item = ITEMS.register("tungsten_ore", () -> new BlockItemBase(MinerologyBlocks.Tungsten_Ore.get()));
    public static final RegistryObject<Item> Uranium_Ore_Item = ITEMS.register("uranium_ore", () -> new BlockItemBase(MinerologyBlocks.Uranium_Ore.get()));
    public static final RegistryObject<Item> Vanadium_Ore_Item = ITEMS.register("vanadium_ore", () -> new BlockItemBase(MinerologyBlocks.Vanadium_Ore.get()));
    public static final RegistryObject<Item> Ytterbium_Ore_Item = ITEMS.register("ytterbium_ore", () -> new BlockItemBase(MinerologyBlocks.Ytterbium_Ore.get()));
    public static final RegistryObject<Item> Yttrium_Ore_Item = ITEMS.register("yttrium_ore", () -> new BlockItemBase(MinerologyBlocks.Yttrium_Ore.get()));
    public static final RegistryObject<Item> Zinc_Ore_Item = ITEMS.register("zinc_ore", () -> new BlockItemBase(MinerologyBlocks.Zinc_Ore.get()));
    public static final RegistryObject<Item> ZirconiumOre_Item = ITEMS.register("zirconium_ore", () -> new BlockItemBase(MinerologyBlocks.Zirconium_Ore.get()));
    public static final RegistryObject<Item> Aegirine_Ore_Item = ITEMS.register("aegirine_ore", () -> new BlockItemBase(MinerologyBlocks.Aegirine_Ore.get()));
    public static final RegistryObject<Item> Amber_Ore_Item = ITEMS.register("amber_ore", () -> new BlockItemBase(MinerologyBlocks.Amber_Ore.get()));
    public static final RegistryObject<Item> Amethyst_Ore_Item = ITEMS.register("amethyst_ore", () -> new BlockItemBase(MinerologyBlocks.Amethyst_Ore.get()));
    public static final RegistryObject<Item> Antimony_Ore_Item = ITEMS.register("antimony_ore", () -> new BlockItemBase(MinerologyBlocks.Antimony_Ore.get()));
    public static final RegistryObject<Item> Apatite_Ore_Item = ITEMS.register("apatite_ore", () -> new BlockItemBase(MinerologyBlocks.Apatite_Ore.get()));
    public static final RegistryObject<Item> Aquaum_Ore_Item = ITEMS.register("aquaum_ore", () -> new BlockItemBase(MinerologyBlocks.Aquaum_Ore.get()));
    public static final RegistryObject<Item> Arctite_Ore_Item = ITEMS.register("arctite_ore", () -> new BlockItemBase(MinerologyBlocks.Arctite_Ore.get()));
    public static final RegistryObject<Item> Arsenic_Ore_Item = ITEMS.register("arsenic_ore", () -> new BlockItemBase(MinerologyBlocks.Arsenic_Ore.get()));
    public static final RegistryObject<Item> Avotum_Ore_Item = ITEMS.register("avotum_ore", () -> new BlockItemBase(MinerologyBlocks.Avotum_Ore.get()));
    public static final RegistryObject<Item> Azurite_Ore_Item = ITEMS.register("azurite_ore", () -> new BlockItemBase(MinerologyBlocks.Azurite_Ore.get()));
    public static final RegistryObject<Item> Balonium_Ore_Item = ITEMS.register("balonium_ore", () -> new BlockItemBase(MinerologyBlocks.Balonium_Ore.get()));
    public static final RegistryObject<Item> Barite_Ore_Item = ITEMS.register("barite_ore", () -> new BlockItemBase(MinerologyBlocks.Barite_Ore.get()));
    public static final RegistryObject<Item> Bornite_Ore_Item = ITEMS.register("bornite_ore", () -> new BlockItemBase(MinerologyBlocks.Bornite_Ore.get()));
    public static final RegistryObject<Item> Beryl_Ore_Item = ITEMS.register("beryl_ore", () -> new BlockItemBase(MinerologyBlocks.Beryl_Ore.get()));
    public static final RegistryObject<Item> Boron_Ore_Item = ITEMS.register("boron_ore", () -> new BlockItemBase(MinerologyBlocks.Boron_Ore.get()));
    public static final RegistryObject<Item> Burptonium_Ore_Item = ITEMS.register("burptonium_ore", () -> new BlockItemBase(MinerologyBlocks.Burptonium_Ore.get()));
    public static final RegistryObject<Item> Calcite_Ore_Item = ITEMS.register("calcite_ore", () -> new BlockItemBase(MinerologyBlocks.Calcite_Ore.get()));
    public static final RegistryObject<Item> Cinnabar_Ore_Item = ITEMS.register("cinnabar_ore", () -> new BlockItemBase(MinerologyBlocks.Cinnabar_Ore.get()));
    public static final RegistryObject<Item> Craintum_Ore_Item = ITEMS.register("craintum_ore", () -> new BlockItemBase(MinerologyBlocks.Craintum_Ore.get()));
    public static final RegistryObject<Item> Dandium_Ore_Item = ITEMS.register("dandium_ore", () -> new BlockItemBase(MinerologyBlocks.Dandium_Ore.get()));
    public static final RegistryObject<Item> Diopside_Ore_Item = ITEMS.register("diopside_ore", () -> new BlockItemBase(MinerologyBlocks.Diopside_Ore.get()));
    public static final RegistryObject<Item> Dithulium_Ore_Item = ITEMS.register("dithulium_ore", () -> new BlockItemBase(MinerologyBlocks.Dithulium_Ore.get()));
    public static final RegistryObject<Item> Fieryum_Ore_Item = ITEMS.register("fieryum_ore", () -> new BlockItemBase(MinerologyBlocks.Fieryum_Ore.get()));
    public static final RegistryObject<Item> Fluorite_Ore_Item = ITEMS.register("fluorite_ore", () -> new BlockItemBase(MinerologyBlocks.Fluorite_Ore.get()));
    public static final RegistryObject<Item> Germanium_Ore_Item = ITEMS.register("germanium_ore", () -> new BlockItemBase(MinerologyBlocks.Germanium_Ore.get()));
    public static final RegistryObject<Item> Gingerite_Ore_Item = ITEMS.register("gingerite_ore", () -> new BlockItemBase(MinerologyBlocks.Gingerite_Ore.get()));
    public static final RegistryObject<Item> Jade_Ore_Item = ITEMS.register("jade_ore", () -> new BlockItemBase(MinerologyBlocks.Jade_Ore.get()));
    public static final RegistryObject<Item> Jenite_Ore_Item = ITEMS.register("jenite_ore", () -> new BlockItemBase(MinerologyBlocks.Jenite_Ore.get()));
    public static final RegistryObject<Item> Jeromium_Ore_Item = ITEMS.register("jeromium_ore", () -> new BlockItemBase(MinerologyBlocks.Jeromium_Ore.get()));
    public static final RegistryObject<Item> Kyanite_Ore_Item = ITEMS.register("kyanite_ore", () -> new BlockItemBase(MinerologyBlocks.Kyanite_Ore.get()));
    public static final RegistryObject<Item> Leafyum_Ore_Item = ITEMS.register("leafyum_ore", () -> new BlockItemBase(MinerologyBlocks.Leafyum_Ore.get()));
    public static final RegistryObject<Item> Logdotium_Ore_Item = ITEMS.register("logdotium_ore", () -> new BlockItemBase(MinerologyBlocks.Logdotium_Ore.get()));
    public static final RegistryObject<Item> Lunium_Ore_Item = ITEMS.register("lunium_ore", () -> new BlockItemBase(MinerologyBlocks.Lunium_Ore.get()));
    public static final RegistryObject<Item> Melonlonyum_Ore_Item = ITEMS.register("melonlonyum_ore", () -> new BlockItemBase(MinerologyBlocks.Melonlonyum_Ore.get()));
    public static final RegistryObject<Item> Mumbonium_Ore_Item = ITEMS.register("mumbonium_ore", () -> new BlockItemBase(MinerologyBlocks.Mumbonium_Ore.get()));
    public static final RegistryObject<Item> Phosphorus_Ore_Item = ITEMS.register("phosphorus_ore", () -> new BlockItemBase(MinerologyBlocks.Phosphorus_Ore.get()));
    public static final RegistryObject<Item> Pootonium_Ore_Item = ITEMS.register("pootonium_ore", () -> new BlockItemBase(MinerologyBlocks.Pootonium_Ore.get()));
    public static final RegistryObject<Item> Popularite_Ore_Item = ITEMS.register("popularite_ore", () -> new BlockItemBase(MinerologyBlocks.Popularite_Ore.get()));
    public static final RegistryObject<Item> Pumpkinite_Ore_Item = ITEMS.register("pumpkinite_ore", () -> new BlockItemBase(MinerologyBlocks.Pumpkinite_Ore.get()));
    public static final RegistryObject<Item> Redintium_Ore_Item = ITEMS.register("redintium_ore", () -> new BlockItemBase(MinerologyBlocks.Redintium_Ore.get()));
    public static final RegistryObject<Item> Ruby_Ore_Item = ITEMS.register("ruby_ore", () -> new BlockItemBase(MinerologyBlocks.Ruby_Ore.get()));
    public static final RegistryObject<Item> Sapphire_Ore_Item = ITEMS.register("sapphire_ore", () -> new BlockItemBase(MinerologyBlocks.Sapphire_Ore.get()));
    public static final RegistryObject<Item> Selenium_Ore_Item = ITEMS.register("selenium_ore", () -> new BlockItemBase(MinerologyBlocks.Selenium_Ore.get()));
    public static final RegistryObject<Item> Solium_Ore_Item = ITEMS.register("solium_ore", () -> new BlockItemBase(MinerologyBlocks.Solium_Ore.get()));
    public static final RegistryObject<Item> Sparkpolium_Ore_Item = ITEMS.register("sparkpolium_ore", () -> new BlockItemBase(MinerologyBlocks.Sparkpolium_Ore.get()));
    public static final RegistryObject<Item> Ssundium_Ore_Item = ITEMS.register("ssundium_ore", () -> new BlockItemBase(MinerologyBlocks.Ssundium_Ore.get()));
    public static final RegistryObject<Item> Sulfur_Ore_Item = ITEMS.register("sulfur_ore", () -> new BlockItemBase(MinerologyBlocks.Sulfur_Ore.get()));
    public static final RegistryObject<Item> Teknum_Ore_Item = ITEMS.register("teknum_ore", () -> new BlockItemBase(MinerologyBlocks.Teknum_Ore.get()));
    public static final RegistryObject<Item> Tellurium_Ore_Item = ITEMS.register("tellurium_ore", () -> new BlockItemBase(MinerologyBlocks.Tellurium_Ore.get()));
    public static final RegistryObject<Item> Theanum_Ore_Item = ITEMS.register("theanum_ore", () -> new BlockItemBase(MinerologyBlocks.Theanum_Ore.get()));
    public static final RegistryObject<Item> Thinknum_Ore_Item = ITEMS.register("thinknum_ore", () -> new BlockItemBase(MinerologyBlocks.Thinknum_Ore.get()));
    public static final RegistryObject<Item> Topaz_Ore_Item = ITEMS.register("topaz_ore", () -> new BlockItemBase(MinerologyBlocks.Topaz_Ore.get()));
    public static final RegistryObject<Item> Vibranium_Ore_Item = ITEMS.register("vibranium_ore", () -> new BlockItemBase(MinerologyBlocks.Vibranium_Ore.get()));
    public static final RegistryObject<Item> Windium_Ore_Item = ITEMS.register("windium_ore", () -> new BlockItemBase(MinerologyBlocks.Windium_Ore.get()));
    public static final RegistryObject<Item> Wooftonium_Ore_Item = ITEMS.register("wooftonium_ore", () -> new BlockItemBase(MinerologyBlocks.Wooftonium_Ore.get()));

    // Block Items
    public static final RegistryObject<Item> Actinium_Block_Item = ITEMS.register("actinium_block", () -> new BlockItemBase(MinerologyBlocks.Actinium_Block.get()));
    public static final RegistryObject<Item> Aluminum_Block_Item = ITEMS.register("aluminum_block", () -> new BlockItemBase(MinerologyBlocks.Aluminum_Block.get()));
    public static final RegistryObject<Item> Americium_Block_Item = ITEMS.register("americium_block", () -> new BlockItemBase(MinerologyBlocks.Americium_Block.get()));
    public static final RegistryObject<Item> Barium_Block_Item = ITEMS.register("barium_block", () -> new BlockItemBase(MinerologyBlocks.Barium_Block.get()));
    public static final RegistryObject<Item> Berkelium_Block_Item = ITEMS.register("berkelium_block", () -> new BlockItemBase(MinerologyBlocks.Berkelium_Block.get()));
    public static final RegistryObject<Item> Beryllium_Block_Item = ITEMS.register("beryllium_block", () -> new BlockItemBase(MinerologyBlocks.Beryllium_Block.get()));
    public static final RegistryObject<Item> Bismuth_Block_Item = ITEMS.register("bismuth_block", () -> new BlockItemBase(MinerologyBlocks.Bismuth_Block.get()));
    public static final RegistryObject<Item> Bohrium_Block_Item = ITEMS.register("bohrium_block", () -> new BlockItemBase(MinerologyBlocks.Bohrium_Block.get()));
    public static final RegistryObject<Item> Cadmium_Block_Item = ITEMS.register("cadmium_block", () -> new BlockItemBase(MinerologyBlocks.Cadmium_Block.get()));
    public static final RegistryObject<Item> Caesium_Block_Item = ITEMS.register("caesium_block", () -> new BlockItemBase(MinerologyBlocks.Caesium_Block.get()));
    public static final RegistryObject<Item> Calcium_Block_Item = ITEMS.register("calcium_block", () -> new BlockItemBase(MinerologyBlocks.Calcium_Block.get()));
    public static final RegistryObject<Item> Californium_Block_Item = ITEMS.register("californium_block", () -> new BlockItemBase(MinerologyBlocks.Californium_Block.get()));
    public static final RegistryObject<Item> Cerium_Block_Item = ITEMS.register("cerium_block", () -> new BlockItemBase(MinerologyBlocks.Cerium_Block.get()));
    public static final RegistryObject<Item> Chromium_Block_Item = ITEMS.register("chromium_block", () -> new BlockItemBase(MinerologyBlocks.Chromium_Block.get()));
    public static final RegistryObject<Item> Cobalt_Block_Item = ITEMS.register("cobalt_block", () -> new BlockItemBase(MinerologyBlocks.Cobalt_Block.get()));
    public static final RegistryObject<Item> Copernicium_Block_Item = ITEMS.register("copernicium_block", () -> new BlockItemBase(MinerologyBlocks.Copernicium_Block.get()));
    public static final RegistryObject<Item> Copper_Block_Item = ITEMS.register("copper_block", () -> new BlockItemBase(MinerologyBlocks.Copper_Block.get()));
    public static final RegistryObject<Item> Curium_Block_Item = ITEMS.register("curium_block", () -> new BlockItemBase(MinerologyBlocks.Curium_Block.get()));
    public static final RegistryObject<Item> Darmstadtium_Block_Item = ITEMS.register("darmstadtium_block", () -> new BlockItemBase(MinerologyBlocks.Darmstadtium_Block.get()));
    public static final RegistryObject<Item> Dubnium_Block_Item = ITEMS.register("dubnium_block", () -> new BlockItemBase(MinerologyBlocks.Dubnium_Block.get()));
    public static final RegistryObject<Item> Dysprosium_Block_Item = ITEMS.register("dysprosium_block", () -> new BlockItemBase(MinerologyBlocks.Dysprosium_Block.get()));
    public static final RegistryObject<Item> Einsteinium_Block_Item = ITEMS.register("einsteinium_block", () -> new BlockItemBase(MinerologyBlocks.Einsteinium_Block.get()));
    public static final RegistryObject<Item> Erbium_Block_Item = ITEMS.register("erbium_block", () -> new BlockItemBase(MinerologyBlocks.Erbium_Block.get()));
    public static final RegistryObject<Item> Europium_Block_Item = ITEMS.register("europium_block", () -> new BlockItemBase(MinerologyBlocks.Europium_Block.get()));
    public static final RegistryObject<Item> Fermium_Block_Item = ITEMS.register("fermium_block", () -> new BlockItemBase(MinerologyBlocks.Fermium_Block.get()));
    public static final RegistryObject<Item> Flerovium_Block_Item = ITEMS.register("flerovium_block", () -> new BlockItemBase(MinerologyBlocks.Flerovium_Block.get()));
    public static final RegistryObject<Item> Francium_Block_Item = ITEMS.register("francium_block", () -> new BlockItemBase(MinerologyBlocks.Francium_Block.get()));
    public static final RegistryObject<Item> Gadolinium_Block_Item = ITEMS.register("gadolinium_block", () -> new BlockItemBase(MinerologyBlocks.Gadolinium_Block.get()));
    public static final RegistryObject<Item> Gallium_Block_Item = ITEMS.register("gallium_block", () -> new BlockItemBase(MinerologyBlocks.Gallium_Block.get()));
    public static final RegistryObject<Item> Hafnium_Block_Item = ITEMS.register("hafnium_block", () -> new BlockItemBase(MinerologyBlocks.Hafnium_Block.get()));
    public static final RegistryObject<Item> Hassium_Block_Item = ITEMS.register("hassium_block", () -> new BlockItemBase(MinerologyBlocks.Hassium_Block.get()));
    public static final RegistryObject<Item> Holmium_Block_Item = ITEMS.register("holmium_block", () -> new BlockItemBase(MinerologyBlocks.Holmium_Block.get()));
    public static final RegistryObject<Item> Indium_Block_Item = ITEMS.register("indium_block", () -> new BlockItemBase(MinerologyBlocks.Indium_Block.get()));
    public static final RegistryObject<Item> Iridium_Block_Item = ITEMS.register("iridium_block", () -> new BlockItemBase(MinerologyBlocks.Iridium_Block.get()));
    public static final RegistryObject<Item> Lanthanum_Block_Item = ITEMS.register("lanthanum_block", () -> new BlockItemBase(MinerologyBlocks.Lanthanum_Block.get()));
    public static final RegistryObject<Item> Lawrencium_Block_Item = ITEMS.register("lawrencium_block", () -> new BlockItemBase(MinerologyBlocks.Lawrencium_Block.get()));
    public static final RegistryObject<Item> Lead_Block_Item = ITEMS.register("lead_block", () -> new BlockItemBase(MinerologyBlocks.Lead_Block.get()));
    public static final RegistryObject<Item> Lithium_Block_Item = ITEMS.register("lithium_block", () -> new BlockItemBase(MinerologyBlocks.Lithium_Block.get()));
    public static final RegistryObject<Item> Livermorium_Block_Item = ITEMS.register("livermorium_block", () -> new BlockItemBase(MinerologyBlocks.Livermorium_Block.get()));
    public static final RegistryObject<Item> Lutetium_Block_Item = ITEMS.register("lutetium_block", () -> new BlockItemBase(MinerologyBlocks.Lutetium_Block.get()));
    public static final RegistryObject<Item> Magnesium_Block_Item = ITEMS.register("magnesium_block", () -> new BlockItemBase(MinerologyBlocks.Magnesium_Block.get()));
    public static final RegistryObject<Item> Manganese_Block_Item = ITEMS.register("manganese_block", () -> new BlockItemBase(MinerologyBlocks.Manganese_Block.get()));
    public static final RegistryObject<Item> Meitnerium_Block_Item = ITEMS.register("meitnerium_block", () -> new BlockItemBase(MinerologyBlocks.Meitnerium_Block.get()));
    public static final RegistryObject<Item> Mendelevium_Block_Item = ITEMS.register("mendelevium_block", () -> new BlockItemBase(MinerologyBlocks.Mendelevium_Block.get()));
    public static final RegistryObject<Item> Mercury_Block_Item = ITEMS.register("mercury_block", () -> new BlockItemBase(MinerologyBlocks.Mercury_Block.get()));
    public static final RegistryObject<Item> Molybdenum_Block_Item = ITEMS.register("molybdenum_block", () -> new BlockItemBase(MinerologyBlocks.Molybdenum_Block.get()));
    public static final RegistryObject<Item> Moscovium_Block_Item = ITEMS.register("moscovium_block", () -> new BlockItemBase(MinerologyBlocks.Moscovium_Block.get()));
    public static final RegistryObject<Item> Neodymium_Block_Item = ITEMS.register("neodymium_block", () -> new BlockItemBase(MinerologyBlocks.Neodymium_Block.get()));
    public static final RegistryObject<Item> Neptunium_Block_Item = ITEMS.register("neptunium_block", () -> new BlockItemBase(MinerologyBlocks.Neptunium_Block.get()));
    public static final RegistryObject<Item> Nickel_Block_Item = ITEMS.register("nickel_block", () -> new BlockItemBase(MinerologyBlocks.Nickel_Block.get()));
    public static final RegistryObject<Item> Nihonium_Block_Item = ITEMS.register("nihonium_block", () -> new BlockItemBase(MinerologyBlocks.Nihonium_Block.get()));
    public static final RegistryObject<Item> Niobium_Block_Item = ITEMS.register("niobium_block", () -> new BlockItemBase(MinerologyBlocks.Niobium_Block.get()));
    public static final RegistryObject<Item> Nobelium_Block_Item = ITEMS.register("nobelium_block", () -> new BlockItemBase(MinerologyBlocks.Nobelium_Block.get()));
    public static final RegistryObject<Item> Oganesson_Block_Item = ITEMS.register("oganesson_block", () -> new BlockItemBase(MinerologyBlocks.Oganesson_Block.get()));
    public static final RegistryObject<Item> Osmium_Block_Item = ITEMS.register("osmium_block", () -> new BlockItemBase(MinerologyBlocks.Osmium_Block.get()));
    public static final RegistryObject<Item> Palladium_Block_Item = ITEMS.register("palladium_block", () -> new BlockItemBase(MinerologyBlocks.Palladium_Block.get()));
    public static final RegistryObject<Item> Platinum_Block_Item = ITEMS.register("platinum_block", () -> new BlockItemBase(MinerologyBlocks.Platinum_Block.get()));
    public static final RegistryObject<Item> Plutonium_Block_Item = ITEMS.register("plutonium_block", () -> new BlockItemBase(MinerologyBlocks.Plutonium_Block.get()));
    public static final RegistryObject<Item> Potassium_Block_Item = ITEMS.register("potassium_block", () -> new BlockItemBase(MinerologyBlocks.Potassium_Block.get()));
    public static final RegistryObject<Item> Praseodymium_Block_Item = ITEMS.register("praseodymium_block", () -> new BlockItemBase(MinerologyBlocks.Praseodymium_Block.get()));
    public static final RegistryObject<Item> Promethium_Block_Item = ITEMS.register("promethium_block", () -> new BlockItemBase(MinerologyBlocks.Promethium_Block.get()));
    public static final RegistryObject<Item> Protactinium_Block_Item = ITEMS.register("protactinium_block", () -> new BlockItemBase(MinerologyBlocks.Protactinium_Block.get()));
    public static final RegistryObject<Item> Radium_Block_Item = ITEMS.register("radium_block", () -> new BlockItemBase(MinerologyBlocks.Radium_Block.get()));
    public static final RegistryObject<Item> Rhenium_Block_Item = ITEMS.register("rhenium_block", () -> new BlockItemBase(MinerologyBlocks.Rhenium_Block.get()));
    public static final RegistryObject<Item> Rhodium_Block_Item = ITEMS.register("rhodium_block", () -> new BlockItemBase(MinerologyBlocks.Rhodium_Block.get()));
    public static final RegistryObject<Item> Roentgenium_Block_Item = ITEMS.register("roentgenium_block", () -> new BlockItemBase(MinerologyBlocks.Roentgenium_Block.get()));
    public static final RegistryObject<Item> Rubidium_Block_Item = ITEMS.register("rubidium_block", () -> new BlockItemBase(MinerologyBlocks.Rubidium_Block.get()));
    public static final RegistryObject<Item> Ruthenium_Block_Item = ITEMS.register("ruthenium_block", () -> new BlockItemBase(MinerologyBlocks.Ruthenium_Block.get()));
    public static final RegistryObject<Item> Rutherfordium_Block_Item = ITEMS.register("rutherfordium_block", () -> new BlockItemBase(MinerologyBlocks.Rutherfordium_Block.get()));
    public static final RegistryObject<Item> Samarium_Block_Item = ITEMS.register("samarium_block", () -> new BlockItemBase(MinerologyBlocks.Samarium_Block.get()));
    public static final RegistryObject<Item> Scandium_Block_Item = ITEMS.register("scandium_block", () -> new BlockItemBase(MinerologyBlocks.Scandium_Block.get()));
    public static final RegistryObject<Item> Seaborgium_Block_Item = ITEMS.register("seaborgium_block", () -> new BlockItemBase(MinerologyBlocks.Seaborgium_Block.get()));
    public static final RegistryObject<Item> Silver_Block_Item = ITEMS.register("silver_block", () -> new BlockItemBase(MinerologyBlocks.Silver_Block.get()));
    public static final RegistryObject<Item> Strontium_Block_Item = ITEMS.register("strontium_block", () -> new BlockItemBase(MinerologyBlocks.Strontium_Block.get()));
    public static final RegistryObject<Item> Tantalum_Block_Item = ITEMS.register("tantalum_block", () -> new BlockItemBase(MinerologyBlocks.Tantalum_Block.get()));
    public static final RegistryObject<Item> Technetium_Block_Item = ITEMS.register("technetium_block", () -> new BlockItemBase(MinerologyBlocks.Technetium_Block.get()));
    public static final RegistryObject<Item> Tennessine_Block_Item = ITEMS.register("tennessine_block", () -> new BlockItemBase(MinerologyBlocks.Tennessine_Block.get()));
    public static final RegistryObject<Item> Terbium_Block_Item = ITEMS.register("terbium_block", () -> new BlockItemBase(MinerologyBlocks.Terbium_Block.get()));
    public static final RegistryObject<Item> Thallium_Block_Item = ITEMS.register("thallium_block", () -> new BlockItemBase(MinerologyBlocks.Thallium_Block.get()));
    public static final RegistryObject<Item> Thorium_Block_Item = ITEMS.register("thorium_block", () -> new BlockItemBase(MinerologyBlocks.Thorium_Block.get()));
    public static final RegistryObject<Item> Thulium_Block_Item = ITEMS.register("thulium_block", () -> new BlockItemBase(MinerologyBlocks.Thulium_Block.get()));
    public static final RegistryObject<Item> Tin_Block_Item = ITEMS.register("tin_block", () -> new BlockItemBase(MinerologyBlocks.Tin_Block.get()));
    public static final RegistryObject<Item> Titanium_Block_Item = ITEMS.register("titanium_block", () -> new BlockItemBase(MinerologyBlocks.Titanium_Block.get()));
    public static final RegistryObject<Item> Tungsten_Block_Item = ITEMS.register("tungsten_block", () -> new BlockItemBase(MinerologyBlocks.Tungsten_Block.get()));
    public static final RegistryObject<Item> Uranium_Block_Item = ITEMS.register("uranium_block", () -> new BlockItemBase(MinerologyBlocks.Uranium_Block.get()));
    public static final RegistryObject<Item> Vanadium_Block_Item = ITEMS.register("vanadium_block", () -> new BlockItemBase(MinerologyBlocks.Vanadium_Block.get()));
    public static final RegistryObject<Item> Ytterbium_Block_Item = ITEMS.register("ytterbium_block", () -> new BlockItemBase(MinerologyBlocks.Ytterbium_Block.get()));
    public static final RegistryObject<Item> Yttrium_Block_Item = ITEMS.register("yttrium_block", () -> new BlockItemBase(MinerologyBlocks.Yttrium_Block.get()));
    public static final RegistryObject<Item> Zinc_Block_Item = ITEMS.register("zinc_block", () -> new BlockItemBase(MinerologyBlocks.Zinc_Block.get()));
    public static final RegistryObject<Item> Zirconium_Block_Item = ITEMS.register("zirconium_block", () -> new BlockItemBase(MinerologyBlocks.Zirconium_Block.get()));
    public static final RegistryObject<Item> Aegirine_Block_Item = ITEMS.register("aegirine_block", () -> new BlockItemBase(MinerologyBlocks.Aegirine_Block.get()));
    public static final RegistryObject<Item> Amber_Block_Item = ITEMS.register("amber_block", () -> new BlockItemBase(MinerologyBlocks.Amber_Block.get()));
    public static final RegistryObject<Item> Amethyst_Block_Item = ITEMS.register("amethyst_block", () -> new BlockItemBase(MinerologyBlocks.Amethyst_Block.get()));
    public static final RegistryObject<Item> Antimony_Block_Item = ITEMS.register("antimony_block", () -> new BlockItemBase(MinerologyBlocks.Antimony_Block.get()));
    public static final RegistryObject<Item> Apatite_Block_Item = ITEMS.register("apatite_block", () -> new BlockItemBase(MinerologyBlocks.Apatite_Block.get()));
    public static final RegistryObject<Item> Aquaum_Block_Item = ITEMS.register("aquaum_block", () -> new BlockItemBase(MinerologyBlocks.Aquaum_Block.get()));
    public static final RegistryObject<Item> Arctite_Block_Item = ITEMS.register("arctite_block", () -> new BlockItemBase(MinerologyBlocks.Arctite_Block.get()));
    public static final RegistryObject<Item> Arsenic_Block_Item = ITEMS.register("arsenic_block", () -> new BlockItemBase(MinerologyBlocks.Arsenic_Block.get()));
    public static final RegistryObject<Item> Avotum_Block_Item = ITEMS.register("avotum_block", () -> new BlockItemBase(MinerologyBlocks.Avotum_Block.get()));
    public static final RegistryObject<Item> Azurite_Block_Item = ITEMS.register("azurite_block", () -> new BlockItemBase(MinerologyBlocks.Azurite_Block.get()));
    public static final RegistryObject<Item> Balonium_Block_Item = ITEMS.register("balonium_block", () -> new BlockItemBase(MinerologyBlocks.Balonium_Block.get()));
    public static final RegistryObject<Item> Barite_Block_Item = ITEMS.register("barite_block", () -> new BlockItemBase(MinerologyBlocks.Barite_Block.get()));
    public static final RegistryObject<Item> Bornite_Block_Item = ITEMS.register("bornite_block", () -> new BlockItemBase(MinerologyBlocks.Bornite_Block.get()));
    public static final RegistryObject<Item> Beryl_Block_Item = ITEMS.register("beryl_block", () -> new BlockItemBase(MinerologyBlocks.Beryl_Block.get()));
    public static final RegistryObject<Item> Boron_Block_Item = ITEMS.register("boron_block", () -> new BlockItemBase(MinerologyBlocks.Boron_Block.get()));
    public static final RegistryObject<Item> Burptonium_Block_Item = ITEMS.register("burptonium_block", () -> new BlockItemBase(MinerologyBlocks.Burptonium_Block.get()));
    public static final RegistryObject<Item> Calcite_Block_Item = ITEMS.register("calcite_block", () -> new BlockItemBase(MinerologyBlocks.Calcite_Block.get()));
    public static final RegistryObject<Item> Cinnabar_Block_Item = ITEMS.register("cinnabar_block", () -> new BlockItemBase(MinerologyBlocks.Cinnabar_Block.get()));
    public static final RegistryObject<Item> Craintum_Block_Item = ITEMS.register("craintum_block", () -> new BlockItemBase(MinerologyBlocks.Craintum_Block.get()));
    public static final RegistryObject<Item> Dandium_Block_Item = ITEMS.register("dandium_block", () -> new BlockItemBase(MinerologyBlocks.Dandium_Block.get()));
    public static final RegistryObject<Item> Diopside_Block_Item = ITEMS.register("diopside_block", () -> new BlockItemBase(MinerologyBlocks.Diopside_Block.get()));
    public static final RegistryObject<Item> Dithulium_Block_Item = ITEMS.register("dithulium_block", () -> new BlockItemBase(MinerologyBlocks.Dithulium_Block.get()));
    public static final RegistryObject<Item> Fieryum_Block_Item = ITEMS.register("fieryum_block", () -> new BlockItemBase(MinerologyBlocks.Fieryum_Block.get()));
    public static final RegistryObject<Item> Fluorite_Block_Item = ITEMS.register("fluorite_block", () -> new BlockItemBase(MinerologyBlocks.Fluorite_Block.get()));
    public static final RegistryObject<Item> Germanium_Block_Item = ITEMS.register("germanium_block", () -> new BlockItemBase(MinerologyBlocks.Germanium_Block.get()));
    public static final RegistryObject<Item> Gingerite_Block_Item = ITEMS.register("gingerite_block", () -> new BlockItemBase(MinerologyBlocks.Gingerite_Block.get()));
    public static final RegistryObject<Item> Jade_Block_Item = ITEMS.register("jade_block", () -> new BlockItemBase(MinerologyBlocks.Jade_Block.get()));
    public static final RegistryObject<Item> Jenite_Block_Item = ITEMS.register("jenite_block", () -> new BlockItemBase(MinerologyBlocks.Jenite_Block.get()));
    public static final RegistryObject<Item> Jeromium_Block_Item = ITEMS.register("jeromium_block", () -> new BlockItemBase(MinerologyBlocks.Jeromium_Block.get()));
    public static final RegistryObject<Item> Kyanite_Block_Item = ITEMS.register("kyanite_block", () -> new BlockItemBase(MinerologyBlocks.Kyanite_Block.get()));
    public static final RegistryObject<Item> Leafyum_Block_Item = ITEMS.register("leafyum_block", () -> new BlockItemBase(MinerologyBlocks.Leafyum_Block.get()));
    public static final RegistryObject<Item> Logdotium_Block_Item = ITEMS.register("logdotium_block", () -> new BlockItemBase(MinerologyBlocks.Logdotium_Block.get()));
    public static final RegistryObject<Item> Lunium_Block_Item = ITEMS.register("lunium_block", () -> new BlockItemBase(MinerologyBlocks.Lunium_Block.get()));
    public static final RegistryObject<Item> Melonlonyum_Block_Item = ITEMS.register("melonlonyum_block", () -> new BlockItemBase(MinerologyBlocks.Melonlonyum_Block.get()));
    public static final RegistryObject<Item> Mumbonium_Block_Item = ITEMS.register("mumbonium_block", () -> new BlockItemBase(MinerologyBlocks.Mumbonium_Block.get()));
    public static final RegistryObject<Item> Phosphorus_Block_Item = ITEMS.register("phosphorus_block", () -> new BlockItemBase(MinerologyBlocks.Phosphorus_Block.get()));
    public static final RegistryObject<Item> Pootonium_Block_Item = ITEMS.register("pootonium_block", () -> new BlockItemBase(MinerologyBlocks.Pootonium_Block.get()));
    public static final RegistryObject<Item> Popularite_Block_Item = ITEMS.register("popularite_block", () -> new BlockItemBase(MinerologyBlocks.Popularite_Block.get()));
    public static final RegistryObject<Item> Pumpkinite_Block_Item = ITEMS.register("pumpkinite_block", () -> new BlockItemBase(MinerologyBlocks.Pumpkinite_Block.get()));
    public static final RegistryObject<Item> Redintium_Block_Item = ITEMS.register("redintium_block", () -> new BlockItemBase(MinerologyBlocks.Redintium_Block.get()));
    public static final RegistryObject<Item> Ruby_Block_Item = ITEMS.register("ruby_block", () -> new BlockItemBase(MinerologyBlocks.Ruby_Block.get()));
    public static final RegistryObject<Item> Sapphire_Block_Item = ITEMS.register("sapphire_block", () -> new BlockItemBase(MinerologyBlocks.Sapphire_Block.get()));
    public static final RegistryObject<Item> Selenium_Block_Item = ITEMS.register("selenium_block", () -> new BlockItemBase(MinerologyBlocks.Selenium_Block.get()));
    public static final RegistryObject<Item> Silicon_Block_Item = ITEMS.register("silicon_block", () -> new BlockItemBase(MinerologyBlocks.Silicon_Block.get()));
    public static final RegistryObject<Item> Sodium_Block_Item = ITEMS.register("sodium_block", () -> new BlockItemBase(MinerologyBlocks.Sodium_Block.get()));
    public static final RegistryObject<Item> Solium_Block_Item = ITEMS.register("solium_block", () -> new BlockItemBase(MinerologyBlocks.Solium_Block.get()));
    public static final RegistryObject<Item> Sparkpolium_Block_Item = ITEMS.register("sparkpolium_block", () -> new BlockItemBase(MinerologyBlocks.Sparkpolium_Block.get()));
    public static final RegistryObject<Item> Ssundium_Block_Item = ITEMS.register("ssundium_block", () -> new BlockItemBase(MinerologyBlocks.Ssundium_Block.get()));
    public static final RegistryObject<Item> Sulfur_Block_Item = ITEMS.register("sulfur_block", () -> new BlockItemBase(MinerologyBlocks.Sulfur_Block.get()));
    public static final RegistryObject<Item> Teknum_Block_Item = ITEMS.register("teknum_block", () -> new BlockItemBase(MinerologyBlocks.Teknum_Block.get()));
    public static final RegistryObject<Item> Tellurium_Block_Item = ITEMS.register("tellurium_block", () -> new BlockItemBase(MinerologyBlocks.Tellurium_Block.get()));
    public static final RegistryObject<Item> Theanum_Block_Item = ITEMS.register("theanum_block", () -> new BlockItemBase(MinerologyBlocks.Theanum_Block.get()));
    public static final RegistryObject<Item> Thinknum_Block_Item = ITEMS.register("thinknum_block", () -> new BlockItemBase(MinerologyBlocks.Thinknum_Block.get()));
    public static final RegistryObject<Item> Topaz_Block_Item = ITEMS.register("topaz_block", () -> new BlockItemBase(MinerologyBlocks.Topaz_Block.get()));
    public static final RegistryObject<Item> Vibranium_Block_Item = ITEMS.register("vibranium_block", () -> new BlockItemBase(MinerologyBlocks.Vibranium_Block.get()));
    public static final RegistryObject<Item> Windium_Block_Item = ITEMS.register("windium_block", () -> new BlockItemBase(MinerologyBlocks.Windium_Block.get()));
    public static final RegistryObject<Item> Wooftonium_Block_Item = ITEMS.register("wooftonium_block", () -> new BlockItemBase(MinerologyBlocks.Wooftonium_Block.get()));

    // Tools
    public  static final RegistryObject<SwordItem> Aluminum_Sword = ITEMS.register("aluminum_sword", () ->
            new SwordItem(MinerologyItemTier.ALUMINUM, 3, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<PickaxeItem> Aluminum_Pickaxe = ITEMS.register("aluminum_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.ALUMINUM, 1, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<AxeItem> Aluminum_Axe = ITEMS.register("aluminum_axe", () ->
            new AxeItem(MinerologyItemTier.ALUMINUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<ShovelItem> Aluminum_Shovel = ITEMS.register("aluminum_shovel", () ->
            new ShovelItem(MinerologyItemTier.ALUMINUM, 1, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<HoeItem> Aluminum_Hoe = ITEMS.register("aluminum_hoe", () ->
            new HoeItem(MinerologyItemTier.ALUMINUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Beryllium_Sword = ITEMS.register("beryllium_sword", () ->
            new SwordItem(MinerologyItemTier.BERYLLIUM, 5, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Beryllium_Pickaxe = ITEMS.register("beryllium_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.BERYLLIUM, 3, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Beryllium_Axe = ITEMS.register("beryllium_axe", () ->
            new AxeItem(MinerologyItemTier.BERYLLIUM, 7, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Beryllium_Shovel = ITEMS.register("beryllium_shovel", () ->
            new ShovelItem(MinerologyItemTier.BERYLLIUM, 3, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Beryllium_Hoe = ITEMS.register("beryllium_hoe", () ->
            new HoeItem(MinerologyItemTier.BERYLLIUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Bismuth_Sword = ITEMS.register("bismuth_sword", () ->
            new SwordItem(MinerologyItemTier.BISMUTH, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Bismuth_Pickaxe = ITEMS.register("bismuth_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.BISMUTH, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Bismuth_Axe = ITEMS.register("bismuth_axe", () ->
            new AxeItem(MinerologyItemTier.BISMUTH, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Bismuth_Shovel = ITEMS.register("bismuth_shovel", () ->
            new ShovelItem(MinerologyItemTier.BISMUTH, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Bismuth_Hoe = ITEMS.register("bismuth_hoe", () ->
            new HoeItem(MinerologyItemTier.BISMUTH, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Chromium_Sword = ITEMS.register("chromium_sword", () ->
            new SwordItem(MinerologyItemTier.CHROMIUM, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Chromium_Pickaxe = ITEMS.register("chromium_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.CHROMIUM, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Chromium_Axe = ITEMS.register("chromium_axe", () ->
            new AxeItem(MinerologyItemTier.CHROMIUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Chromium_Shovel = ITEMS.register("chromium_shovel", () ->
            new ShovelItem(MinerologyItemTier.CHROMIUM, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Chromium_Hoe = ITEMS.register("chromium_hoe", () ->
            new HoeItem(MinerologyItemTier.CHROMIUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Cobalt_Sword = ITEMS.register("cobalt_sword", () ->
            new SwordItem(MinerologyItemTier.COBALT, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Cobalt_Pickaxe = ITEMS.register("cobalt_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.COBALT, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Cobalt_Axe = ITEMS.register("cobalt_axe", () ->
            new AxeItem(MinerologyItemTier.COBALT, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Cobalt_Shovel = ITEMS.register("cobalt_shovel", () ->
            new ShovelItem(MinerologyItemTier.COBALT, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Cobalt_Hoe = ITEMS.register("cobalt_hoe", () ->
            new HoeItem(MinerologyItemTier.COBALT, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Copper_Sword = ITEMS.register("copper_sword", () ->
            new SwordItem(MinerologyItemTier.COPPER, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Copper_Pickaxe = ITEMS.register("copper_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.COPPER, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Copper_Axe = ITEMS.register("copper_axe", () ->
            new AxeItem(MinerologyItemTier.COPPER, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Copper_Shovel = ITEMS.register("copper_shovel", () ->
            new ShovelItem(MinerologyItemTier.COPPER, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Copper_Hoe = ITEMS.register("copper_hoe", () ->
            new HoeItem(MinerologyItemTier.COPPER, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Indium_Sword = ITEMS.register("indium_sword", () ->
            new SwordItem(MinerologyItemTier.INDIUM, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Indium_Pickaxe = ITEMS.register("indium_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.INDIUM, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Indium_Axe = ITEMS.register("indium_axe", () ->
            new AxeItem(MinerologyItemTier.INDIUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Indium_Shovel = ITEMS.register("indium_shovel", () ->
            new ShovelItem(MinerologyItemTier.INDIUM, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Indium_Hoe = ITEMS.register("indium_hoe", () ->
            new HoeItem(MinerologyItemTier.INDIUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Iridium_Sword = ITEMS.register("iridium_sword", () ->
            new SwordItem(MinerologyItemTier.IRIDIUM, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Iridium_Pickaxe = ITEMS.register("iridium_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.IRIDIUM, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Iridium_Axe = ITEMS.register("iridium_axe", () ->
            new AxeItem(MinerologyItemTier.IRIDIUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Iridium_Shovel = ITEMS.register("iridium_shovel", () ->
            new ShovelItem(MinerologyItemTier.IRIDIUM, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Iridium_Hoe = ITEMS.register("iridium_hoe", () ->
            new HoeItem(MinerologyItemTier.IRIDIUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Nickel_Sword = ITEMS.register("nickel_sword", () ->
            new SwordItem(MinerologyItemTier.NICKEL, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Nickel_Pickaxe = ITEMS.register("nickel_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.NICKEL, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Nickel_Axe = ITEMS.register("nickel_axe", () ->
            new AxeItem(MinerologyItemTier.NICKEL, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Nickel_Shovel = ITEMS.register("nickel_shovel", () ->
            new ShovelItem(MinerologyItemTier.NICKEL, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Nickel_Hoe = ITEMS.register("nickel_hoe", () ->
            new HoeItem(MinerologyItemTier.NICKEL, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Osmium_Sword = ITEMS.register("osmium_sword", () ->
            new SwordItem(MinerologyItemTier.OSMIUM, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Osmium_Pickaxe = ITEMS.register("osmium_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.OSMIUM, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Osmium_Axe = ITEMS.register("osmium_axe", () ->
            new AxeItem(MinerologyItemTier.OSMIUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Osmium_Shovel = ITEMS.register("osmium_shovel", () ->
            new ShovelItem(MinerologyItemTier.OSMIUM, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Osmium_Hoe = ITEMS.register("osmium_hoe", () ->
            new HoeItem(MinerologyItemTier.OSMIUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Platinum_Sword = ITEMS.register("platinum_sword", () ->
            new SwordItem(MinerologyItemTier.PLATINUM, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Platinum_Pickaxe = ITEMS.register("platinum_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.PLATINUM, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Platinum_Axe = ITEMS.register("platinum_axe", () ->
            new AxeItem(MinerologyItemTier.PLATINUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Platinum_Shovel = ITEMS.register("platinum_shovel", () ->
            new ShovelItem(MinerologyItemTier.PLATINUM, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Platinum_Hoe = ITEMS.register("platinum_hoe", () ->
            new HoeItem(MinerologyItemTier.PLATINUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Silver_Sword = ITEMS.register("silver_sword", () ->
            new SwordItem(MinerologyItemTier.SILVER, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Silver_Pickaxe = ITEMS.register("silver_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.SILVER, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Silver_Axe = ITEMS.register("silver_axe", () ->
            new AxeItem(MinerologyItemTier.SILVER, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Silver_Shovel = ITEMS.register("silver_shovel", () ->
            new ShovelItem(MinerologyItemTier.SILVER, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Silver_Hoe = ITEMS.register("silver_hoe", () ->
            new HoeItem(MinerologyItemTier.SILVER, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Tantalum_Sword = ITEMS.register("tantalum_sword", () ->
            new SwordItem(MinerologyItemTier.TANTALUM, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tantalum_Pickaxe = ITEMS.register("tantalum_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.TANTALUM, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tantalum_Axe = ITEMS.register("tantalum_axe", () ->
            new AxeItem(MinerologyItemTier.TANTALUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tantalum_Shovel = ITEMS.register("tantalum_shovel", () ->
            new ShovelItem(MinerologyItemTier.TANTALUM, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tantalum_Hoe = ITEMS.register("tantalum_hoe", () ->
            new HoeItem(MinerologyItemTier.TANTALUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Tin_Sword = ITEMS.register("tin_sword", () ->
            new SwordItem(MinerologyItemTier.TIN, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tin_Pickaxe = ITEMS.register("tin_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.TIN, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tin_Axe = ITEMS.register("tin_axe", () ->
            new AxeItem(MinerologyItemTier.TIN, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tin_Shovel = ITEMS.register("tin_shovel", () ->
            new ShovelItem(MinerologyItemTier.TIN, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tin_Hoe = ITEMS.register("tin_hoe", () ->
            new HoeItem(MinerologyItemTier.TIN, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Titanium_Sword = ITEMS.register("titanium_sword", () ->
            new SwordItem(MinerologyItemTier.TITANIUM, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Titanium_Pickaxe = ITEMS.register("titanium_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.TITANIUM, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Titanium_Axe = ITEMS.register("titanium_axe", () ->
            new AxeItem(MinerologyItemTier.TITANIUM, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Titanium_Shovel = ITEMS.register("titanium_shovel", () ->
            new ShovelItem(MinerologyItemTier.TITANIUM, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Titanium_Hoe = ITEMS.register("titanium_hoe", () ->
            new HoeItem(MinerologyItemTier.TITANIUM, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Tungsten_Sword = ITEMS.register("tungsten_sword", () ->
            new SwordItem(MinerologyItemTier.TUNGSTEN, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tungsten_Pickaxe = ITEMS.register("tungsten_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.TUNGSTEN, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tungsten_Axe = ITEMS.register("tungsten_axe", () ->
            new AxeItem(MinerologyItemTier.TUNGSTEN, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tungsten_Shovel = ITEMS.register("tungsten_shovel", () ->
            new ShovelItem(MinerologyItemTier.TUNGSTEN, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Tungsten_Hoe = ITEMS.register("tungsten_hoe", () ->
            new HoeItem(MinerologyItemTier.TUNGSTEN, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Obsidian_Sword = ITEMS.register("obsidian_sword", () ->
            new SwordItem(MinerologyItemTier.OBSIDIAN, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Obsidian_Pickaxe = ITEMS.register("obsidian_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.OBSIDIAN, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Obsidian_Axe = ITEMS.register("obsidian_axe", () ->
            new AxeItem(MinerologyItemTier.OBSIDIAN, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Obsidian_Shovel = ITEMS.register("obsidian_shovel", () ->
            new ShovelItem(MinerologyItemTier.OBSIDIAN, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Obsidian_Hoe = ITEMS.register("obsidian_hoe", () ->
            new HoeItem(MinerologyItemTier.OBSIDIAN, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Lapis_Sword = ITEMS.register("lapis_sword", () ->
            new SwordItem(MinerologyItemTier.LAPIS, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Lapis_Pickaxe = ITEMS.register("lapis_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.LAPIS, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Lapis_Axe = ITEMS.register("lapis_axe", () ->
            new AxeItem(MinerologyItemTier.LAPIS, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Lapis_Shovel = ITEMS.register("lapis_shovel", () ->
            new ShovelItem(MinerologyItemTier.LAPIS, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Lapis_Hoe = ITEMS.register("lapis_hoe", () ->
            new HoeItem(MinerologyItemTier.LAPIS, -2, new Item.Properties().group(Minerology.TAB)));

    public  static final RegistryObject<Item> Emerald_Sword = ITEMS.register("emerald_sword", () ->
            new SwordItem(MinerologyItemTier.EMERALD, 4, -2.4F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Emerald_Pickaxe = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(MinerologyItemTier.EMERALD, 2, -2.8F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Emerald_Axe = ITEMS.register("emerald_axe", () ->
            new AxeItem(MinerologyItemTier.EMERALD, 6, -3.1F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Emerald_Shovel = ITEMS.register("emerald_shovel", () ->
            new ShovelItem(MinerologyItemTier.EMERALD, 2, -3F, new Item.Properties().group(Minerology.TAB)));
    public  static final RegistryObject<Item> Emerald_Hoe = ITEMS.register("emerald_hoe", () ->
            new HoeItem(MinerologyItemTier.EMERALD, -2, new Item.Properties().group(Minerology.TAB)));
}
