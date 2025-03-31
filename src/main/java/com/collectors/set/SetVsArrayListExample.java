package com.collectors.set;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class SetVsArrayListExample {

    public static void main(String[] args) {
        // Measure the time for ArrayList operations
        long startTime, endTime;

        // Create an ArrayList and measure add time
        List<String> arrayList = new ArrayList<>();
        startTime = System.nanoTime();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple"); // Duplicate element
        arrayList.add("Cherry");
        endTime = System.nanoTime();
        System.out.println("ArrayList add time: " + (endTime - startTime) + " ns");

        // Measure iteration time for ArrayList
        startTime = System.nanoTime();
        for (String item : arrayList) {
            // Simply iterating
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList iteration time: " + (endTime - startTime) + " ns");

        // Print ArrayList contents
        System.out.println("\nArrayList contains: ");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Measure the time for HashSet operations
        Set<String> hashSet = new HashSet<>();
        startTime = System.nanoTime();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate element
        hashSet.add("Cherry");
        endTime = System.nanoTime();
        System.out.println("\nHashSet add time: " + (endTime - startTime) + " ns");

        // Measure iteration time for HashSet
        startTime = System.nanoTime();
        for (String item : hashSet) {
            // Simply iterating
        }
        endTime = System.nanoTime();
        System.out.println("HashSet iteration time: " + (endTime - startTime) + " ns");

        // Print HashSet contents
        System.out.println("\nHashSet contains: ");
        for (String item : hashSet) {
            System.out.println(item);
        }

        // Print space complexities (both are O(n), where n is the number of elements added)
        System.out.println("\nSpace Complexity (both ArrayList and HashSet): O(n)");
    }
}
