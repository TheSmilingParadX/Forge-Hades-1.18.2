package com.thesmilingparadx.hadesmod.sound;

import com.thesmilingparadx.hadesmod.HadesMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENT =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HadesMod.MOD_ID);

    public static final RegistryObject<SoundEvent> NO_ESCAPE = registrySoundEvent("no_escape");
    public static final RegistryObject<SoundEvent> HOUSE_OF_HADES = registrySoundEvent("house_of_hades");
    public static final RegistryObject<SoundEvent> OUT_OF_TARTARUS = registrySoundEvent("out_of_tartarus");
    public static final RegistryObject<SoundEvent> WRETCHED_SHADES = registrySoundEvent("wretched_shades");
    public static final RegistryObject<SoundEvent> LAMENT_OF_ORPHEUS = registrySoundEvent("lament_of_orpheus");
    public static final RegistryObject<SoundEvent> THE_PAINFUL_WAY = registrySoundEvent("the_painful_way");
    public static final RegistryObject<SoundEvent> FROM_OLYMPUS = registrySoundEvent("from_olympus");
    public static final RegistryObject<SoundEvent> THROUGH_ASPHODEL = registrySoundEvent("through_asphodel");
    public static final RegistryObject<SoundEvent> EURYDICE_SOLO = registrySoundEvent("eurydice_solo");
    public static final RegistryObject<SoundEvent> FINAL_EXPENSE = registrySoundEvent("final_expense");
    public static final RegistryObject<SoundEvent> MOUTH_OF_STYX = registrySoundEvent("mouth_of_styx");
    public static final RegistryObject<SoundEvent> PRIMORDIAL_CHAOS = registrySoundEvent("primordial_chaos");
    public static final RegistryObject<SoundEvent> THE_BLOODLESS = registrySoundEvent("the_bloodless");
    public static final RegistryObject<SoundEvent> SCOURGE_OF_THE_FURIES = registrySoundEvent("scourge_of_the_furies");
    public static final RegistryObject<SoundEvent> HYMN_TO_ZAGREUS = registrySoundEvent("hymn_to_zagreus");
    public static final RegistryObject<SoundEvent> FIELD_OF_SOULS = registrySoundEvent("field_of_souls");
    public static final RegistryObject<SoundEvent> RIVER_OF_FLAME = registrySoundEvent("river_of_flame");
    public static final RegistryObject<SoundEvent> DEATH_AND_I = registrySoundEvent("death_and_i");
    public static final RegistryObject<SoundEvent> RAGE_OF_THE_MYRMIDONS = registrySoundEvent("rage_of_the_myrmidons");
    public static final RegistryObject<SoundEvent> THE_EXALTED = registrySoundEvent("the_exalted");
    public static final RegistryObject<SoundEvent> LAST_WORDS = registrySoundEvent("last_words");
    public static final RegistryObject<SoundEvent> KING_AND_BULL = registrySoundEvent("king_and_bull");
    public static final RegistryObject<SoundEvent> UNDERWORLD_MIX = registrySoundEvent("underworld_mix");
    public static final RegistryObject<SoundEvent> GATES_OF_HELL = registrySoundEvent("gates_of_hell");
    public static final RegistryObject<SoundEvent> GOD_OF_THE_DEAD = registrySoundEvent("god_of_the_dead");
    public static final RegistryObject<SoundEvent> PAYBACK_MIX = registrySoundEvent("payback_mix");
    public static final RegistryObject<SoundEvent> ON_THE_COAST = registrySoundEvent("on_the_coast");
    public static final RegistryObject<SoundEvent> IN_THE_BLOOD = registrySoundEvent("in_the_blood");
    public static final RegistryObject<SoundEvent> THE_UNSEEN_ONES = registrySoundEvent("the_unseen_ones");
    public static final RegistryObject<SoundEvent> GOOD_RIDDANCE = registrySoundEvent("good_riddance");

    private static RegistryObject<SoundEvent> registrySoundEvent(String name) {
        return SOUND_EVENT.register(name, () -> new SoundEvent(new ResourceLocation(HadesMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENT.register(eventBus);
    }
}
