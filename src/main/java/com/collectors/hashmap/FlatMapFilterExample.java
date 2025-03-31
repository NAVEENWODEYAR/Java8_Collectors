package com.collectors.hashmap;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class FlatMapFilterExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3, 4),
            Arrays.asList(5, 6, 7, 8),
            Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream().filter(n -> n % 2 != 0))  // Flatten and filter odd numbers
                .collect(Collectors.toList());

        System.out.println(flattenedList);  // Output: [1, 3, 5, 7, 9, 11]
    }
}
