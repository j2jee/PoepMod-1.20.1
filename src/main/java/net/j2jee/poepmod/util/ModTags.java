package net.j2jee.poepmod.util;

import net.j2jee.poepmod.PoepMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_FAKE_DIAMOND_TOOL = tag("needs_fake_diamond_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PoepMod.MOD_ID, name));
        }
    }

    public static class Items {



        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PoepMod.MOD_ID, name));
        }
    }
}
