package com.SprintXXL.primitiveoregen.library.util;

public enum DepositRange {

    DEEP(15, 30),
    NORMAL(30, 50),
    SHALLOW(50, 65);

    private final int minY;
    private final int maxY;

    DepositRange(int minY, int maxY) {

        this.minY = minY;
        this.maxY = maxY;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }


}
