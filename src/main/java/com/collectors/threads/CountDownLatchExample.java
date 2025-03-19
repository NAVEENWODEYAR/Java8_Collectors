package com.collectors.threads;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 *
 */

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads = 3;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);

        for (int i = 0; i < numberOfThreads; i++) {
            final int threadId = i;
            executor.submit(() -> {
                try {
                    Thread.sleep((threadId + 1) * 1000);
                    System.out.println("Task " + threadId + " completed");
                    latch.countDown();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        latch.await(); // Wait until all threads have called countDown()
        System.out.println("All tasks completed. Proceeding...");
        executor.shutdown();
    }
}
