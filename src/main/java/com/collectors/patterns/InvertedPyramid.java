package com.collectors.patterns;

import java.util.stream.IntStream;

/**
 * @author NaveenWodeyar
 *
 */

public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        IntStream.range(1, n + 1).forEach(i -> {
            // Print spaces
            String spaces = " ".repeat(i - 1);
            // Print stars
            String stars = "*".repeat(2 * (n - i) + 1);
            System.out.println(spaces + stars);
        });
    }
}
