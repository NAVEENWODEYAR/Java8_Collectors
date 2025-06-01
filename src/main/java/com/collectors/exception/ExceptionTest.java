package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Result: " + trickyMethod());
    }

    @SuppressWarnings("finally")
	static int trickyMethod() {
        try {
            System.out.println("In try block");
            int a = 5 / 0;  
            return 10;
        } catch (ArithmeticException e) {
            System.out.println("In catch block");
            return 20;
        } finally {
            System.out.println("In finally block");
            return 30;
        }
    }
}

