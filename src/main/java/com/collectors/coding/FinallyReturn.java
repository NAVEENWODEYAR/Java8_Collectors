package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class FinallyReturn {
    public static int getValue() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(getValue()); // 2
    }
}
