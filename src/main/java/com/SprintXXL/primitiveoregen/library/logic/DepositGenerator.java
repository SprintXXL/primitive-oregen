package com.SprintXXL.primitiveoregen.library.logic;

import com.SprintXXL.primitiveoregen.library.Deposit;
import com.SprintXXL.primitiveoregen.library.util.DepositDensity;
import com.SprintXXL.primitiveoregen.library.util.DepositShape;
import com.sprintxxl.ascentresourcerecipeindex.resources.AscentResource;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

import static com.SprintXXL.primitiveoregen.util.Config.DEBUG_SURFACE_MODE;

public class DepositGenerator {

    public static void generateDeposit(World world, Random random, int centerX, int centerY, int centerZ, Deposit deposit) {

        DepositShape shape = deposit.getShape();
        DepositDensity density = DepositDensity.STANDARD;

        for (int cellX = -shape.getRadiusX(); cellX <= shape.getRadiusX(); cellX += shape.getCellSizeX()) {
            for (int cellY = -shape.getRadiusY(); cellY <= shape.getRadiusY(); cellY += shape.getCellSizeY()) {
                for (int cellZ = -shape.getRadiusZ(); cellZ <= shape.getRadiusZ(); cellZ += shape.getCellSizeZ()) {

                    generateOreCell(world, random, centerX, centerY, centerZ, cellX, cellY, cellZ, deposit, density);
                }
            }
        }
    }

    public static void generateOreCell(World world, Random random, int centerX, int centerY, int centerZ, int cellX, int cellY, int cellZ,
                                       Deposit deposit, DepositDensity density) {

        DepositShape shape = deposit.getShape();

        int cellVolume = shape.getCellSizeX() * shape.getCellSizeY() * shape.getCellSizeZ();
        int oresPerCell = Math.round(cellVolume * DepositDensity.STANDARD.getOreChance());

        for (int i = 0; i < oresPerCell; i++) {

            int localX = random.nextInt(shape.getCellSizeX());
            int localY = random.nextInt(shape.getCellSizeY());
            int localZ = random.nextInt(shape.getCellSizeZ());

            BlockPos pos = new BlockPos(
                    centerX + cellX + localX,
                    centerY + cellY + localY,
                    centerZ + cellZ + localZ
            );

            if (!DEBUG_SURFACE_MODE && world.getBlockState(pos).getBlock() != Blocks.STONE) {
                continue;
            }

            if (random.nextFloat() > density.getOreChance()) {
                continue;
            }

            float oreRoll = random.nextFloat();

            AscentResource ore;

            if (oreRoll < 0.70F) {
                ore = deposit.getPrimaryOre();
            }
            else if (oreRoll < 0.95F) {
                ore = deposit.getSecondaryOre();
            }
            else {
                ore = deposit.getTraceOre();
            }

            Block oreBlock = ore.getBlock();

            if (oreBlock != null) {
                world.setBlockState(pos, oreBlock.getDefaultState());
            }
        }
    }
}