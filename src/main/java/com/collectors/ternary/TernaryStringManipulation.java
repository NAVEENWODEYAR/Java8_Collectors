package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class TernaryStringManipulation {
    public static void main(String[] args) {
        int n = 5;
        String result = (n > 0) ? (n == 5 ? "Five" : "Positive") : (n == 0 ? "Zero" : "Negative");
        
        System.out.println(result);  // Output: Five
    }
}
