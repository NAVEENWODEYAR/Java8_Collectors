package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class MultipleConditions {

	public static void main(String[] args) {
        int num = -8;  // You can change this value to test with different numbers
        String result = (num > 0) 
            ? (num % 2 == 0 ? "Positive Even" : "Positive Odd") 
            : (num < 0) 
                ? (num % 2 == 0 ? "Negative Even" : "Negative Odd") 
                : "Zero";
        System.out.println(result);
    }
}
