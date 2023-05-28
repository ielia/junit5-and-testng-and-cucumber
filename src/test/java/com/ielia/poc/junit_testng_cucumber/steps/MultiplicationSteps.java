package com.ielia.poc.junit_testng_cucumber.steps;

import com.ielia.poc.junit_testng_cucumber.Context;
import com.ielia.poc.junit_testng_cucumber.ExtraMS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.logging.Logger;

public class MultiplicationSteps {
    private final Logger log = Logger.getLogger(MultiplicationSteps.class.getCanonicalName());

    protected Context context;
    protected ExtraMS extraMS;

    protected int a;
    protected int b;
    protected int aXb;

    public MultiplicationSteps(Context context, ExtraMS extraMS) {
        this.context = context;
        this.extraMS = extraMS;
    }

    @Given("an A with value {int} and a B with value {int}")
    public void givenAandB(int a, int b) {
        this.a = a;
        this.b = b;
        ++context.x;
        ++extraMS.z;
        log.info(this + " Given A=" + a + " & B=" + b);
    }

    @Given("an A with value {int}")
    public void givenA(int number) {
        a = number;
        ++context.x;
        ++extraMS.z;
        log.info(this + " Given A=" + a);
    }

    @Given("a B with value {int}")
    public void givenB(int number) {
        b = number;
        ++context.x;
        ++extraMS.z;
        log.info(this + " Given B=" + b);
    }

    @When("I multiply both values")
    public void when() {
        aXb = a * b;
        ++context.x;
        ++extraMS.z;
        log.info(this + " When A*B=" + aXb);
    }

    @Then("I get value {int}.")
    public void then(int number) {
        Assert.assertEquals(aXb, number);
        ++context.x;
        ++extraMS.z;
        log.info(this + " Then A*B=" + aXb);
    }

    public String toString() {
        return "[context=" + context + ", extraMS=" + extraMS + ", this=" + String.format("@%8s", Integer.toHexString(hashCode())).replace(' ', '0') + "]";
    }
}
