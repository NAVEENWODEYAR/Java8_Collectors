package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int missingNumber = findMissingNumber(arr, 6); // Array contains numbers from 1 to 6, missing 3
        System.out.println("Missing Number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; // Sum of 1 to n
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }
}

