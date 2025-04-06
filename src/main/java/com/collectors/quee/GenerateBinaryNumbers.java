package com.collectors.quee;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class GenerateBinaryNumbers {
    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");

        for (int i = 1; i <= n; i++) {
            String current = queue.poll();
            System.out.println(current);
            queue.offer(current + "0");
            queue.offer(current + "1");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of binary numbers to generate
        generateBinary(n);
    }
}
