package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */
public class ThreadTrick {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Thread t = new Thread(() -> {
            long threadStart = System.nanoTime(); // Start inside thread
            System.out.println("Running in thread");
            long threadEnd = System.nanoTime(); // End inside thread

            long threadDuration = threadEnd - threadStart;
            System.out.println("Thread execution time (ns): " + threadDuration);
        });

        t.start();

        try {
            t.join(); // Wait for thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime(); // End time after thread completes
        long duration = endTime - startTime;

        System.out.println("Total time including thread setup/join (ns): " + duration);
    }
}
