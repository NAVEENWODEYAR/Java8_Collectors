package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is not a power of two.");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
