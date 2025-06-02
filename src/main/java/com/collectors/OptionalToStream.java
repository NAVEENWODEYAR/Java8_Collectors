package com.collectors;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalToStream {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        long count = optional
            .stream()  // turns into Stream<T>
            .filter(s -> s.length() > 3)
            .count();

        System.out.println("Filtered count: " + count); // 1
    }
}

