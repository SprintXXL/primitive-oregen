package com.SprintXXL.primitiveoregen;

import com.SprintXXL.primitiveoregen.library.registry.DepositRegistry;
import com.SprintXXL.primitiveoregen.worldgen.PrimitiveOreWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.SprintXXL.primitiveoregen.Reference.*;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class PrimitiveOreGen {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        DepositRegistry.initDepositRegistry();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

      GameRegistry.registerWorldGenerator(new PrimitiveOreWorldGenerator(), 0);
    }
}