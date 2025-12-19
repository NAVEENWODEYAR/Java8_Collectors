package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

public class MissingNumberWithTestCases {

    // Method to find the missing number in array
    static int findMissing(int[] arr, int n) {

        // Calculate expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Subtract each element of array from expected sum
        for (int num : arr) {
            expectedSum -= num;
        }

        // Remaining value is the missing number
        return expectedSum;
    }

    // Test case
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissing(arr, 5)); // 3
    }
    
}
