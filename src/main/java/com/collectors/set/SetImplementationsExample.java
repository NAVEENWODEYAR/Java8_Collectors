package com.collectors.set;

import java.util.*;

/**
 * Author: NaveenWodeyar
 */

public class SetImplementationsExample {
    public static void main(String[] args) {
        // HashSet: Does not maintain any order
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate
        hashSet.add("Cherry");

        System.out.println("HashSet (unordered):");
        for (String item : hashSet) {
            System.out.println(item);
        }

        // LinkedHashSet: Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple"); // Duplicate
        linkedHashSet.add("Cherry");

        System.out.println("\nLinkedHashSet (insertion order):");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // TreeSet: Maintains sorted order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Apple"); // Duplicate
        treeSet.add("Cherry");

        System.out.println("\nTreeSet (sorted order):");
        for (String item : treeSet) {
            System.out.println(item);
        }

        // Compare performance and complexity
        comparePerformanceAndComplexity();
    }

    private static void comparePerformanceAndComplexity() {
        final int ELEMENT_COUNT = 100_000;

        System.out.println("\n======= Performance & Complexity Report =======");

        measureSetPerformance("HashSet", new HashSet<>(), ELEMENT_COUNT);
        measureSetPerformance("LinkedHashSet", new LinkedHashSet<>(), ELEMENT_COUNT);
        measureSetPerformance("TreeSet", new TreeSet<>(), ELEMENT_COUNT);

        System.out.println("\n======= Theoretical Time & Space Complexity =======");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Set Type", "Add", "Remove", "Contains", "Iteration");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "HashSet", "O(1)", "O(1)", "O(1)", "O(n)");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "LinkedHashSet", "O(1)", "O(1)", "O(1)", "O(n)");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "TreeSet", "O(log n)", "O(log n)", "O(log n)", "O(n)");
    }

    private static void measureSetPerformance(String setName, Set<String> set, int count) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        for (int i = 0; i < count; i++) {
            set.add("Element " + i);
        }

        long endTime = System.nanoTime();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        long duration = endTime - startTime;
        long memoryUsed = memoryAfter - memoryBefore;
        double memoryKB = memoryUsed / 1024.0;
        double durationMillis = duration / 1_000_000.0;

        System.out.println("\n" + setName + ":");
        System.out.println("Add operation time: " + duration + " ns (" + durationMillis + " ms)");
        System.out.println("Approx. memory used: " + memoryUsed + " bytes (" + memoryKB + " KB)");
    }
}
