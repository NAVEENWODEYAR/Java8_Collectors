package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class PositiveNegativeZero {

	public static void main(String[] args) {
        int number = -5; // Change this value to test with different numbers
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println(result);
        
        int num1 = 10, num2 = 20;
        int largest = (num1 == num2) ? num1 : (num1 > num2 ? num1 : num2);
        System.out.println("Largest: " + largest);
        
        int age = 25;  // You can change this to test with different values
        String ageGroup = (age < 13) ? "Child" : (age < 20) ? "Teen" : "Adult";
        System.out.println("Age Group: " + ageGroup);
    }
}
