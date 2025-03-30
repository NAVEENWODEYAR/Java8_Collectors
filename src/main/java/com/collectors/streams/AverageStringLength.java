package com.collectors.streams;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class AverageStringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        double averageLength = words.stream()
                .mapToInt(String::length)    // Map each string to its length
                .average()                   // Calculate average
                .orElse(0.0);                // Default to 0.0 if list is empty

        System.out.println("Average string length: " + averageLength);
    }
}
