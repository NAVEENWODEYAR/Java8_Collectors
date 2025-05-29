package com.collectors.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class FirstUniqueCharStream {
    public static void main(String[] args) {
        String input = "aabbccdef";

        Character result = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

        System.out.println("First non-repeating character: " + result);
    }
}
