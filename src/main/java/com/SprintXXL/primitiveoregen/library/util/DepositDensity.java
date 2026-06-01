package com.SprintXXL.primitiveoregen.library.util;

public enum DepositDensity {

    STANDARD(0.80F),;

    private final float oreChance;

    DepositDensity(float oreChance) {

        this.oreChance = oreChance;
    }

    public float getOreChance() {
        return oreChance;
    }
}
