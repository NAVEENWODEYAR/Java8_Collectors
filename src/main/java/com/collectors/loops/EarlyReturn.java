package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class EarlyReturn {

    // Method to check if a number is even or odd
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
            return; // Return early if the number is even
        }
        System.out.println(num + " is odd.");
    }

    public static void main(String[] args) {
        checkEvenOdd(4); // Output: 4 is even.
        checkEvenOdd(7); // Output: 7 is odd.
    }
}

