package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class SkipMultiples {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) continue; // skip multiples of 5
            System.out.println(i + " ");
        }
    }
}

