package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

public class MissingNumber {

	public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = (n + 1) * (n + 2) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 5;  // Array size (N)
        System.out.println("Missing Number: " + findMissingNumber(arr, n));
    }
}
