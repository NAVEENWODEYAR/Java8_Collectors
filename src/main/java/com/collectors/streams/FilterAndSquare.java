package com.collectors.streams;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSquare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squaredEvens = numbers.stream()
                .filter(n -> n % 2 == 0)         // Filter even numbers
                .map(n -> n * n)                 // Square the numbers
                .collect(Collectors.toList());   // Collect the results into a list

        System.out.println(squaredEvens);  // Output: [4, 16, 36, 64, 100]
    }
}
