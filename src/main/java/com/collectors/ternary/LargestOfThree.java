package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class LargestOfThree {

	public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int largest = findLargest(a, b, c);
        System.out.println("Largest: " + largest);
    }

    // Method to find the largest of three numbers
    public static int findLargest(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }
}
