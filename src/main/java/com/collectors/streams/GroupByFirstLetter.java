package com.collectors.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class GroupByFirstLetter {

	public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
        
        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                                                                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println("Grouped by first letter: " + groupedByFirstLetter);
    }
}
