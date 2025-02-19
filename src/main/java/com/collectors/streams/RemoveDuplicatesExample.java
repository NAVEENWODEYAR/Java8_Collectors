package com.collectors.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class RemoveDuplicatesExample {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 4);
        
        List<Integer> uniqueNumbers = numbers.stream()
                                             .distinct()               // Remove duplicates
                                             .collect(Collectors.toList()); // Collect into a list
        
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}
