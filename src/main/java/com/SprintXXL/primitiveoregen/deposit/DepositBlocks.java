package com.SprintXXL.primitiveoregen.deposit;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class DepositBlocks {

    public static IBlockState getBlockState(String modid, String name) {
        Block block = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(modid, name));

        if(block == null) {
            throw new IllegalStateException("Missing Block: " + modid + name);
        }

        return block.getDefaultState();
    }
}