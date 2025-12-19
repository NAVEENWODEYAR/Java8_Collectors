package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

class SecondLargestElement {

    // Method to find second largest element
    static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int num : arr) {

            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            // Update only second largest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    // Test case
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8};
        System.out.println(findSecondLargest(arr)); // 10
    }
}
