package com.collectors.pattern;

/**
 * @author NaveenWodeyar
 *
 */

public class MultipleTypeMatching {
    public static void main(String[] args) {
        Object obj = 123;

        if (obj instanceof String || obj instanceof Integer) {
            switch (obj) {
                case String s -> System.out.println("It's a String: " + s);
                case Integer i -> System.out.println("It's an Integer: " + i);
                default -> throw new IllegalArgumentException("Unexpected value: " + obj);
            }
        } else {
            System.out.println("Unknown type");
        }
    }
}

