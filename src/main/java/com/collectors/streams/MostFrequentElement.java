package com.collectors.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class MostFrequentElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5);

        Integer mostFrequent = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Group by value and count occurrences
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())  // Get the entry with the maximum count
                .map(Map.Entry::getKey)  // Extract the key (element)
                .orElse(null);  // Return null if the list is empty

        System.out.println("Most frequent element: " + mostFrequent);
    }
}
