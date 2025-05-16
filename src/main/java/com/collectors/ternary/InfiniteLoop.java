package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class InfiniteLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i--) {
            System.out.println("i = " + i);
        }
    }
}
