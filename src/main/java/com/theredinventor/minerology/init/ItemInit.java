package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.theredinventor.minerology.init.CreativeTabInit.addToGear;
import static com.theredinventor.minerology.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Minerology.MODID);
    //Registry for Actinium
    public static final RegistryObject<BlockItem> Actinium_Ore = addToTab(ITEMS.register("actinium_ore",
            () -> new BlockItem(BlockInit.Actinium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Actinium = addToTab(ITEMS.register("raw_actinium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Actinium_Block = addToTab(ITEMS.register("raw_actinium_block",
            () -> new BlockItem(BlockInit.Raw_Actinium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Actinium_Nugget = addToTab(ITEMS.register("actinium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Actinium_Ingot = addToTab(ITEMS.register("actinium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Actinium_Block = addToTab(ITEMS.register("actinium_block",
            () -> new BlockItem(BlockInit.Actinium_Block.get(),new Item.Properties())));
    //Registry for Aluminum
    public static final RegistryObject<BlockItem> Aluminum_Ore = addToTab(ITEMS.register("aluminum_ore",
            () -> new BlockItem(BlockInit.Aluminum_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Aluminum = addToTab(ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Aluminum_Block = addToTab(ITEMS.register("raw_aluminum_block",
            () -> new BlockItem(BlockInit.Raw_Aluminum_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Aluminum_Nugget = addToTab(ITEMS.register("aluminum_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Aluminum_Ingot = addToTab(ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Aluminum_Block = addToTab(ITEMS.register("aluminum_block",
            () -> new BlockItem(BlockInit.Aluminum_Block.get(),new Item.Properties())));
    //Registry for Aluminum tools
    public static final RegistryObject<SwordItem> Aluminum_Sword = addToGear(ITEMS.register("aluminum_sword",
            () -> new SwordItem(
                    TierInit.Aluminum,
                    new Item.Properties()
            )));
    //Registry for Chromium
    public static final RegistryObject<BlockItem> Chromium_Ore = addToTab(ITEMS.register("chromium_ore",
            () -> new BlockItem(BlockInit.Chromium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Chromium = addToTab(ITEMS.register("raw_chromium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Chromium_Block = addToTab(ITEMS.register("raw_chromium_block",
            () -> new BlockItem(BlockInit.Raw_Chromium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Chromium_Nugget = addToTab(ITEMS.register("chromium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Chromium_Ingot = addToTab(ITEMS.register("chromium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Chromium_Block = addToTab(ITEMS.register("chromium_block",
            () -> new BlockItem(BlockInit.Chromium_Block.get(),new Item.Properties())));
    //Registry for Cobalt
    public static final RegistryObject<BlockItem> Cobalt_Ore = addToTab(ITEMS.register("cobalt_ore",
            () -> new BlockItem(BlockInit.Cobalt_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Cobalt = addToTab(ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Cobalt_Block = addToTab(ITEMS.register("raw_cobalt_block",
            () -> new BlockItem(BlockInit.Raw_Cobalt_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Cobalt_Nugget = addToTab(ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Cobalt_Ingot = addToTab(ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Cobalt_Block = addToTab(ITEMS.register("cobalt_block",
            () -> new BlockItem(BlockInit.Cobalt_Block.get(),new Item.Properties())));
    //Registry for Iridium
    public static final RegistryObject<BlockItem> Iridium_Ore = addToTab(ITEMS.register("iridium_ore",
            () -> new BlockItem(BlockInit.Iridium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Iridium = addToTab(ITEMS.register("raw_iridium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Iridium_Block = addToTab(ITEMS.register("raw_iridium_block",
            () -> new BlockItem(BlockInit.Raw_Iridium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Iridium_Nugget = addToTab(ITEMS.register("iridium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Iridium_Ingot = addToTab(ITEMS.register("iridium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Iridium_Block = addToTab(ITEMS.register("iridium_block",
            () -> new BlockItem(BlockInit.Iridium_Block.get(),new Item.Properties())));
    //Registry for Lead
    public static final RegistryObject<BlockItem> Lead_Ore = addToTab(ITEMS.register("lead_ore",
            () -> new BlockItem(BlockInit.Lead_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Lead = addToTab(ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Lead_Block = addToTab(ITEMS.register("raw_lead_block",
            () -> new BlockItem(BlockInit.Raw_Lead_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Lead_Nugget = addToTab(ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Lead_Ingot = addToTab(ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Lead_Block = addToTab(ITEMS.register("lead_block",
            () -> new BlockItem(BlockInit.Lead_Block.get(),new Item.Properties())));
    //Registry for Lithium
    public static final RegistryObject<BlockItem> Lithium_Ore = addToTab(ITEMS.register("lithium_ore",
            () -> new BlockItem(BlockInit.Lithium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Lithium = addToTab(ITEMS.register("raw_lithium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Lithium_Block = addToTab(ITEMS.register("raw_lithium_block",
            () -> new BlockItem(BlockInit.Raw_Lithium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Lithium_Nugget = addToTab(ITEMS.register("lithium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Lithium_Ingot = addToTab(ITEMS.register("lithium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Lithium_Block = addToTab(ITEMS.register("lithium_block",
            () -> new BlockItem(BlockInit.Lithium_Block.get(),new Item.Properties())));
    //Registry for Magnesium
    public static final RegistryObject<BlockItem> Magnesium_Ore = addToTab(ITEMS.register("magnesium_ore",
            () -> new BlockItem(BlockInit.Magnesium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Magnesium = addToTab(ITEMS.register("raw_magnesium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Magnesium_Block = addToTab(ITEMS.register("raw_magnesium_block",
            () -> new BlockItem(BlockInit.Raw_Magnesium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Magnesium_Nugget = addToTab(ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Magnesium_Ingot = addToTab(ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Magnesium_Block = addToTab(ITEMS.register("magnesium_block",
            () -> new BlockItem(BlockInit.Magnesium_Block.get(),new Item.Properties())));
    //Registry for Manganese
    public static final RegistryObject<BlockItem> Manganese_Ore = addToTab(ITEMS.register("manganese_ore",
            () -> new BlockItem(BlockInit.Manganese_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Manganese = addToTab(ITEMS.register("raw_manganese",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Manganese_Block = addToTab(ITEMS.register("raw_manganese_block",
            () -> new BlockItem(BlockInit.Raw_Manganese_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Manganese_Nugget = addToTab(ITEMS.register("manganese_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Manganese_Ingot = addToTab(ITEMS.register("manganese_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Manganese_Block = addToTab(ITEMS.register("manganese_block",
            () -> new BlockItem(BlockInit.Manganese_Block.get(),new Item.Properties())));
    //Registry for Mercury
    public static final RegistryObject<BlockItem> Mercury_Ore = addToTab(ITEMS.register("mercury_ore",
            () -> new BlockItem(BlockInit.Mercury_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Mercury = addToTab(ITEMS.register("raw_mercury",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Mercury_Block = addToTab(ITEMS.register("raw_mercury_block",
            () -> new BlockItem(BlockInit.Raw_Mercury_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Mercury_Nugget = addToTab(ITEMS.register("mercury_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Mercury_Ingot = addToTab(ITEMS.register("mercury_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Mercury_Block = addToTab(ITEMS.register("mercury_block",
            () -> new BlockItem(BlockInit.Mercury_Block.get(),new Item.Properties())));
    //Registry for Neptunium
    public static final RegistryObject<BlockItem> Neptunium_Ore = addToTab(ITEMS.register("neptunium_ore",
            () -> new BlockItem(BlockInit.Neptunium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Neptunium = addToTab(ITEMS.register("raw_neptunium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Neptunium_Block = addToTab(ITEMS.register("raw_neptunium_block",
            () -> new BlockItem(BlockInit.Raw_Neptunium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Neptunium_Nugget = addToTab(ITEMS.register("neptunium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Neptunium_Ingot = addToTab(ITEMS.register("neptunium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Neptunium_Block = addToTab(ITEMS.register("neptunium_block",
            () -> new BlockItem(BlockInit.Neptunium_Block.get(),new Item.Properties())));
    //Registry for Nickel
    public static final RegistryObject<BlockItem> Nickel_Ore = addToTab(ITEMS.register("nickel_ore",
            () -> new BlockItem(BlockInit.Nickel_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Nickel = addToTab(ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Nickel_Block = addToTab(ITEMS.register("raw_nickel_block",
            () -> new BlockItem(BlockInit.Raw_Nickel_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Nickel_Nugget = addToTab(ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Nickel_Ingot = addToTab(ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Nickel_Block = addToTab(ITEMS.register("nickel_block",
            () -> new BlockItem(BlockInit.Nickel_Block.get(),new Item.Properties())));
    //Registry for Osmium
    public static final RegistryObject<BlockItem> Osmium_Ore = addToTab(ITEMS.register("osmium_ore",
            () -> new BlockItem(BlockInit.Osmium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Osmium = addToTab(ITEMS.register("raw_osmium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Osmium_Block = addToTab(ITEMS.register("raw_osmium_block",
            () -> new BlockItem(BlockInit.Raw_Osmium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Osmium_Nugget = addToTab(ITEMS.register("osmium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Osmium_Ingot = addToTab(ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Osmium_Block = addToTab(ITEMS.register("osmium_block",
            () -> new BlockItem(BlockInit.Osmium_Block.get(),new Item.Properties())));
    //Registry for Platinum
    public static final RegistryObject<BlockItem> Platinum_Ore = addToTab(ITEMS.register("platinum_ore",
            () -> new BlockItem(BlockInit.Platinum_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Platinum = addToTab(ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Platinum_Block = addToTab(ITEMS.register("raw_platinum_block",
            () -> new BlockItem(BlockInit.Raw_Platinum_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Platinum_Nugget = addToTab(ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Platinum_Ingot = addToTab(ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Platinum_Block = addToTab(ITEMS.register("platinum_block",
            () -> new BlockItem(BlockInit.Platinum_Block.get(),new Item.Properties())));
    //Registry for Plutonium
    public static final RegistryObject<BlockItem> Plutonium_Ore = addToTab(ITEMS.register("plutonium_ore",
            () -> new BlockItem(BlockInit.Plutonium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Plutonium = addToTab(ITEMS.register("raw_plutonium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Plutonium_Block = addToTab(ITEMS.register("raw_plutonium_block",
            () -> new BlockItem(BlockInit.Raw_Plutonium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Plutonium_Nugget = addToTab(ITEMS.register("plutonium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Plutonium_Ingot = addToTab(ITEMS.register("plutonium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Plutonium_Block = addToTab(ITEMS.register("plutonium_block",
            () -> new BlockItem(BlockInit.Plutonium_Block.get(),new Item.Properties())));
    //Registry for Polonium
    public static final RegistryObject<BlockItem> Polonium_Ore = addToTab(ITEMS.register("polonium_ore",
            () -> new BlockItem(BlockInit.Polonium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Polonium = addToTab(ITEMS.register("raw_polonium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Polonium_Block = addToTab(ITEMS.register("raw_polonium_block",
            () -> new BlockItem(BlockInit.Raw_Polonium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Polonium_Nugget = addToTab(ITEMS.register("polonium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Polonium_Ingot = addToTab(ITEMS.register("polonium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Polonium_Block = addToTab(ITEMS.register("polonium_block",
            () -> new BlockItem(BlockInit.Polonium_Block.get(),new Item.Properties())));
    //Registry for Promethium
    public static final RegistryObject<BlockItem> Promethium_Ore = addToTab(ITEMS.register("prometheium_ore",
            () -> new BlockItem(BlockInit.Promethium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Promethium = addToTab(ITEMS.register("raw_promethium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Promethium_Block = addToTab(ITEMS.register("raw_promethium_block",
            () -> new BlockItem(BlockInit.Raw_Promethium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Promethium_Nugget = addToTab(ITEMS.register("promethium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Promethium_Ingot = addToTab(ITEMS.register("promethium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Promethium_Block = addToTab(ITEMS.register("promethium_block",
            () -> new BlockItem(BlockInit.Promethium_Block.get(),new Item.Properties())));
    //Registry for Radium
    public static final RegistryObject<BlockItem> Radium_Ore = addToTab(ITEMS.register("radium_ore",
            () -> new BlockItem(BlockInit.Radium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Radium = addToTab(ITEMS.register("raw_radium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Radium_Block = addToTab(ITEMS.register("raw_radium_block",
            () -> new BlockItem(BlockInit.Raw_Radium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Radium_Nugget = addToTab(ITEMS.register("radium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Radium_Ingot = addToTab(ITEMS.register("radium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Radium_Block = addToTab(ITEMS.register("radium_block",
            () -> new BlockItem(BlockInit.Radium_Block.get(),new Item.Properties())));
    //Registry for Silver
    public static final RegistryObject<BlockItem> Silver_Ore = addToTab(ITEMS.register("silver_ore",
            () -> new BlockItem(BlockInit.Silver_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Silver = addToTab(ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Silver_Block = addToTab(ITEMS.register("raw_silver_block",
            () -> new BlockItem(BlockInit.Raw_Silver_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Silver_Nugget = addToTab(ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Silver_Ingot = addToTab(ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Silver_Block = addToTab(ITEMS.register("silver_block",
            () -> new BlockItem(BlockInit.Silver_Block.get(),new Item.Properties())));
    //Registry for Thorium
    public static final RegistryObject<BlockItem> Thorium_Ore = addToTab(ITEMS.register("thorium_ore",
            () -> new BlockItem(BlockInit.Thorium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Thorium = addToTab(ITEMS.register("raw_thorium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Thorium_Block = addToTab(ITEMS.register("raw_thorium_block",
            () -> new BlockItem(BlockInit.Raw_Thorium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Thorium_Nugget = addToTab(ITEMS.register("thorium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Thorium_Ingot = addToTab(ITEMS.register("thorium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Thorium_Block = addToTab(ITEMS.register("thorium_block",
            () -> new BlockItem(BlockInit.Thorium_Block.get(),new Item.Properties())));
    //Registry for Tin
    public static final RegistryObject<BlockItem> Tin_Ore = addToTab(ITEMS.register("tin_ore",
            () -> new BlockItem(BlockInit.Tin_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Tin = addToTab(ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Tin_Block = addToTab(ITEMS.register("raw_tin_block",
            () -> new BlockItem(BlockInit.Raw_Tin_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Tin_Nugget = addToTab(ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Tin_Ingot = addToTab(ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Tin_Block = addToTab(ITEMS.register("tin_block",
            () -> new BlockItem(BlockInit.Tin_Block.get(),new Item.Properties())));
    //Registry for Titanium
    public static final RegistryObject<BlockItem> Titanium_Ore = addToTab(ITEMS.register("titanium_ore",
            () -> new BlockItem(BlockInit.Titanium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Titanium = addToTab(ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Titanium_Block = addToTab(ITEMS.register("raw_titanium_block",
            () -> new BlockItem(BlockInit.Raw_Titanium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Titanium_Ingot = addToTab(ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Titanium_Nugget = addToTab(ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Titanium_Block = addToTab(ITEMS.register("titanium_block",
            () -> new BlockItem(BlockInit.Titanium_Block.get(),new Item.Properties())));
    //Registry for Tungsten
    public static final RegistryObject<BlockItem> Tungsten_Ore = addToTab(ITEMS.register("tungsten_ore",
            () -> new BlockItem(BlockInit.Tungsten_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Tungsten = addToTab(ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Tungsten_Block = addToTab(ITEMS.register("raw_tungsten_block",
            () -> new BlockItem(BlockInit.Raw_Tungsten_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Tungsten_Nugget = addToTab(ITEMS.register("tungsten_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Tungsten_Ingot = addToTab(ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Tungsten_Block = addToTab(ITEMS.register("tungsten_block",
            () -> new BlockItem(BlockInit.Tungsten_Block.get(),new Item.Properties())));
    //Registry for Uranium
    public static final RegistryObject<BlockItem> Uranium_Ore = addToTab(ITEMS.register("uranium_ore",
            () -> new BlockItem(BlockInit.Uranium_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Uranium = addToTab(ITEMS.register("raw_uranium",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Uranium_Block = addToTab(ITEMS.register("raw_uranium_block",
            () -> new BlockItem(BlockInit.Raw_Uranium_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Uranium_Nugget = addToTab(ITEMS.register("uranium_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Uranium_Ingot = addToTab(ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Uranium_Block = addToTab(ITEMS.register("uranium_block",
            () -> new BlockItem(BlockInit.Uranium_Block.get(),new Item.Properties())));
    //Registry for Zinc
    public static final RegistryObject<BlockItem> Zinc_Ore = addToTab(ITEMS.register("zinc_ore",
            () -> new BlockItem(BlockInit.Zinc_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Zinc = addToTab(ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Raw_Zinc_Block = addToTab(ITEMS.register("raw_zinc_block",
            () -> new BlockItem(BlockInit.Raw_Zinc_Block.get(),new Item.Properties())));
    public static final RegistryObject<Item> Zinc_Nugget = addToTab(ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Zinc_Ingot = addToTab(ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Zinc_Block = addToTab(ITEMS.register("zinc_block",
            () -> new BlockItem(BlockInit.Zinc_Block.get(),new Item.Properties())));
}
