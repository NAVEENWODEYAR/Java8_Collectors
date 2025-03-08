package com.collectors.set;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.HashSet;
import java.util.*;

public class FindDuplicates {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 6, 2, 7};
        
        // Call the method to find duplicates
        List<Integer> duplicates = findDuplicates(arr);
        
        // Printing out duplicates
        for (Integer duplicate : duplicates) {
            System.out.println("Duplicate found: " + duplicate);
        }
    }

    public static List<Integer> findDuplicates(int[] arr) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the element is already in the HashSet
            if (!set.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }
}

