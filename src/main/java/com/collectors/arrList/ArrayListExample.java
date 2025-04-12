package com.collectors.arrList;

/**
 * @author NaveenWodeyar
 *
 */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Java Runtime instance to monitor memory usage
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Call GC to get more accurate memory reading

        // Memory before execution
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();

        // Time before execution
        long startTime = System.nanoTime();

        // Core logic: ArrayList operations
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Printing the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Accessing an element by index
        System.out.println("The first fruit is: " + fruits.get(0));

        // Modifying an element
        fruits.set(2, "Pineapple");
        System.out.println("Updated list: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("List after removing Banana: " + fruits);

        // Checking if an element exists
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list.");
        }

        // Getting the size
        System.out.println("The number of fruits in the list: " + fruits.size());

        // Iterating
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Time after execution
        long endTime = System.nanoTime();

        // Memory after execution
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // Calculating differences
        long durationNano = endTime - startTime;
        double durationMillis = durationNano / 1_000_000.0;

        long memoryUsedBytes = memoryAfter - memoryBefore;
        double memoryUsedKB = memoryUsedBytes / 1024.0;

        // Output the performance metrics
        System.out.println("\n======= Performance Metrics =======");
        System.out.println("Time taken: " + durationNano + " ns (" + durationMillis + " ms)");
        System.out.println("Memory used: " + memoryUsedBytes + " bytes (" + memoryUsedKB + " KB)");

        // Big-O analysis for reference
        System.out.println("\n======= Theoretical Time & Space Complexity =======");
        System.out.println("Add operation (amortized): O(1)");
        System.out.println("Get by index: O(1)");
        System.out.println("Set by index: O(1)");
        System.out.println("Remove (by value): O(n)");
        System.out.println("Contains (search): O(n)");
        System.out.println("Iteration: O(n)");
        System.out.println("Overall Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n)");
    }
}
