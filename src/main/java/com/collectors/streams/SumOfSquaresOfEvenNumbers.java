package com.collectors.streams;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class SumOfSquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumOfSquares = numbers.stream()
                .filter(n -> n % 2 == 0)   // Filter even numbers
                .mapToInt(n -> n * n)      // Square the numbers
                .sum();                    // Sum the squares

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}
