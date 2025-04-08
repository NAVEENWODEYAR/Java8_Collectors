package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */
public class ReturnAfterExit {
    public static void main(String[] args) {
        testMethod();
    }

    public static void testMethod() {
        System.exit(0); // Exit the JVM
        return; // This line will never be executed
    }
}
