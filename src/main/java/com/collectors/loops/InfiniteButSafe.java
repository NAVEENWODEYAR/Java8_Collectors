package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class InfiniteButSafe {
    public static void main(String[] args) {
        int i = 0;
        for (;;) {
            if (i == 5) break;
            System.out.println(i++);
        }
    }
}
