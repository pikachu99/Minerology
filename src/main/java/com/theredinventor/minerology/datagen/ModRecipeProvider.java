package com.theredinventor.minerology.datagen;

import com.theredinventor.minerology.Minerology;
import com.theredinventor.minerology.init.BlockInit;
import com.theredinventor.minerology.init.ItemInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static  final List<ItemLike> Actinium_Smeltables = List.of(ItemInit.Raw_Actinium.get(),
            BlockInit.Actinium_Ore.get());
    private static  final List<ItemLike> Aluminum_Smeltables = List.of(ItemInit.Raw_Aluminum.get(),
            BlockInit.Aluminum_Ore.get());
    private static  final List<ItemLike> Chromium_Smeltables = List.of(ItemInit.Raw_Chromium.get(),
            BlockInit.Chromium_Ore.get());
    private static  final List<ItemLike> Cobalt_Smeltables = List.of(ItemInit.Raw_Cobalt.get(),
            BlockInit.Cobalt_Ore.get());
    private static  final List<ItemLike> Iridium_Smeltables = List.of(ItemInit.Raw_Iridium.get(),
            BlockInit.Iridium_Ore.get());
    private static  final List<ItemLike> Lead_Smeltables = List.of(ItemInit.Raw_Lead.get(),
            BlockInit.Lead_Ore.get());
    private static  final List<ItemLike> Lithium_Smeltables = List.of(ItemInit.Raw_Lithium.get(),
            BlockInit.Lithium_Ore.get());
    private static  final List<ItemLike> Magnesium_Smeltables = List.of(ItemInit.Raw_Magnesium.get(),
            BlockInit.Magnesium_Ore.get());
    private static  final List<ItemLike> Manganese_Smeltables = List.of(ItemInit.Raw_Manganese.get(),
            BlockInit.Manganese_Ore.get());
    private static  final List<ItemLike> Mercury_Smeltables = List.of(ItemInit.Raw_Mercury.get(),
            BlockInit.Mercury_Ore.get());
    private static  final List<ItemLike> Neptunium_Smeltables = List.of(ItemInit.Raw_Neptunium.get(),
            BlockInit.Neptunium_Ore.get());
    private static  final List<ItemLike> Nickel_Smeltables = List.of(ItemInit.Raw_Nickel.get(),
            BlockInit.Nickel_Ore.get());
    private static  final List<ItemLike> Osmium_Smeltables = List.of(ItemInit.Raw_Osmium.get(),
            BlockInit.Osmium_Ore.get());
    private static  final List<ItemLike> Platinum_Smeltables = List.of(ItemInit.Raw_Platinum.get(),
            BlockInit.Platinum_Ore.get());
    private static  final List<ItemLike> Plutonium_Smeltables = List.of(ItemInit.Raw_Plutonium.get(),
            BlockInit.Plutonium_Ore.get());
    private static  final List<ItemLike> Polonium_Smeltables = List.of(ItemInit.Raw_Polonium.get(),
            BlockInit.Polonium_Ore.get());
    private static  final List<ItemLike> Promethium_Smeltables = List.of(ItemInit.Raw_Promethium.get(),
            BlockInit.Promethium_Ore.get());
    private static  final List<ItemLike> Radium_Smeltables = List.of(ItemInit.Raw_Radium.get(),
            BlockInit.Radium_Ore.get());
    private static  final List<ItemLike> Silver_Smeltables = List.of(ItemInit.Raw_Silver.get(),
            BlockInit.Silver_Ore.get());
    private static  final List<ItemLike> Thorium_Smeltables = List.of(ItemInit.Raw_Thorium.get(),
            BlockInit.Thorium_Ore.get());
    private static  final List<ItemLike> Tin_Smeltables = List.of(ItemInit.Raw_Tin.get(),
            BlockInit.Tin_Ore.get());
    private static  final List<ItemLike> Titanium_Smeltables = List.of(ItemInit.Raw_Titanium.get(),
            BlockInit.Titanium_Ore.get());
    private static  final List<ItemLike> Tungsten_Smeltables = List.of(ItemInit.Raw_Tungsten.get(),
            BlockInit.Tungsten_Ore.get());
    private static  final List<ItemLike> Uranium_Smeltables = List.of(ItemInit.Raw_Uranium.get(),
            BlockInit.Uranium_Ore.get());
    private static  final List<ItemLike> Zinc_Smeltables = List.of(ItemInit.Raw_Zinc.get(),
            BlockInit.Zinc_Ore.get());

    public ModRecipeProvider(PackOutput p_248933_, CompletableFuture<HolderLookup.Provider> p_333797_) {
        super(p_248933_, p_333797_);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        oreBlasting(recipeOutput, Actinium_Smeltables, RecipeCategory.MISC, ItemInit.Actinium_Ingot.get(), 0.25f, 100, "actinium");
        oreSmelting(recipeOutput, Actinium_Smeltables, RecipeCategory.MISC, ItemInit.Actinium_Ingot.get(), 0.25f, 200, "actinium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Aluminum_Smeltables, RecipeCategory.MISC, ItemInit.Aluminum_Ingot.get(), 0.25f, 100, "aluminum");
        oreSmelting(recipeOutput, Aluminum_Smeltables, RecipeCategory.MISC, ItemInit.Aluminum_Ingot.get(), 0.25f, 200, "aluminum");
        blockRecipe(recipeOutput, ItemInit.Aluminum_Ingot.get(), BlockInit.Aluminum_Block.get());
        itemRecipe(recipeOutput, BlockInit.Aluminum_Block.get(), ItemInit.Aluminum_Ingot.get());

        oreBlasting(recipeOutput, Chromium_Smeltables, RecipeCategory.MISC, ItemInit.Chromium_Ingot.get(), 0.25f, 100, "chromium");
        oreSmelting(recipeOutput, Chromium_Smeltables, RecipeCategory.MISC, ItemInit.Chromium_Ingot.get(), 0.25f, 200, "chromium");
        blockRecipe(recipeOutput, ItemInit.Chromium_Ingot.get(), BlockInit.Chromium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Chromium_Block.get(), ItemInit.Chromium_Ingot.get());

        oreBlasting(recipeOutput, Cobalt_Smeltables, RecipeCategory.MISC, ItemInit.Cobalt_Ingot.get(), 0.25f, 100, "cobalt");
        oreSmelting(recipeOutput, Cobalt_Smeltables, RecipeCategory.MISC, ItemInit.Cobalt_Ingot.get(), 0.25f, 200, "cobalt");
        blockRecipe(recipeOutput, ItemInit.Cobalt_Ingot.get(), BlockInit.Cobalt_Block.get());
        itemRecipe(recipeOutput, BlockInit.Cobalt_Block.get(), ItemInit.Cobalt_Ingot.get());

        oreBlasting(recipeOutput, Iridium_Smeltables, RecipeCategory.MISC, ItemInit.Iridium_Ingot.get(), 0.25f, 100, "iridium");
        oreSmelting(recipeOutput, Iridium_Smeltables, RecipeCategory.MISC, ItemInit.Iridium_Ingot.get(), 0.25f, 200, "iridium");
        blockRecipe(recipeOutput, ItemInit.Iridium_Ingot.get(), BlockInit.Iridium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Iridium_Block.get(), ItemInit.Iridium_Ingot.get());

        oreBlasting(recipeOutput, Lead_Smeltables, RecipeCategory.MISC, ItemInit.Lead_Ingot.get(), 0.25f, 100, "lead");
        oreSmelting(recipeOutput, Lead_Smeltables, RecipeCategory.MISC, ItemInit.Lead_Ingot.get(), 0.25f, 200, "lead");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Lithium_Smeltables, RecipeCategory.MISC, ItemInit.Lithium_Ingot.get(), 0.25f, 100, "lithium");
        oreSmelting(recipeOutput, Lithium_Smeltables, RecipeCategory.MISC, ItemInit.Lithium_Ingot.get(), 0.25f, 200, "lithium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Magnesium_Smeltables, RecipeCategory.MISC, ItemInit.Magnesium_Ingot.get(), 0.25f, 100, "magnesium");
        oreSmelting(recipeOutput, Magnesium_Smeltables, RecipeCategory.MISC, ItemInit.Magnesium_Ingot.get(), 0.25f, 200, "magnesium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Manganese_Smeltables, RecipeCategory.MISC, ItemInit.Manganese_Ingot.get(), 0.25f, 100, "manganese");
        oreSmelting(recipeOutput, Manganese_Smeltables, RecipeCategory.MISC, ItemInit.Manganese_Ingot.get(), 0.25f, 200, "manganese");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Mercury_Smeltables, RecipeCategory.MISC, ItemInit.Mercury_Ingot.get(), 0.25f, 100, "mercury");
        oreSmelting(recipeOutput, Mercury_Smeltables, RecipeCategory.MISC, ItemInit.Mercury_Ingot.get(), 0.25f, 200, "mercury");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Neptunium_Smeltables, RecipeCategory.MISC, ItemInit.Neptunium_Ingot.get(), 0.25f, 100, "neptunium");
        oreSmelting(recipeOutput, Neptunium_Smeltables, RecipeCategory.MISC, ItemInit.Neptunium_Ingot.get(), 0.25f, 200, "neptunium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Nickel_Smeltables, RecipeCategory.MISC, ItemInit.Nickel_Ingot.get(), 0.25f, 100, "nickel");
        oreSmelting(recipeOutput, Nickel_Smeltables, RecipeCategory.MISC, ItemInit.Nickel_Ingot.get(), 0.25f, 200, "nickel");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Osmium_Smeltables, RecipeCategory.MISC, ItemInit.Osmium_Ingot.get(), 0.25f, 100, "osmium");
        oreSmelting(recipeOutput, Osmium_Smeltables, RecipeCategory.MISC, ItemInit.Osmium_Ingot.get(), 0.25f, 200, "osmium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Platinum_Smeltables, RecipeCategory.MISC, ItemInit.Platinum_Ingot.get(), 0.25f, 100, "platinum");
        oreSmelting(recipeOutput, Platinum_Smeltables, RecipeCategory.MISC, ItemInit.Platinum_Ingot.get(), 0.25f, 200, "platinum");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Plutonium_Smeltables, RecipeCategory.MISC, ItemInit.Plutonium_Ingot.get(), 0.25f, 100, "plutonium");
        oreSmelting(recipeOutput, Plutonium_Smeltables, RecipeCategory.MISC, ItemInit.Plutonium_Ingot.get(), 0.25f, 200, "plutonium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Polonium_Smeltables, RecipeCategory.MISC, ItemInit.Polonium_Ingot.get(), 0.25f, 100, "polonium");
        oreSmelting(recipeOutput, Polonium_Smeltables, RecipeCategory.MISC, ItemInit.Polonium_Ingot.get(), 0.25f, 200, "polonium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Promethium_Smeltables, RecipeCategory.MISC, ItemInit.Promethium_Ingot.get(), 0.25f, 100, "promethium");
        oreSmelting(recipeOutput, Promethium_Smeltables, RecipeCategory.MISC, ItemInit.Promethium_Ingot.get(), 0.25f, 200, "promethium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Radium_Smeltables, RecipeCategory.MISC, ItemInit.Radium_Ingot.get(), 0.25f, 100, "radium");
        oreSmelting(recipeOutput, Radium_Smeltables, RecipeCategory.MISC, ItemInit.Radium_Ingot.get(), 0.25f, 200, "radium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Silver_Smeltables, RecipeCategory.MISC, ItemInit.Silver_Ingot.get(), 0.25f, 100, "silver");
        oreSmelting(recipeOutput, Silver_Smeltables, RecipeCategory.MISC, ItemInit.Silver_Ingot.get(), 0.25f, 200, "silver");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Thorium_Smeltables, RecipeCategory.MISC, ItemInit.Thorium_Ingot.get(), 0.25f, 100, "thorium");
        oreSmelting(recipeOutput, Thorium_Smeltables, RecipeCategory.MISC, ItemInit.Thorium_Ingot.get(), 0.25f, 200, "thorium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Titanium_Smeltables, RecipeCategory.MISC, ItemInit.Titanium_Ingot.get(), 0.25f, 100, "titanium");
        oreSmelting(recipeOutput, Titanium_Smeltables, RecipeCategory.MISC, ItemInit.Titanium_Ingot.get(), 0.25f, 200, "titanium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Tungsten_Smeltables, RecipeCategory.MISC, ItemInit.Tungsten_Ingot.get(), 0.25f, 100, "tungsten");
        oreSmelting(recipeOutput, Tungsten_Smeltables, RecipeCategory.MISC, ItemInit.Tungsten_Ingot.get(), 0.25f, 200, "tungsten");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Uranium_Smeltables, RecipeCategory.MISC, ItemInit.Uranium_Ingot.get(), 0.25f, 100, "uranium");
        oreSmelting(recipeOutput, Uranium_Smeltables, RecipeCategory.MISC, ItemInit.Uranium_Ingot.get(), 0.25f, 200, "uranium");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

        oreBlasting(recipeOutput, Zinc_Smeltables, RecipeCategory.MISC, ItemInit.Zinc_Ingot.get(), 0.25f, 100, "zinc");
        oreSmelting(recipeOutput, Zinc_Smeltables, RecipeCategory.MISC, ItemInit.Zinc_Ingot.get(), 0.25f, 200, "zinc");
        blockRecipe(recipeOutput, ItemInit.Actinium_Ingot.get(), BlockInit.Actinium_Block.get());
        itemRecipe(recipeOutput, BlockInit.Actinium_Block.get(), ItemInit.Actinium_Ingot.get());

    }
    protected static void blockRecipe(RecipeOutput recipeOutput, ItemLike pInput, Block pResult){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pResult)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', pInput)
                .save(recipeOutput);
    }
    protected static void itemRecipe(RecipeOutput recipeOutput, Block pInput, ItemLike pResult){
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, 9)
                .requires(pInput)
                .save(recipeOutput);
    }

    protected static void oreSmelting(RecipeOutput p_300202_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_300202_, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput p_298528_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_298528_, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }

    private static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput p_297621_, RecipeSerializer<T> p_251817_, AbstractCookingRecipe.Factory<T> p_312098_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        Iterator var10 = p_249619_.iterator();

        while(var10.hasNext()) {
            ItemLike itemlike = (ItemLike)var10.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_, p_312098_)
                    .group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(p_297621_, Minerology.MODID + ":" + getItemName(p_250066_) + p_249236_ + "_" + getItemName(itemlike));
        }

    }
}
