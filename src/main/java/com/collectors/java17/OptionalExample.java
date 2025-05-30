package com.collectors.java17;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalExample {

    // Method using Optional.of
    public static Optional<String> getOptionalUsingOf(String value) {
        return Optional.of(value);  // Will throw NullPointerException if value is null
    }

    // Method using Optional.ofNullable
    public static Optional<String> getOptionalUsingOfNullable(String value) {
        return Optional.ofNullable(value);  // Returns Optional.empty() if value is null
    }

    // Simulated unit tests in main method
    public static void main(String[] args) {

        // Test: Optional.of with non-null
        try {
            Optional<String> result = getOptionalUsingOf("Hello");
            System.out.println("Test 1 Passed: " + result.get());
        } catch (Exception e) {
            System.out.println("Test 1 Failed: " + e);
        }

        // Test: Optional.of with null (should throw exception)
        try {
            Optional<String> result = getOptionalUsingOf(null);
            System.out.println("Test 2 Failed: Expected exception but got " + result);
        } catch (NullPointerException e) {
            System.out.println("Test 2 Passed: Caught expected exception - " + e);
        }

        // Test: Optional.ofNullable with non-null
        Optional<String> result3 = getOptionalUsingOfNullable("World");
        if (result3.isPresent() && result3.get().equals("World")) {
            System.out.println("Test 3 Passed: " + result3.get());
        } else {
            System.out.println("Test 3 Failed");
        }

        // Test: Optional.ofNullable with null
        Optional<String> result4 = getOptionalUsingOfNullable(null);
        if (result4.isEmpty()) {
            System.out.println("Test 4 Passed: Got Optional.empty");
        } else {
            System.out.println("Test 4 Failed: Expected empty but got " + result4.get());
        }
    }
}
