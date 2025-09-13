package com.collectors.optional;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalVsNullCheck {

    private static final int ITERATIONS = 10_000_000;

    // Simulate a class with a possibly null field
    static class User {
        private String name;

        User(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }

    // Traditional null check method
    public static int traditionalNullCheck(User user) {
        if (user != null && user.getName() != null) {
            return user.getName().length();
        } else {
            return 0;
        }
    }

    // Optional-based method
    public static int optionalCheck(Optional<User> optionalUser) {
        return optionalUser
                .map(User::getName)
                .map(String::length)
                .orElse(0);
    }

    public static void main(String[] args) {
        // Prepare test data
        User userWithName = new User("John Doe");
        User nullUser = null;

        Optional<User> optionalUserWithName = Optional.of(userWithName);
        Optional<User> optionalNullUser = Optional.ofNullable(nullUser);

        // Benchmark: Traditional null check
        long startTraditional = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum1 += traditionalNullCheck(userWithName);
            sum1 += traditionalNullCheck(nullUser);
        }
        long durationTraditional = System.nanoTime() - startTraditional;

        // Benchmark: Optional check
        long startOptional = System.nanoTime();
        int sum2 = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum2 += optionalCheck(optionalUserWithName);
            sum2 += optionalCheck(optionalNullUser);
        }
        long durationOptional = System.nanoTime() - startOptional;

        // Output results
        System.out.println("Traditional null check result: " + sum1);
        System.out.println("Optional check result:        " + sum2);
        System.out.println("Traditional null check time: " + durationTraditional / 1_000_000 + " ms");
        System.out.println("Optional check time:         " + durationOptional / 1_000_000 + " ms");
    }
}

