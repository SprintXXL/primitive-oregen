package com.SprintXXL.primitiveoregen.deposit;

import net.minecraft.block.state.IBlockState;

public class DepositDefinition {

    // Ores per cell
    public int oresPerCell;

    // Radius of ore deposit
    public int radiusX;
    public int radiusY;
    public int radiusZ;

    // Cell dimensions
    public int cellSizeX;
    public int cellSizeY;
    public int cellSizeZ;

    // Ore block
    public IBlockState blockState;

    public DepositDefinition(IBlockState blockState, int radiusX, int radiusY, int radiusZ, int cellSizeX, int cellSizeY, int cellSizeZ, int oresPerCell) {

        this.blockState = blockState;

        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.radiusZ = radiusZ;

        this.cellSizeX = cellSizeX;
        this.cellSizeY = cellSizeY;
        this.cellSizeZ = cellSizeZ;

        this.oresPerCell = oresPerCell;
    }
}
