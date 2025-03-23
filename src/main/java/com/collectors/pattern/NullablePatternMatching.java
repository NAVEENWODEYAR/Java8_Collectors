package com.collectors.pattern;

/**
 * @author NaveenWodeyar
 *
 */

public class NullablePatternMatching {
    public static void main(String[] args) {
        Object obj = null;

        if (obj == null) {
            System.out.println("Object is null");
        } else if (obj instanceof String s) {
            System.out.println("It's a String: " + s);
        } else if (obj instanceof Integer i) {
            System.out.println("It's an Integer: " + i);
        } else {
            System.out.println("Unknown type");
        }
    }
}
