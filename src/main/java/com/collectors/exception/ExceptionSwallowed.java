package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

public class ExceptionSwallowed {

    public static void main(String[] args) {
        try {
            System.out.println(test());
        } catch (Exception e) {
            System.out.println("Caught in main: " + e);
        }
    }

    @SuppressWarnings("finally")
	static int test() {
        try {
            throw new RuntimeException("Thrown in try");
        } finally {
            System.out.println("Finally block executing...");
            throw new RuntimeException("Thrown in finally"); // Original exception is swallowed!
        }
    }
}
