package com.collectors.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class SecondLargest {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 2, 8, 7);
        
        Optional<Integer> secondLargest = numbers.stream()
                                                 .sorted((a, b) -> b - a) // Sort in descending order
                                                 .skip(1)                 // Skip the largest number
                                                 .findFirst();            // Get the first number (second largest)
        
        secondLargest.ifPresent(value -> System.out.println("Second largest number: " + value));
    }
}
