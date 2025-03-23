package com.collectors.patterns;

import java.util.stream.IntStream;

/**
 * @author NaveenWodeyar
 *
 */

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows (upper half)

        // Upper half of the diamond
        IntStream.range(1, n + 1).forEach(i -> {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        });

        // Lower half of the diamond
        IntStream.range(1, n).forEach(i -> {
            String spaces = " ".repeat(i);
            String stars = "*".repeat(2 * (n - i) - 1);
            System.out.println(spaces + stars);
        });
    }
}
