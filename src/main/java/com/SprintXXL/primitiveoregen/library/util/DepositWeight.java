package com.SprintXXL.primitiveoregen.library.util;

public enum DepositWeight {

    COMMON(100),
    UNCOMMON(75),
    RARE(50),
    EPIC(25),
    LEGENDARY(10);

    private final int weight;

    DepositWeight(int weight) {

        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
