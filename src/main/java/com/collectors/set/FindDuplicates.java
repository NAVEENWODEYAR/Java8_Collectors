/**
 * 
 */
package com.collectors.set;

/**
 * @author NaveenWodeyar
 *
 */
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 6, 2, 7};

        // Call the method to find duplicates
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the element is already in the HashSet
            if (!set.add(arr[i])) {
                System.out.println("Duplicate found: " + arr[i]);
            }
        }
    }
}

