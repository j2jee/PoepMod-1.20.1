package net.j2jee.poepmod.item;

import net.j2jee.poepmod.PoepMod;
import net.minecraft.world.item.*;
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


    public static final RegistryObject<Item> FAKE_DIAMOND_PICKAXE = ITEMS.register("fake_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FAKE_DIAMOND, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND_SHOVEL = ITEMS.register("fake_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.FAKE_DIAMOND, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND_SWORD = ITEMS.register("fake_diamond_sword",
            () -> new SwordItem(ModToolTiers.FAKE_DIAMOND, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND_AXE = ITEMS.register("fake_diamond_axe",
            () -> new AxeItem(ModToolTiers.FAKE_DIAMOND, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> FAKE_DIAMOND_HOE = ITEMS.register("fake_diamond_hoe",
            () -> new HoeItem(ModToolTiers.FAKE_DIAMOND, 0, 0, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
