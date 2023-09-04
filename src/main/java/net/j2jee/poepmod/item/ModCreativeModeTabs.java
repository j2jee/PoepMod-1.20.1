package net.j2jee.poepmod.item;

import net.j2jee.poepmod.PoepMod;
import net.j2jee.poepmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PoepMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> POEP_TAB = CREATIVE_MODE_TABS.register("poep_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POEP.get()))
                    .title(Component.translatable("creativetab.poep_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //items
                        output.accept(ModItems.POEP.get());
                        output.accept(ModItems.FAKE_DIAMOND.get());
                        //blocks
                        output.accept(ModBlocks.POEP_BLOCK.get());
                        output.accept(ModBlocks.FAKE_BEDROCK.get());
                        output.accept(ModBlocks.FAKE_DIAMOND_BLOCK.get());
                        //armor
                        output.accept(ModItems.FAKE_DIAMOND_HELMET.get());
                        output.accept(ModItems.FAKE_DIAMOND_CHESTPLATE.get());
                        output.accept(ModItems.FAKE_DIAMOND_LEGGINGS.get());
                        output.accept(ModItems.FAKE_DIAMOND_BOOTS.get());
                        //tools
                        output.accept(ModItems.FAKE_DIAMOND_PICKAXE.get());
                        output.accept(ModItems.FAKE_DIAMOND_SHOVEL.get());
                        output.accept(ModItems.FAKE_DIAMOND_SWORD.get());
                        output.accept(ModItems.FAKE_DIAMOND_AXE.get());
                        output.accept(ModItems.FAKE_DIAMOND_HOE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
