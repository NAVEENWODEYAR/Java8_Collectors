package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class NumberComparisonPrimitive {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        double x = 15.5;
        double y = 15.5;

        // Integer comparison
        System.out.println("a == b: " + (a == b));       // false
        System.out.println("a < b: " + (a < b));         // true
        System.out.println("a > b: " + (a > b));         // false

        // Decimal comparison
        System.out.println("x == y: " + (x == y));       // true
        System.out.println("x <= y: " + (x <= y));       // true
    }
}
