package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class ReturnInFinally {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    public static String testMethod() {
        try {
            return "Returned from try";
        } finally {
            return "Returned from finally"; // This return will override the previous one
        }
    }
}
