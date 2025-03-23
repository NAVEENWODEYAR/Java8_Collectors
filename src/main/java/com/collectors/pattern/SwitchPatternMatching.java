package com.collectors.pattern;

/**
 * @author NaveenWodeyar
 *
 */

public class SwitchPatternMatching {
    public static void main(String[] args) {
        Object obj = "Java";

        String result = switch (obj) {
            case String s -> "It's a String: " + s;
            case Integer i -> "It's an Integer: " + i;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
