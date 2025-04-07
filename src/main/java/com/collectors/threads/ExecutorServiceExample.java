package com.collectors.threads;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ExecutorServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a fixed thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task
        Future<Integer> future1 = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 10;
        });

        // Submit another task
        Future<Integer> future2 = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(3);
            return 20;
        });

        // Wait for results
        System.out.println("Task 1 result: " + future1.get());
        System.out.println("Task 2 result: " + future2.get());

        // Shutdown the executor
        executor.shutdown();
        if (executor.awaitTermination(60, TimeUnit.SECONDS)) {
            System.out.println("All tasks completed");
        } else {
            System.out.println("Timeout occurred before tasks finished");
        }
    }
}
