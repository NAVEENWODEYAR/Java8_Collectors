package com.collectors.str;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class SecondHighest {
    public static Optional<Integer> secondHighest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(5, 3, 9, 1, 5, 7, 9);
        System.out.println(secondHighest(input).orElseThrow()); // Output: 7
    }
}
