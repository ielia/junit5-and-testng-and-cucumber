package com.ielia.poc.junit_testng_cucumber;

// PicoContainer
public class ExtraCS {
    public int y;

    public String toString() {
        return "ExtraCS@" + String.format("%8s", Integer.toHexString(hashCode())).replace(' ', '0') + " { y=" + y + " }";
    }
}
