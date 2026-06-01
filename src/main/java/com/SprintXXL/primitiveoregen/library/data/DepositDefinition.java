package com.SprintXXL.primitiveoregen.library.data;

import com.SprintXXL.primitiveoregen.library.util.DepositShape;
import com.SprintXXL.primitiveoregen.library.util.DepositWeight;
import com.SprintXXL.primitiveoregen.library.util.DepositRange;
import com.SprintXXL.primitiveores.library.OreDefinition;

public class DepositDefinition {

    private final String id;
    private final DepositShape shape;
    private final DepositWeight weight;
    private final DepositRange range;
    private final OreDefinition primaryOre;
    private final OreDefinition secondaryOre;
    private final OreDefinition traceOre;

    public DepositDefinition(
            String id,
            DepositShape shape,
            DepositWeight weight,
            DepositRange range,
            OreDefinition primaryOre,
            OreDefinition secondaryOre,
            OreDefinition traceOre
    ) {
        this.id = id;
        this.shape = shape;
        this.weight = weight;
        this.range = range;
        this.primaryOre = primaryOre;
        this.secondaryOre = secondaryOre;
        this.traceOre = traceOre;
    }

    public String getID() {
        return id;
    }

    public DepositShape getShape() {
        return shape;
    }

    public DepositWeight getWeight() {
        return weight;
    }

    public DepositRange getRange() {
        return range;
    }

    public OreDefinition getPrimaryOre() {
        return primaryOre;
    }

    public OreDefinition getSecondaryOre() {
        return secondaryOre;
    }

    public OreDefinition getTraceOre() {
        return traceOre;
    }
}