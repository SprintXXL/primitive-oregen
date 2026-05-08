package com.SprintXXL.primitiveoregen.deposit;

import net.minecraft.block.state.IBlockState;

public class DepositDefinition {

    // Ore block
    public IBlockState blockState;

    // Radius of ore deposit
    public int radiusX;
    public int radiusY;
    public int radiusZ;

    // Cell dimensions
    public int cellSizeX;
    public int cellSizeY;
    public int cellSizeZ;

    // Ores per cell
    public int oresPerCell;

    // Ore deposit weight
    public int weight;

    public DepositDefinition(IBlockState blockState, int radiusX, int radiusY, int radiusZ, int cellSizeX, int cellSizeY, int cellSizeZ, int oresPerCell, int weight) {

        this.blockState = blockState;

        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.radiusZ = radiusZ;

        this.cellSizeX = cellSizeX;
        this.cellSizeY = cellSizeY;
        this.cellSizeZ = cellSizeZ;

        this.oresPerCell = oresPerCell;

        this.weight = weight;
    }
}
