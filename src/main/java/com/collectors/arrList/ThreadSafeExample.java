package com.collectors.arrList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author NaveenWodeyar
 *
 */

public class ThreadSafeExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new CopyOnWriteArrayList<>();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);  // Thread-safe
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("List size: " + list.size());  // Always 2000
    }
}

