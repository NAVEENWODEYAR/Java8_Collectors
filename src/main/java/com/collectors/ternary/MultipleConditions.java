package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class MultipleConditions {

	public static void main(String[] args) {
        int num = -8;  // You can change this value to test with different numbers
        String result = checkNumber(num);
        System.out.println(result);
    }

    // Method to check the number and return the appropriate result
    public static String checkNumber(int num) {
        return (num > 0) 
            ? (num % 2 == 0 ? "Positive Even" : "Positive Odd") 
            : (num < 0) 
                ? (num % 2 == 0 ? "Negative Even" : "Negative Odd") 
                : "Zero";
    }
}
