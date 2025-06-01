package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

public class TrickyExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Result: " + testExceptionFlow());
    }

    @SuppressWarnings("finally")
	static int testExceptionFlow() {
        try {
            return tryBlock();
        } catch (Exception e) {
            System.out.println("Catch Block");
            return catchBlock();
        } finally {
            System.out.println("Finally Block");
            return finallyBlock(); // What happens here?
        }
    }

    static int tryBlock() {
        System.out.println("Try Block");
        throw new RuntimeException("Exception in Try");
    }

    static int catchBlock() {
        System.out.println("Catch Logic");
        return 20;
    }

    static int finallyBlock() {
        System.out.println("Finally Logic");
        return 30;
    }
}
