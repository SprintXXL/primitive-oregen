package com.SprintXXL.primitiveoregen.ascent;

import com.SprintXXL.primitiveoregen.library.definitions.ModDeposits;
import com.sprintxxl.ascenthub.definitions.AscentDefinition;
import com.sprintxxl.ascenthub.definitions.AscentDefinitionProvider;
import com.sprintxxl.ascenthub.definitions.DefinitionRegistrar;

import static com.SprintXXL.primitiveoregen.Reference.MODID;

public final class OreGenDefinitionProvider implements AscentDefinitionProvider {

    @Override
    public String getModID() {
        return MODID;
    }

    @Override
    public void registerDefinitions(DefinitionRegistrar<AscentDefinition> registrar) {

        ModDeposits.initDepositDefinitions(registrar::register);
    }
}