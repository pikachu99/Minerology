package com.theredinventor.minerology.init;

import com.theredinventor.minerology.Minerology;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Minerology.MODID);

    public static final List<Supplier<? extends ItemLike>> MINEROLOGY_GENERATION_TAB_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINEROLOGY_MATERIALS_TAB_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINEROLOGY_GEAR_TAB_ITEMS = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINEROLOGY_DECOR_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> MINEROLOGY_GENERATION_TAB = TABS.register("minerology_generation_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.minerology_generation_tab"))
                    .icon(ItemInit.Aluminum_Ingot.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            MINEROLOGY_GENERATION_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> MINEROLOGY_MATERIALS_TAB = TABS.register("minerology_materials_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.minerology_materials_tab"))
                    .icon(ItemInit.Aluminum_Ingot.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            MINEROLOGY_MATERIALS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> MINEROLOGY_GEAR_TAB = TABS.register("minerology_gear_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.minerology_gear_tab"))
                    .icon(ItemInit.Aluminum_Ingot.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            MINEROLOGY_GEAR_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> MINEROLOGY_DECOR_TAB = TABS.register("minerology_decor_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.minerology_decor_tab"))
                    .icon(ItemInit.Aluminum_Ingot.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            MINEROLOGY_DECOR_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        MINEROLOGY_GENERATION_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
    public static <T extends Item> RegistryObject<T> addToMaterial(RegistryObject<T> itemLike){
        MINEROLOGY_MATERIALS_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
    public static <T extends Item> RegistryObject<T> addToGear(RegistryObject<T> itemLike){
        MINEROLOGY_GEAR_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
    public static <T extends Item> RegistryObject<T> addToDecor(RegistryObject<T> itemLike){
        MINEROLOGY_DECOR_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}
