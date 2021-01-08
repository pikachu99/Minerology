package com.theredinventor.minerology.util.enums;
import com.theredinventor.minerology.init.MinerologyItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import java.util.function.Supplier;

public enum MinerologyItemTier implements IItemTier {

    ALUMINUM(2, 225, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(MinerologyItems.Aluminum_Ingot.get());
    }),
    BERYLLIUM(4, 2812, 10.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MinerologyItems.Beryllium_Ingot.get());
    }),
    BISMUTH(3, 1291, 8.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MinerologyItems.Bismuth_Ingot.get());
    }),
    CHROMIUM(4, 2330, 10.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MinerologyItems.Chromium_Ingot.get());
    }),
    COBALT(5, 5910, 12.0F, 2.0F, 12, () -> {
        return Ingredient.fromItems(MinerologyItems.Cobalt_Ingot.get());
    }),
    COPPER(2, 200, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(MinerologyItems.Copper_Ingot.get());
    }),
    INDIUM(4, 2300, 10.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MinerologyItems.Indium_Ingot.get());
    }),
    IRIDIUM(4, 2790, 10.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MinerologyItems.Iridium_Ingot.get());
    }),
    NICKEL(3, 900, 8.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MinerologyItems.Nickel_Ingot.get());
    }),
    OSMIUM(2, 230, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(MinerologyItems.Osmium_Ingot.get());
    }),
    PLATINUM(4, 2700, 10.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MinerologyItems.Platinum_Ingot.get());
    }),
    SILVER(3, 1200, 8.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MinerologyItems.Silver_Ingot.get());
    }),
    TANTALUM(4, 1620, 10.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MinerologyItems.Tantalum_Ingot.get());
    }),
    TIN(2, 165, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(MinerologyItems.Tin_Ingot.get());
    }),
    TITANIUM(5, 6020, 12.0F, 2.0F, 12, () -> {
        return Ingredient.fromItems(MinerologyItems.Titanium_Ingot.get());
    }),
    TUNGSTEN(3, 1790, 8.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MinerologyItems.Tungsten_Ingot.get());
    }),
    OBSIDIAN(4, 3100, 10.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(Items.OBSIDIAN);
    }),
    LAPIS(1, 140, 6.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(Items.LAPIS_LAZULI);
    }),
    EMERALD(3, 1200, 8.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float attackDamage;
    private final float efficiency;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    MinerologyItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
