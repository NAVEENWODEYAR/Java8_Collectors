package com.collectors.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NaveenWodeyar
 *
 */

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentMarks = new HashMap<>();

        // Add key-value pairs to the map
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);

        // Print the entire map
        System.out.println("Student Marks: " + studentMarks);

        // Get a value by key
        System.out.println("Marks of Bob: " + studentMarks.get("Bob"));

        // Check if a key exists
        if (studentMarks.containsKey("Alice")) {
            System.out.println("Alice's marks are present in the map.");
        }

        // Iterate through the map
        System.out.println("\nIterating through the map:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Remove a key-value pair
        studentMarks.remove("Charlie");

        // Print updated map
        System.out.println("\nUpdated Student Marks: " + studentMarks);
    }
}
