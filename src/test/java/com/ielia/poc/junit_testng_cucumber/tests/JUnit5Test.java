package com.ielia.poc.junit_testng_cucumber.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit5Test {
    /* *
     * @return the suite of tests being tested
     * public static Test suite()
     * {
     *     return new TestSuite( AppTest.class );
     * }
     */

    @Test
    public void testJUnit5() {
        System.out.println(">>>>> JUnit5 <<<<<");
        Assertions.assertTrue(true);
    }
}
