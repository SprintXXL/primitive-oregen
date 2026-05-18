package com.SprintXXL.primitiveoregen;

import com.SprintXXL.primitiveoregen.worldgen.PrimitiveOreWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = PrimitiveOreGen.MODID, name = PrimitiveOreGen.NAME, version = PrimitiveOreGen.VERSION)
public class PrimitiveOreGen
{
    public static final String MODID = "primitiveoregen";
    public static final String NAME = "Primitive Ore Gen";
    public static final String VERSION = "0.4.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      GameRegistry.registerWorldGenerator(new PrimitiveOreWorldGenerator(), 0);
    }
}