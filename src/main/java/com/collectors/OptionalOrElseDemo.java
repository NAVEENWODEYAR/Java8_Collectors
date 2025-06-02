package com.collectors;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalOrElseDemo {
    public static void main(String[] args) {
        String defaultVal = "Default";

        System.out.println("--- orElse example ---");
        Optional<String> opt1 = Optional.of("Actual");
        System.out.println(opt1.orElse(getDefault())); // getDefault() still runs

        System.out.println("--- orElseGet example ---");
        Optional<String> opt2 = Optional.of("Actual");
        System.out.println(opt2.orElseGet(() -> getDefault())); // getDefault() not called

        System.out.println("--- orElseThrow example ---");
        Optional<String> opt3 = Optional.empty();
        try {
            String result = opt3.orElseThrow(() -> new IllegalArgumentException("No value!"));
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    static String getDefault() {
        System.out.println("getDefault() called");
        return "Default";
    }
}

