package com.collectors.threads;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class SharedQueue {

	private Queue<Integer> queue = new LinkedList<>();
    private final int MAX_SIZE = 10;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == MAX_SIZE) {
            wait();
        }
        queue.add(value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        notifyAll();
        return value;
    }
}
