package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class StaticBlockTest {
    static {
        System.out.println("Static block executed.");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
