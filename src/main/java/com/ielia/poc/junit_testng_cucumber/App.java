package com.ielia.poc.junit_testng_cucumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        printCompare(a, b);
    }

    public static void printCompare(String a, String b) {
        System.out.println("==:" + (a == b));
        System.out.println("eq:" + a.equals(b));
    }
}
