package com.thesmilingparadx.hadesmod;

import com.mojang.logging.LogUtils;
import com.thesmilingparadx.hadesmod.block.ModBlocks;
import com.thesmilingparadx.hadesmod.effect.ModEffects;
import com.thesmilingparadx.hadesmod.item.ModItems;
import com.thesmilingparadx.hadesmod.sound.ModSounds;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HadesMod.MOD_ID)
public class HadesMod {
    public static final String MOD_ID = "hadesmod";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public HadesMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        ModSounds.register(eventBus);

        ModEffects.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HERMES_BOON.get(), RenderType.translucent());
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
