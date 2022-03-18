package com.thegreatapi.cdi.extension.deployment;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import com.thegreatapi.cdi.extension.HelloProducer;

class CdiExtensionProcessor {

    private static final String FEATURE = "cdi-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem producer() {
        return new AdditionalBeanBuildItem(HelloProducer.class);
    }

}

