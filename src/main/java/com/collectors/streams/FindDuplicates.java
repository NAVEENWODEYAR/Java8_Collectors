package com.collectors.streams;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "banana", "kiwi");

        Map<String, Long> duplicates = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by word and count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Filter duplicates (count > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(duplicates);  // Output: {apple=2, banana=2}
    }
}

