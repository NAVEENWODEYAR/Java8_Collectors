package com.collectors.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class FlattenListExample {

	public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
        );
        
        List<Integer> flattenedList = listOfLists.stream()
                                                 .flatMap(List::stream) // Flatten each sublist
                                                 .collect(Collectors.toList()); // Collect into a list
        
        System.out.println("Flattened list: " + flattenedList);
    }
}
