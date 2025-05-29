package com.collectors.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class GroupWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "apricot", "banana", "blueberry", "cherry");

        Map<Character, List<String>> grouped = words.stream()
            .collect(Collectors.groupingBy(w -> w.charAt(0)));

        System.out.println(grouped);
    }
}
