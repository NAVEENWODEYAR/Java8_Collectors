package com.collectors.quee;

import java.util.*;


/**
 * @author NaveenWodeyar
 *
 */

public class QueueWithMax {
    private Queue<Integer> queue;
    private Deque<Integer> maxQueue;

    public QueueWithMax() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public void enqueue(int value) {
        queue.offer(value);
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
            maxQueue.pollLast();
        }
        maxQueue.offer(value);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int value = queue.poll();
        if (value == maxQueue.peek()) {
            maxQueue.poll();
        }
        return value;
    }

    public int getMax() {
        if (maxQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return maxQueue.peek();
    }

    public static void main(String[] args) {
        QueueWithMax queue = new QueueWithMax();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Max Element: " + queue.getMax());
        queue.dequeue();
        System.out.println("Max Element: " + queue.getMax());
    }
}

