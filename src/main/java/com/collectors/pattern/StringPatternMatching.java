package com.collectors.pattern;

/**
 * @author NaveenWodeyar
 *
 */

public class StringPatternMatching {
    public static void main(String[] args) {
        Object obj = "Java is awesome";

        if (obj instanceof String str && str.contains("Java")) {
            System.out.println("The string contains Java");
        } else {
            System.out.println("The string does not contain Java");
        }
    }
}
