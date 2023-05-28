package com.ielia.poc.junit_testng_cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"classpath:features"},
        glue = {"classpath:com.ielia.poc.junit_testng_cucumber.steps"}
        // tags = "@mixed"
)
public class TestNGCucumberTests extends AbstractTestNGCucumberTests {
    public TestNGCucumberTests() {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
