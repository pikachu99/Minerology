package com.theredinventor.minerology.util.enums;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.MinerologyItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MinerologyArmorMaterial implements IArmorMaterial {

    ALUMINUM(Minerology.MOD_ID + ":aluminum", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Aluminum_Ingot.get());
    }),
    BERYLLIUM(Minerology.MOD_ID + ":beryllium", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Beryllium_Ingot.get());
    }),
    BISMUTH(Minerology.MOD_ID + ":bismuth", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Bismuth_Ingot.get());
    }),
    Chromium(Minerology.MOD_ID + ":chromium", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Chromium_Ingot.get());
    }),
    Cobalt(Minerology.MOD_ID + ":cobalt", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Cobalt_Ingot.get());
    }),
    Copper(Minerology.MOD_ID + ":copper", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Copper_Ingot.get());
    }),
    Indium(Minerology.MOD_ID + ":indium", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Indium_Ingot.get());
    }),
    Iridium(Minerology.MOD_ID + ":iridium", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Iridium_Ingot.get());
    }),
    Nickel(Minerology.MOD_ID + ":nickel", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Nickel_Ingot.get());
    }),
    Osmium(Minerology.MOD_ID + ":osmium", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Osmium_Ingot.get());
    }),
    Platinum(Minerology.MOD_ID + ":platinum", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Platinum_Ingot.get());
    }),
    Silver(Minerology.MOD_ID + ":silver", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Silver_Ingot.get());
    }),
    Tantalum(Minerology.MOD_ID + ":tantalum", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Tantalum_Ingot.get());
    }),
    Tin(Minerology.MOD_ID + ":tin", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Tin_Ingot.get());
    }),
    Titanium(Minerology.MOD_ID + ":titanium", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Titanium_Ingot.get());
    }),
    Tungsten(Minerology.MOD_ID + ":tungsten", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(MinerologyItems.Tungsten_Ingot.get());
    }),
    Obsidian(Minerology.MOD_ID + ":obsidian", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(Items.OBSIDIAN);
    }),
    Lapis(Minerology.MOD_ID + ":lapis", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(Items.LAPIS_LAZULI);
    }),
    Emerald(Minerology.MOD_ID + ":emerald", 13, new int[] { 2, 5, 6, 2 }, 14, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,() -> { return Ingredient.fromItems(Items.EMERALD);
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    MinerologyArmorMaterial(String name, int maxDamageFactor, int[] damageReductionArray, int enchantability,
                            SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionArray = damageReductionArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;

    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
