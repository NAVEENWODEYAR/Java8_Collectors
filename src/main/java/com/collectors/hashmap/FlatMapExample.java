package com.collectors.hashmap;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)  // Flatten the List<List<Integer>> to List<Integer>
                .collect(Collectors.toList());

        System.out.println(flattenedList);  // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

