package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class NoNumbers {
    public static void main(String[] args) {
        int one = 'A' / 'A';  // 65 / 65 = 1
        int ten = 'J' - 'A' + one; // 74 - 65 + 1 = 10

        for (int i = one; i <= ten; i++) {
            System.out.println(i + " ");
        }
    }
}
