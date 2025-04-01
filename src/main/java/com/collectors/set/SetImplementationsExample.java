package com.collectors.set;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class SetImplementationsExample {
    public static void main(String[] args) {
        // HashSet: Does not maintain any order
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate element
        hashSet.add("Cherry");
        
        System.out.println("HashSet (unordered): ");
        for (String item : hashSet) {
            System.out.println(item);
        }

        // LinkedHashSet: Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple"); // Duplicate element
        linkedHashSet.add("Cherry");
        
        System.out.println("\nLinkedHashSet (insertion order): ");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // TreeSet: Maintains sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Apple"); // Duplicate element
        treeSet.add("Cherry");
        
        System.out.println("\nTreeSet (sorted order): ");
        for (String item : treeSet) {
            System.out.println(item);
        }

        // Comparing performance of add, remove, contains operations
        comparePerformance();
    }

    private static void comparePerformance() {
        // Measure performance for HashSet
        long startTime, endTime;
        
        Set<String> hashSet = new HashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashSet.add("Element " + i);
        }
        endTime = System.nanoTime();
        System.out.println("\nHashSet add operation time: " + (endTime - startTime) + " ns");

        // Measure performance for LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedHashSet.add("Element " + i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add operation time: " + (endTime - startTime) + " ns");

        // Measure performance for TreeSet
        Set<String> treeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeSet.add("Element " + i);
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet add operation time: " + (endTime - startTime) + " ns");
    }
}
