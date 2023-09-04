package net.j2jee.poepmod.item;

import net.j2jee.poepmod.PoepMod;
import net.j2jee.poepmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier FAKE_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(0, 1561, 1.0F, 0.0F, 25,
                    ModTags.Blocks.NEEDS_FAKE_DIAMOND_TOOL, () -> Ingredient.of(ModItems.FAKE_DIAMOND.get())),
            new ResourceLocation(PoepMod.MOD_ID, "fake_diamond"), List.of(Tiers.NETHERITE), List.of());

}
