package com.collectors.streams;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        String longestWord = words.stream()
                .max((word1, word2) -> word1.length() - word2.length()) // Compare by length
                .orElse("No words");  // Default value if the list is empty

        System.out.println(longestWord);  // Output: "banana"
    }
}

