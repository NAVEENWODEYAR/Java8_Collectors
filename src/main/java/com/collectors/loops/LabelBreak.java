package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class LabelBreak {
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 3) break outer;
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
    }
}

