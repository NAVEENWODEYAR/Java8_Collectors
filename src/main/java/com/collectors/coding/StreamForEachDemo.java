package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.Arrays;
import java.util.List;

public class StreamForEachDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Using Java 8 Stream forEach
        numbers.stream().forEach(n -> System.out.println(n));
    }
}
