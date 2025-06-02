package com.collectors;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalMapFlatMap {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("OpenAI");

        // Using map to transform the value
        Optional<Integer> length = name.map(String::length);
        System.out.println("Length of name: " + length.orElse(0)); // 6

        // Using flatMap to avoid nested Optionals
        Optional<Optional<String>> nested = Optional.of(Optional.of("ChatGPT"));
        Optional<String> flat = nested.flatMap(o -> o);
        System.out.println("Flattened value: " + flat.orElse("Empty")); // ChatGPT
    }
}

