package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static com.theredinventor.minerology.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Minerology.MODID);
    public static final RegistryObject<BlockItem> Aluminum_Ore = addToTab(ITEMS.register("aluminum_ore",
            () -> new BlockItem(BlockInit.Aluminum_Ore.get(),new Item.Properties())));
    public static final RegistryObject<Item> Raw_Aluminum = addToTab(ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<Item> Aluminum_Ingot = addToTab(ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties())));
    public static final RegistryObject<BlockItem> Aluminum_Block = addToTab(ITEMS.register("aluminum_block",
            () -> new BlockItem(BlockInit.Aluminum_Block.get(),new Item.Properties())));
}
