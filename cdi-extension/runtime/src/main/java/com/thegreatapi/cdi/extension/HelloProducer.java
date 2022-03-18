package com.thegreatapi.cdi.extension;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class HelloProducer {

    @Produces
    @Default
    @ApplicationScoped
    public Hello hello() {
        return new Hello("Neil Peart");
    }
}
