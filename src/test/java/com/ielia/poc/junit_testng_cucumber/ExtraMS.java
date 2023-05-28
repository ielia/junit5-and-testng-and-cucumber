package com.ielia.poc.junit_testng_cucumber;

// PicoContainer
public class ExtraMS {
    public int z;

    public String toString() {
        return "ExtraMS@" + String.format("%8s", Integer.toHexString(hashCode())).replace(' ', '0') + " { z=" + z + " }";
    }
}
