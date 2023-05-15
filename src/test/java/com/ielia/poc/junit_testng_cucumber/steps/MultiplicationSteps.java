package com.ielia.poc.junit_testng_cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.bridge.SLF4JBridgeHandler;
import org.testng.Assert;

public class MultiplicationSteps {
    protected int a;
    protected int b;
    protected int aXb;

    public MultiplicationSteps() {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }

    @Given("an A with value {int} and a B with value {int}")
    public void givenAandB(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Given("an A with value {int}")
    public void givenA(int number) {
        a = number;
    }

    @Given("a B with value {int}")
    public void givenB(int number) {
        b = number;
    }

    @When("I multiply both values")
    public void when() {
        aXb = a * b;
    }

    @Then("I get value {int}.")
    public void then(int number) {
        Assert.assertEquals(aXb, number);
    }
}
