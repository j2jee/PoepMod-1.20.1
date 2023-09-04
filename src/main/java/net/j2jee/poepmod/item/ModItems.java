package net.j2jee.poepmod.item;

import net.j2jee.poepmod.PoepMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PoepMod.MOD_ID);

    public static final RegistryObject<Item> POEP = ITEMS.register("poep",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND = ITEMS.register("fake_diamond",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FAKE_DIAMOND_HELMET = ITEMS.register("fake_diamond_helmet",
            () -> new ArmorItem(ModArmorMaterials.FAKE_DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND_CHESTPLATE = ITEMS.register("fake_diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FAKE_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND_LEGGINGS = ITEMS.register("fake_diamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.FAKE_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND_BOOTS = ITEMS.register("fake_diamond_boots",
            () -> new ArmorItem(ModArmorMaterials.FAKE_DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
