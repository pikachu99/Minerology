package com.theredinventor.minerology.items;

import com.theredinventor.minerology.Minerology;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase(){
        super(new Item.Properties().group(Minerology.TAB));
    }
}
