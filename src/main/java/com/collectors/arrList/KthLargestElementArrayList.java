package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 */

public class KthLargestElementArrayList {
    public static void main(String[] args) {
        System.out.println("Find Kth Largest Element in ArrayList");

        // Java runtime instance
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest GC for more accurate memory measurement

        // Memory before
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // Time before
        long startTime = System.nanoTime();

        // Core logic
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 7, 10, 4, 3, 20, 15);

        int k = 4;

        // Sorting in descending order
        Collections.sort(list, Collections.reverseOrder());

        int kthLargest = list.get(k - 1);
        System.out.println(k + "th Largest Element: " + kthLargest);

        // Time after
        long endTime = System.nanoTime();

        // Memory after
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // Time and memory calculations
        long durationNano = endTime - startTime;
        double durationMillis = durationNano / 1_000_000.0;

        long memoryUsedBytes = memoryAfter - memoryBefore;
        double memoryUsedKB = memoryUsedBytes / 1024.0;

        // Output performance
        System.out.println("\n======= Performance Metrics =======");
        System.out.println("Time taken: " + durationNano + " ns (" + durationMillis + " ms)");
        System.out.println("Memory used: " + memoryUsedBytes + " bytes (" + memoryUsedKB + " KB)");

        // Big-O theoretical complexity
        System.out.println("\n======= Theoretical Time & Space Complexity =======");
        System.out.println("Sorting Time Complexity: O(n log n)");
        System.out.println("Access kth element: O(1)");
        System.out.println("Overall Time Complexity: O(n log n)");
        System.out.println("Space Complexity: O(n) for ArrayList");
    }
}
