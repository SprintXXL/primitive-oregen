package com.SprintXXL.primitiveoregen.util;

public class OreGenHelper {

    public static boolean isDepositChunk (int chunkX, int chunkZ) {

        return Math.floorMod(chunkX, 3) == 1 &&
                Math.floorMod(chunkZ, 3) == 1;
    }

    public static boolean isDepositCenter(int blockX, int blockZ) {

        int chunkX = Math.floorDiv(blockX, 16);
        int chunkZ = Math.floorDiv(blockZ, 16);

        boolean isCenterChunk =
                Math.floorMod(chunkX, 3) == 1
                && Math.floorMod(chunkZ, 3) == 1;

        boolean isCenterBlock =
                Math.floorMod(blockX, 16) == 8
                && Math.floorMod(blockZ, 16) == 8;

        return isCenterChunk && isCenterBlock;
    }
}
