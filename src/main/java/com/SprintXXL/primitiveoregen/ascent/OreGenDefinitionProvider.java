package com.SprintXXL.primitiveoregen.ascent;

import com.SprintXXL.primitiveoregen.library.definitions.ModDeposits;
import com.sprintxxl.ascenthub.definitions.AscentDefinition;
import com.sprintxxl.ascenthub.definitions.AscentDefinitionProvider;
import com.sprintxxl.ascenthub.definitions.DefinitionRegistrar;

import static com.SprintXXL.primitiveoregen.Reference.MODID;
import static com.sprintxxl.ascenthub.definitions.registry.DefinitionProviderRegistry.registerProvider;

public final class OreGenDefinitionProvider implements AscentDefinitionProvider {

    private OreGenDefinitionProvider() {}

    public static void initOreGenDefinitionProvider() {
        registerProvider(MODID, new OreGenDefinitionProvider());
    }

    @Override
    public void registerDefinitions(DefinitionRegistrar<AscentDefinition> registrar) {

        ModDeposits.initDepositDefinitions(registrar::register);
    }
}