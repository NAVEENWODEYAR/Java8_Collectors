package com.collectors.hashmap;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class FlatMapCharactersExample {

    // Method to get unique characters from a list of words
    public static List<Character> getUniqueCharacters(List<String> words) {
        return words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))  // Flatten characters from each word
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        // Calling the method to get unique characters
        List<Character> uniqueCharacters = getUniqueCharacters(words);

        System.out.println(uniqueCharacters);  // Output: [h, e, l, o, w, r, d, j, a, v]
    }
}
