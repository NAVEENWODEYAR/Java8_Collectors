package com.collectors.numbers;

import java.util.stream.IntStream;

/**
 * @author NaveenWodeyar
 *
 */

public class SingleNonRepeating {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        int result = IntStream.of(nums)
                              .reduce(0, (a, b) -> a ^ b); // XOR trick
        System.out.println("Single non-repeating element: " + result);
    }
}
