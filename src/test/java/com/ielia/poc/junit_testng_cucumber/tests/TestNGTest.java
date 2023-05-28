package com.ielia.poc.junit_testng_cucumber.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
    @Test
    public void testTestNG() {
        System.out.println(">>>>> TestNG <<<<<");
        Assert.assertTrue(true);
    }
}
