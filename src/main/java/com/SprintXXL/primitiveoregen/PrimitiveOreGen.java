package com.SprintXXL.primitiveoregen;

import com.SprintXXL.primitiveoregen.library.registry.DepositRegistry;
import com.SprintXXL.primitiveoregen.worldgen.PrimitiveOreWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:primitiveores")
public class PrimitiveOreGen {

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        logger = event.getModLog();

        DepositRegistry.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

      GameRegistry.registerWorldGenerator(new PrimitiveOreWorldGenerator(), 0);
    }
}