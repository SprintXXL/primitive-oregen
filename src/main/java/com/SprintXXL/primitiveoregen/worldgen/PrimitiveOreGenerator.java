package com.SprintXXL.primitiveoregen.worldgen;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class PrimitiveOreGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        if (Math.floorMod(chunkX, 3) == 1 && Math.floorMod(chunkZ, 3) == 1) {

            int blockX = chunkX * 16 + 8;
            int blockY = 40;
            int blockZ = chunkZ * 16 + 8;

            world.setBlockState(
                    new BlockPos(blockX, blockY, blockZ),
                    Blocks.IRON_ORE.getDefaultState()
            );
            System.out.println("Ore Region Center Chunk: " + chunkX + ", " + chunkZ);
        }
    }
}