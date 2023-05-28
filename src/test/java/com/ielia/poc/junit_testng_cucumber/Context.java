package com.ielia.poc.junit_testng_cucumber;

// PicoContainer
public class Context {
    public int x;

    public String toString() {
        return "Context@" + String.format("%8s", Integer.toHexString(hashCode())).replace(' ', '0') + " { x=" + x + " }";
    }
}
