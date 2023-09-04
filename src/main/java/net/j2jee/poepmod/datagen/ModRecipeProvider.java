package net.j2jee.poepmod.datagen;

import net.j2jee.poepmod.block.ModBlocks;
import net.j2jee.poepmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FAKE_DIAMOND_BLOCK.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_block_from_fake_diamond");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FAKE_BEDROCK.get())
                .pattern("CNC")
                .pattern("NSN")
                .pattern("CNC")
                .define('C', Items.COBBLESTONE)
                .define('N', Items.NETHERITE_INGOT)
                .define('S', Items.NETHER_STAR)
                .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
                .save(consumer, "fake_bedrock");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POEP_BLOCK.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', ModItems.POEP.get())
                .unlockedBy(getHasName(ModItems.POEP.get()), has(ModItems.POEP.get()))
                .save(consumer, "poep_block_from_poep");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAKE_DIAMOND.get())
                .requires(Items.DIRT)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_from_dirt");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FAKE_DIAMOND.get(), 9 )  //, 9
                .requires(ModBlocks.FAKE_DIAMOND_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.FAKE_DIAMOND_BLOCK.get()), has(ModBlocks.FAKE_DIAMOND_BLOCK.get()))
                .save(consumer, "fake_diamond_from_fake_diamond_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.POEP.get(), 9 )
                .requires(ModBlocks.POEP_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.POEP_BLOCK.get()), has(ModBlocks.POEP_BLOCK.get()))
                .save(consumer, "poep_from_poep_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_PICKAXE.get())
                .pattern("FFF")
                .pattern(" S ")
                .pattern(" S ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_pickaxe");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_SWORD.get())
                .pattern("F  ")
                .pattern("F  ")
                .pattern("S  ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_sword_0");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_SWORD.get())
                .pattern(" F ")
                .pattern(" F ")
                .pattern(" S ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_sword_1");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_SWORD.get())
                .pattern("  F")
                .pattern("  F")
                .pattern("  S")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_sword_2");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_SHOVEL.get())
                .pattern("F  ")
                .pattern("S  ")
                .pattern("S  ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_shovel_0");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_SHOVEL.get())
                .pattern(" F ")
                .pattern(" S ")
                .pattern(" S ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_shovel_1");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_SHOVEL.get())
                .pattern("  F")
                .pattern("  S")
                .pattern("  S")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_shovel_2");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_AXE.get())
                .pattern("FF ")
                .pattern("FS ")
                .pattern(" S ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_axe_0");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_AXE.get())
                .pattern(" FF")
                .pattern(" FS")
                .pattern("  S")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_axe_1");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_AXE.get())
                .pattern(" FF")
                .pattern(" SF")
                .pattern(" S ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_axe_2");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_AXE.get())
                .pattern("FF ")
                .pattern("SF ")
                .pattern("S  ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_axe_3");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_HOE.get())
                .pattern("FF ")
                .pattern(" S ")
                .pattern(" S ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_hoe_0");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_HOE.get())
                .pattern(" FF")
                .pattern("  S")
                .pattern("  S")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_hoe_1");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_HOE.get())
                .pattern(" FF")
                .pattern(" S ")
                .pattern(" S ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_hoe_2");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FAKE_DIAMOND_HOE.get())
                .pattern("FF ")
                .pattern("S  ")
                .pattern("S  ")
                .define('F', ModItems.FAKE_DIAMOND.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FAKE_DIAMOND.get()), has(ModItems.FAKE_DIAMOND.get()))
                .save(consumer, "fake_diamond_hoe_3");


    }
}
