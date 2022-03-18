package com.thegreatapi.cdi.extension;

public final class Hello {

    private final String name;

    public Hello(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello " + name;
    }
}
