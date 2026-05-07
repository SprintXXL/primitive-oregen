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
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (Math.floorMod(chunkX, 3) == 1 && Math.floorMod(chunkZ, 3) == 1) {
            int centerX = chunkX * 16 + 8;
            int centerY = 40;
            int centerZ = chunkZ * 16 + 8;

            generateIronDeposit(world, random, centerX, centerY, centerZ);
        }
    }

    public void generateIronDeposit(World world, Random random, int centerX, int centerY, int centerZ) {

        // Full deposit size
        int radiusX = 9;
        int radiusY = 4;
        int radiusZ = 9;

        // Cell Size
        int cellSizeX = 3;
        int cellSizeY = 3;
        int cellSizeZ = 3;

        for (int cellX = -radiusX; cellX <= radiusX; cellX += cellSizeX) {
            for (int cellY = -radiusY; cellY <= radiusY; cellY += cellSizeY) {
                for (int cellZ = -radiusZ; cellZ <= radiusZ; cellZ += cellSizeZ) {

                    generateOreCell(world, random, centerX, centerY, centerZ, cellX, cellY, cellZ, cellSizeX, cellSizeY, cellSizeZ);
                }
            }
        }
    }

    public void generateOreCell(World world, Random random, int centerX, int centerY, int centerZ,
                                int cellX, int cellY, int cellZ, int cellSizeX, int cellSizeY, int cellSizeZ) {

        int oresPerCell = 2;

        for (int i = 0; i < oresPerCell; i++) {


            int localX = random.nextInt(cellSizeX);
            int localY = random.nextInt(cellSizeY);
            int localZ = random.nextInt(cellSizeZ);

            BlockPos pos = new BlockPos(
                    centerX + cellX + localX,
                    centerY + cellY + localY,
                    centerZ + cellZ + localZ
            );

            world.setBlockState(pos, Blocks.IRON_ORE.getDefaultState());
        }
    }
}