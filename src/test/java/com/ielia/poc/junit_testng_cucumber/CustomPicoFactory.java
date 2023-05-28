package com.ielia.poc.junit_testng_cucumber;

import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;

// Unnecessary. Disregard.
public class CustomPicoFactory implements ObjectFactory {
    private final PicoFactory delegate;

    public CustomPicoFactory() {
        delegate = new PicoFactory();
    }

    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }
}
