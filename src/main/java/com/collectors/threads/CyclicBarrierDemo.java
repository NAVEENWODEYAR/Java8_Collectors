package com.collectors.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author NaveenWodeyar
 *
 */

public class CyclicBarrierDemo {

    // Task for each thread
    static class Worker implements Runnable {
        private CyclicBarrier barrier;
        private String name;

        public Worker(CyclicBarrier barrier, String name) {
            this.barrier = barrier;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " is working...");
                Thread.sleep((int) (Math.random() * 2000)); // Simulate work
                System.out.println(name + " waiting at barrier.");
                barrier.await();  // Wait at barrier
                System.out.println(name + " passed the barrier.");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final int THREAD_COUNT = 3;

        // Barrier action to be executed when all threads reach the barrier
        CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT, () -> 
            System.out.println("All threads have reached the barrier. Proceeding...\n")
        );

        // Create and start threads
        Thread t1 = new Thread(new Worker(barrier, "Thread-1"));
        Thread t2 = new Thread(new Worker(barrier, "Thread-2"));
        Thread t3 = new Thread(new Worker(barrier, "Thread-3"));

        t1.start();
        t2.start();
        t3.start();
    }
}

