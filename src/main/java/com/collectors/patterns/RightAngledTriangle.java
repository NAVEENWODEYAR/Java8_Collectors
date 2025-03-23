package com.collectors.patterns;

import java.util.stream.IntStream;

/**
 * @author NaveenWodeyar
 *
 */

public class RightAngledTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        IntStream.rangeClosed(1, n)
                 .forEach(i -> {
                     IntStream.rangeClosed(1, i)
                              .forEach(j -> System.out.print("* "));
                     System.out.println();
                 });
    }
}
