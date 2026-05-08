package com.SprintXXL.primitiveoregen.worldgen;

import com.SprintXXL.primitiveoregen.deposit.DepositGenerator;
import com.SprintXXL.primitiveoregen.deposit.DepositRegistry;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class PrimitiveOreWorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (Math.floorMod(chunkX, 3) == 1 && Math.floorMod(chunkZ, 3) == 1) {
            int centerX = chunkX * 16 + 8;
            int centerY = 40;
            int centerZ = chunkZ * 16 + 8;

            DepositGenerator.generateDeposit(world, random, centerX, centerY, centerZ, DepositRegistry.IRON_DEPOSIT);
        }
    }
}