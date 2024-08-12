package com.theredinventor.minerology.datagen;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Minerology.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Actinium
        simpleItem(ItemInit.Raw_Actinium);
        simpleItem(ItemInit.Actinium_Ingot);
        //Aluminum
        simpleItem(ItemInit.Raw_Aluminum);
        simpleItem(ItemInit.Aluminum_Ingot);
        //Chromium
        simpleItem(ItemInit.Raw_Chromium);
        simpleItem(ItemInit.Chromium_Ingot);
        //Cobalt
        simpleItem(ItemInit.Raw_Cobalt);
        simpleItem(ItemInit.Cobalt_Ingot);
        //Iridium
        simpleItem(ItemInit.Raw_Iridium);
        simpleItem(ItemInit.Iridium_Ingot);
        //Lead
        simpleItem(ItemInit.Raw_Lead);
        simpleItem(ItemInit.Lead_Ingot);
        //Lithium
        simpleItem(ItemInit.Raw_Lithium);
        simpleItem(ItemInit.Lithium_Ingot);
        //Magnesium
        simpleItem(ItemInit.Raw_Magnesium);
        simpleItem(ItemInit.Magnesium_Ingot);
        //Manganese
        simpleItem(ItemInit.Raw_Manganese);
        simpleItem(ItemInit.Manganese_Ingot);
        //Mercury
        simpleItem(ItemInit.Raw_Mercury);
        simpleItem(ItemInit.Mercury_Ingot);
        //Neptunium
        simpleItem(ItemInit.Raw_Neptunium);
        simpleItem(ItemInit.Neptunium_Ingot);
        //Nickel
        simpleItem(ItemInit.Raw_Nickel);
        simpleItem(ItemInit.Nickel_Ingot);
        //Osmium
        simpleItem(ItemInit.Raw_Osmium);
        simpleItem(ItemInit.Osmium_Ingot);
        //Platinum
        simpleItem(ItemInit.Raw_Platinum);
        simpleItem(ItemInit.Platinum_Ingot);
        //Plutonium
        simpleItem(ItemInit.Raw_Plutonium);
        simpleItem(ItemInit.Plutonium_Ingot);
        //Polonium
        simpleItem(ItemInit.Raw_Polonium);
        simpleItem(ItemInit.Polonium_Ingot);
        //Promethium
        simpleItem(ItemInit.Raw_Promethium);
        simpleItem(ItemInit.Promethium_Ingot);
        //Radium
        simpleItem(ItemInit.Raw_Radium);
        simpleItem(ItemInit.Radium_Ingot);
        //Silver
        simpleItem(ItemInit.Raw_Silver);
        simpleItem(ItemInit.Silver_Ingot);
        //Thorium
        simpleItem(ItemInit.Raw_Thorium);
        simpleItem(ItemInit.Thorium_Ingot);
        //Tin
        simpleItem(ItemInit.Raw_Tin);
        simpleItem(ItemInit.Tin_Ingot);
        //Titanium
        simpleItem(ItemInit.Raw_Titanium);
        simpleItem(ItemInit.Titanium_Ingot);
        //Tungsten
        simpleItem(ItemInit.Raw_Tungsten);
        simpleItem(ItemInit.Tungsten_Ingot);
        //Uranium
        simpleItem(ItemInit.Raw_Uranium);
        simpleItem(ItemInit.Uranium_Ingot);
        //Zinc
        simpleItem(ItemInit.Raw_Zinc);
        simpleItem(ItemInit.Zinc_Ingot);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return  withExistingParent(item.getId().getPath(),
                ResourceLocation.withDefaultNamespace("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Minerology.MODID, "item/" + item.getId().getPath()));
    }
}
