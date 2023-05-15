package com.ielia.poc.junit_testng_cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.bridge.SLF4JBridgeHandler;

public class CucumberSteps {
    public CucumberSteps() {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }

    @Given("some {int}")
    public void given(int number) {
        System.out.println("Given some " + number);
    }

    @When("some {string}")
    public void when(String string) {
        System.out.println("When some " + string);
    }

    @Then("something.")
    public void then() {
        System.out.println("Then something.");
    }
}
