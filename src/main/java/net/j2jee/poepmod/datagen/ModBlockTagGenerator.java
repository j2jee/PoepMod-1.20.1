package net.j2jee.poepmod.datagen;

import net.j2jee.poepmod.PoepMod;
import net.j2jee.poepmod.block.ModBlocks;
import net.j2jee.poepmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PoepMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.FAKE_DIAMOND_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.FAKE_BEDROCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FAKE_BEDROCK.get(),
                        ModBlocks.FAKE_DIAMOND_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.POEP_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_FAKE_DIAMOND_TOOL);

    }
}
