package com.SprintXXL.primitiveoregen.deposit;

public class DepositDefinition {

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

    public DepositDefinition(int radiusX, int radiusY, int radiusZ, int cellSizeX, int cellSizeY, int cellSizeZ, int oresPerCell) {

        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.radiusZ = radiusZ;

        this.cellSizeX = cellSizeX;
        this.cellSizeY = cellSizeY;
        this.cellSizeZ = cellSizeZ;

        this.oresPerCell = oresPerCell;
    }
}
