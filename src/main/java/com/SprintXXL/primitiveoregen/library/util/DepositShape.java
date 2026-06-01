package com.SprintXXL.primitiveoregen.library.util;

public enum DepositShape {

    STANDARD(
            15, 4, 15,
            3, 3, 3
    );

    private final int radiusX;
    private final int radiusY;
    private final int radiusZ;

    private final int cellSizeX;
    private final int cellSizeY;
    private final int cellSizeZ;

    DepositShape(int radiusX, int radiusY, int radiusZ, int cellSizeX, int cellSizeY, int cellSizeZ) {

        this.radiusX = radiusX;
        this.radiusY = radiusY;
        this.radiusZ = radiusZ;

        this.cellSizeX = cellSizeX;
        this.cellSizeY = cellSizeY;
        this.cellSizeZ = cellSizeZ;
    }

    public int getRadiusX() {
        return radiusX;
    }

    public int getRadiusY() {
        return radiusY;
    }

    public int getRadiusZ() {
        return radiusZ;
    }

    public int getCellSizeX() {
        return cellSizeX;
    }

    public int getCellSizeY() {
        return cellSizeY;
    }

    public int getCellSizeZ() {
        return cellSizeZ;
    }
}
