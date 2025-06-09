package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

public class StaticMethodExample {
    static int value = 10;

    static {
        System.out.println("Static block: value = " + value);
        value = initialize();
    }

    static int initialize() {
        System.out.println("Static method called during static block");
        return 42;
    }

    public static void main(String[] args) {
        System.out.println("Main method: value = " + value);
    }
}
