package com.collectors.codechallenge;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";

        Optional<Character> result = input.chars()                     // IntStream of char codes
            .mapToObj(c -> (char) c)                                  // Convert to Character Stream
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();

        System.out.println(result.orElse(null)); // Output: w
    }
}
