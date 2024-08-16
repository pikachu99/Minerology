package com.theredinventor.minerology.enchantment;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;

public class ArmorEnchantments {
    public static final ResourceKey<Enchantment> Curse_Of_Radiation = ModEnchanmentHelper.createResourceKey("curse_of_radiation");
    public static final ResourceKey<Enchantment> Curse_Of_Attraction = ModEnchanmentHelper.createResourceKey("curse_of_attraction");
    public static final ResourceKey<Enchantment> Curse_Of_Repulsion = ModEnchanmentHelper.createResourceKey("curse_of_repulsion");
    public static final ResourceKey<Enchantment> Radiation_Protection = ModEnchanmentHelper.createResourceKey("radiation_protection");
    public static final ResourceKey<Enchantment> Illumination = ModEnchanmentHelper.createResourceKey("illumination");

    public static void bootstrap(BootstrapContext<Enchantment> context) {

        HolderGetter<Item> itemsRegistry = context.lookup(Registries.ITEM);
        HolderGetter<Enchantment> enchantmentsRegistry = context.lookup(Registries.ENCHANTMENT);

        registerCurseOfRadiation(context, itemsRegistry, enchantmentsRegistry);
    }

    private static void registerCurseOfRadiation(BootstrapContext<Enchantment> context, HolderGetter<Item> itemsRegistry, HolderGetter<Enchantment> enchantmentsRegistry) {

        Enchantment.EnchantmentDefinition definition = Enchantment.definition(
                itemsRegistry.getOrThrow(ItemTags.ARMOR_ENCHANTABLE),
                5,
                4,
                Enchantment.dynamicCost(10,8),
                Enchantment.dynamicCost(18,8),
                2,
                EquipmentSlotGroup.ARMOR
        );

        Enchantment.Builder builder = Enchantment.enchantment(definition);

        // Cannot be used with other enchantments that provide protection.
        //builder.exclusiveWith(enchantmentsRegistry.getOrThrow(EnchantmentTags.ARMOR_EXCLUSIVE));

        ModEnchanmentHelper.register(context, Curse_Of_Radiation, builder);
    }
}