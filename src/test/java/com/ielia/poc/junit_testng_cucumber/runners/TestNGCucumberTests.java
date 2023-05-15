package com.ielia.poc.junit_testng_cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"classpath:features/*.feature"},
        glue = {"classpath:com.ielia.poc.junit_testng_cucumber.steps"}
)
public class TestNGCucumberTests extends AbstractTestNGCucumberTests {
}
