package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */

public class TernaryTypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        double result = true ? a : b; // Implicit cast to double
        System.out.println("Result: " + result);
    }
}
