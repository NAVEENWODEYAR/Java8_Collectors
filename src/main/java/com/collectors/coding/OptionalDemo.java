package com.collectors.coding;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalDemo {
    public static void main(String[] args) {

        // 1. of()
        Optional<String> optional1 = Optional.of("Hello");
        System.out.println("Optional.of: " + optional1);

        // 2. ofNullable()
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println("Optional.ofNullable: " + optional2);

        // 3. empty()
        Optional<String> optional3 = Optional.empty();
        System.out.println("Optional.empty: " + optional3);

        // 4. isPresent()
        System.out.println("optional1.isPresent(): " + optional1.isPresent());

        // 5. isEmpty() (Java 11+)
        System.out.println("optional2.isEmpty(): " + optional2.isEmpty());

        // 6. get() — use with care
        if (optional1.isPresent()) {
            System.out.println("optional1.get(): " + optional1.get());
        }

        // 7. ifPresent()
        optional1.ifPresent(val -> System.out.println("ifPresent: " + val));

        // 8. ifPresentOrElse() (Java 9+)
        optional2.ifPresentOrElse(
            val -> System.out.println("Value: " + val),
            () -> System.out.println("No value present")
        );

        // 9. orElse()
        String result1 = optional2.orElse("Default Value");
        System.out.println("orElse: " + result1);

        // 10. orElseGet()
        String result2 = optional2.orElseGet(() -> "Generated Default");
        System.out.println("orElseGet: " + result2);

        // 11. orElseThrow()
        try {
            String value = optional2.orElseThrow(() -> new IllegalArgumentException("Value not present"));
            System.out.println("orElseThrow: " + value);
        } catch (Exception e) {
            System.out.println("orElseThrow exception: " + e.getMessage());
        }

        // 12. map()
        Optional<Integer> length = optional1.map(String::length);
        System.out.println("map (length): " + length);

        // 13. flatMap()
        Optional<Optional<Integer>> nested = optional1.map(s -> Optional.of(s.length()));
        System.out.println("map gives nested Optional: " + nested);

        Optional<Integer> flat = optional1.flatMap(s -> Optional.of(s.length()));
        System.out.println("flatMap gives flat Optional: " + flat);

        // 14. filter()
        Optional<String> filtered = optional1.filter(s -> s.startsWith("H"));
        System.out.println("filter (starts with H): " + filtered);

        Optional<String> filteredFalse = optional1.filter(s -> s.startsWith("X"));
        System.out.println("filter (starts with X): " + filteredFalse);
    }
}
