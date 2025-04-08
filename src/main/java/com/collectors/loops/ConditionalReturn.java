package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */
public class ConditionalReturn {

    // Method to check if a number is positive, negative, or zero
    public static String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(5));  // Output: Positive
        System.out.println(checkNumber(-3)); // Output: Negative
        System.out.println(checkNumber(0));  // Output: Zero
    }
}

