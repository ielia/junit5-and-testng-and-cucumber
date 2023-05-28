package com.ielia.poc.junit_testng_cucumber.steps;

import com.ielia.poc.junit_testng_cucumber.Context;
import com.ielia.poc.junit_testng_cucumber.ExtraCS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.logging.Logger;

public class CucumberSteps {
    private final Logger log = Logger.getLogger(CucumberSteps.class.getCanonicalName());

    protected Context context;
    protected ExtraCS extraCS;

    public CucumberSteps(Context context, ExtraCS extraCS) {
        this.context = context;
        this.extraCS = extraCS;
    }

    @Given("some {int}")
    public void given(int number) {
        ++context.x;
        ++extraCS.y;
        log.info(this + " Given some " + number);
    }

    @When("some {string}")
    public void when(String string) {
        ++context.x;
        ++extraCS.y;
        log.info(this + " When some " + string);
    }

    @Then("something.")
    public void then() {
        ++context.x;
        ++extraCS.y;
        log.info(this + " Then something.");
    }

    public String toString() {
        return "[context=" + context + ", extraCS=" + extraCS + ", this=" + String.format("@%8s", Integer.toHexString(hashCode())).replace(' ', '0') + "]";
    }
}
