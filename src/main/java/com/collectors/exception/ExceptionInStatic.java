package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

public class ExceptionInStatic {
    static {
        if (true) {
            throw new RuntimeException("Error in static block");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
