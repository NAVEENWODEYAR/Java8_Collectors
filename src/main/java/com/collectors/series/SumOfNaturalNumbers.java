package com.collectors.series;

/**
 * @author NaveenWodeyar
 *
 */

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Limit up to which sum is calculated
        
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
