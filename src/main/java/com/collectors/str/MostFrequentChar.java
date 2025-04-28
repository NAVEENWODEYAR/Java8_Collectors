package com.collectors.str;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class MostFrequentChar {
    public static char mostFrequentChar(String input) {
        return input.chars()
                .filter(c -> c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar("stream stress test")); // Output: s
    }
}

