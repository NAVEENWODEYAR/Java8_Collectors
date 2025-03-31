package com.collectors.hashmap;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class FlatMapMultiplesExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        List<String> multiples = numbers.stream()
                .flatMap(number -> Stream.of(number * 1, number * 2, number * 3))  // Generate multiples
                .map(String::valueOf)  // Convert to string
                .collect(Collectors.toList());

        System.out.println(multiples);  // Output: [1, 2, 3, 2, 4, 6, 3, 6, 9]
    }
}
