package com.collectors.quee;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class QueueAddOffer {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1); // throws exception if capacity is full
        queue.offer(2); // returns false if capacity is full

        System.out.println(queue); // Output: [1, 2]
    }
}
