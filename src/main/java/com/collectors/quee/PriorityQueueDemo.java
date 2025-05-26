package com.collectors.quee;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}

