package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

public class ShadowExample {
    static int x = 10;

    {
        int x = 20; // Local to block
        System.out.println("Non-static block x = " + x);
    }

    public ShadowExample() {
        System.out.println("Constructor x = " + x);
    }

    public static void main(String[] args) {
        new ShadowExample();
    }
}
