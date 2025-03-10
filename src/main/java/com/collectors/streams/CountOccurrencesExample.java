package com.collectors.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class CountOccurrencesExample {

	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
        
        Map<String, Long> wordCounts = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        
        System.out.println("Word counts: " + wordCounts);
    }
}
