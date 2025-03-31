package com.collectors.hashmap;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class FlatMapCharactersExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        List<Character> uniqueCharacters = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))  // Flatten characters from each word
                .distinct()  // Remove duplicates
                .collect(Collectors.toList());

        System.out.println(uniqueCharacters);  // Output: [h, e, l, o, w, r, d, j, a, v]
    }
}
