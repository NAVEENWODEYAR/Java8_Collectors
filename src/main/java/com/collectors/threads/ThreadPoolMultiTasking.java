package com.collectors.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates multithreading with a fixed thread pool.
 * Measures time taken to complete all tasks.
 * 
 * @author Naveen
 */
class Task implements Runnable {
    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ThreadPoolMultiTasking {

    public static void main(String[] args) {
        int numberOfTasks = 5;         // T
        int numberOfThreads = 3;       // P

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= numberOfTasks; i++) {
            executorService.submit(new Task(i));
        }

        executorService.shutdown();

        try {
            // Wait for all tasks to finish or timeout after 10 seconds
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("\nTotal execution time: " + (endTime - startTime) + " ms");
        System.out.println("Time Complexity ≈ O(T / P)");
        System.out.println("Space Complexity ≈ O(T)");
    }
}
