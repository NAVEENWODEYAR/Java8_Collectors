package com.collectors.threads;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 *
 */

public class CyclicBarrierExample {
    public static void main(String[] args) {
        final int THREAD_COUNT = 3;
        CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT, () -> 
            System.out.println("All threads reached barrier. Proceeding...")
        );

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " reached the barrier");
            try {
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " passed the barrier");
            } catch (Exception e) { e.printStackTrace(); }
        };

        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(task).start();
        }
    }
}

