package com.collectors.streams;

/**
 * @author NaveenWodeyar
 * Group Strings by Their Lengths and Reverse the Strings in Each Group
 */

import java.util.*;
import java.util.stream.Collectors;

public class StreamTrick {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "ball", "cat", "dog", "elephant");

        Map<Integer, List<String>> groupedAndReversed = words.stream()
                // Group by string length
                .collect(Collectors.groupingBy(String::length,
                        // For each group, reverse the strings
                        Collectors.mapping(word -> new StringBuilder(word).reverse().toString(), Collectors.toList())))
                // Sort the groups by their length
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        // Output the result
        groupedAndReversed.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

