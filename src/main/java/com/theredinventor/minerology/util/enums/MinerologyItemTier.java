package com.theredinventor.minerology.util.enums;

import com.theredinventor.minerology.init.MinerologyItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum MinerologyItemTier implements IItemTier {

    ALUMINUM(2, 225, 6.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(MinerologyItems.Aluminum_Ingot.get());
    }),
    BERYLLIUM(4, 2812, 10.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MinerologyItems.Berylium_Ingot.get());
    }),
    BISMUTH(3, 1291, 8.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MinerologyItems.Bismuth_Ingot.get());
    }),
    CHROMIUM(4, 2330, 10.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MinerologyItems.Chromium_Ingot.get());
    }),
    COBALT(5, 5910, 12.0F, 2.0F, 12, () -> {
        return Ingredient.fromItems(MinerologyItems.Aluminum_Ingot.get());
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
