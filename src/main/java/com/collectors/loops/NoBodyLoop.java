package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class NoBodyLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; sum += i++);
        System.out.println("Sum = " + sum);
    }
}
