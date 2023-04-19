package com.thesmilingparadx.hadesmod.item;

import com.thesmilingparadx.hadesmod.HadesMod;
import com.thesmilingparadx.hadesmod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HadesMod.MOD_ID);

    // Artifacts - Currency
    public static final RegistryObject<Item> DARKNESS = ITEMS.register("darkness",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    // Soundtrack
    public static final RegistryObject<Item> NO_ESCAPE_MUSIC_DISC = ITEMS.register("no_escape_music_disc",
            () -> new RecordItem(4, ModSounds.NO_ESCAPE,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HOUSE_OF_HADES_MUSIC_DISC = ITEMS.register("house_of_hades_music_disc",
            () -> new RecordItem(4, ModSounds.HOUSE_OF_HADES,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> OUT_OF_TARTARUS_MUSIC_DISC = ITEMS.register("out_of_tartarus_music_disc",
            () -> new RecordItem(4, ModSounds.OUT_OF_TARTARUS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> WRETCHED_SHADES_MUSIC_DISC = ITEMS.register("wretched_shades_music_disc",
            () -> new RecordItem(4, ModSounds.WRETCHED_SHADES,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> LAMENT_OF_ORPHEUS_MUSIC_DISC = ITEMS.register("lament_of_orpheus_music_disc",
            () -> new RecordItem(4, ModSounds.LAMENT_OF_ORPHEUS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> THE_PAINFUL_WAY_MUSIC_DISC = ITEMS.register("the_painful_way_music_disc",
            () -> new RecordItem(4, ModSounds.THE_PAINFUL_WAY,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> FROM_OLYMPUS_MUSIC_DISC = ITEMS.register("from_olympus_music_disc",
            () -> new RecordItem(4, ModSounds.FROM_OLYMPUS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> THROUGH_ASPHODEL_MUSIC_DISC = ITEMS.register("through_asphodel_music_disc",
            () -> new RecordItem(4, ModSounds.THROUGH_ASPHODEL,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> EURYDICE_SOLO_MUSIC_DISC = ITEMS.register("eurydice_solo_music_disc",
            () -> new RecordItem(4, ModSounds.EURYDICE_SOLO,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> FINAL_EXPENSE_MUSIC_DISC = ITEMS.register("final_expense_music_disc",
            () -> new RecordItem(4, ModSounds.FINAL_EXPENSE,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> MOUTH_OF_STYX_MUSIC_DISC = ITEMS.register("mouth_of_styx_music_disc",
            () -> new RecordItem(4, ModSounds.MOUTH_OF_STYX,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PRIMORDIAL_CHAOS_MUSIC_DISC = ITEMS.register("primordial_chaos_music_disc",
            () -> new RecordItem(4, ModSounds.PRIMORDIAL_CHAOS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> THE_BLOODLESS_MUSIC_DISC = ITEMS.register("the_bloodless_music_disc",
            () -> new RecordItem(4, ModSounds.THE_BLOODLESS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> SCOURGE_OF_THE_FURIES_MUSIC_DISC = ITEMS.register("scourge_of_the_furies_music_disc",
            () -> new RecordItem(4, ModSounds.SCOURGE_OF_THE_FURIES,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HYMN_TO_ZAGREUS_MUSIC_DISC = ITEMS.register("hymn_to_zagreus_music_disc",
            () -> new RecordItem(4, ModSounds.HYMN_TO_ZAGREUS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> FIELD_OF_SOULS_MUSIC_DISC = ITEMS.register("field_of_souls_music_disc",
            () -> new RecordItem(4, ModSounds.FIELD_OF_SOULS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RIVER_OF_FLAME_MUSIC_DISC = ITEMS.register("river_of_flame_music_disc",
            () -> new RecordItem(4, ModSounds.RIVER_OF_FLAME,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> DEATH_AND_I_MUSIC_DISC = ITEMS.register("death_and_i_music_disc",
            () -> new RecordItem(4, ModSounds.DEATH_AND_I,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> RAGE_OF_THE_MYRMIDONS_MUSIC_DISC = ITEMS.register("rage_of_the_myrmidons_music_disc",
            () -> new RecordItem(4, ModSounds.RAGE_OF_THE_MYRMIDONS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> THE_EXALTED_MUSIC_DISC = ITEMS.register("the_exalted_music_disc",
            () -> new RecordItem(4, ModSounds.THE_EXALTED,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> LAST_WORDS_MUSIC_DISC = ITEMS.register("last_words_music_disc",
            () -> new RecordItem(4, ModSounds.LAST_WORDS,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> KING_AND_BULL_MUSIC_DISC = ITEMS.register("king_and_bull_music_disc",
            () -> new RecordItem(4, ModSounds.KING_AND_BULL,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> UNDERWORLD_MIX_MUSIC_DISC = ITEMS.register("underworld_mix_music_disc",
            () -> new RecordItem(4, ModSounds.UNDERWORLD_MIX,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GATES_OF_HELL_MUSIC_DISC = ITEMS.register("gates_of_hell_music_disc",
            () -> new RecordItem(4, ModSounds.GATES_OF_HELL,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOD_OF_THE_DEAD_MUSIC_DISC = ITEMS.register("god_of_the_dead_music_disc",
            () -> new RecordItem(4, ModSounds.GOD_OF_THE_DEAD,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> PAYBACK_MIX_MUSIC_DISC = ITEMS.register("payback_mix_music_disc",
            () -> new RecordItem(4, ModSounds.PAYBACK_MIX,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> ON_THE_COAST_MUSIC_DISC = ITEMS.register("on_the_coast_music_disc",
            () -> new RecordItem(4, ModSounds.ON_THE_COAST,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> IN_THE_BLOOD_MUSIC_DISC = ITEMS.register("in_the_blood_music_disc",
            () -> new RecordItem(4, ModSounds.IN_THE_BLOOD,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> THE_UNSEEN_ONES_MUSIC_DISC = ITEMS.register("the_unseen_ones_music_disc",
            () -> new RecordItem(4, ModSounds.THE_UNSEEN_ONES,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));
    public static final RegistryObject<Item> GOOD_RIDDANCE_MUSIC_DISC = ITEMS.register("good_riddance_music_disc",
            () -> new RecordItem(4, ModSounds.GOOD_RIDDANCE,
                    new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
