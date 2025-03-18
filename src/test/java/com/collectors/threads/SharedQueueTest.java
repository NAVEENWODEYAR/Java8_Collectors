package com.collectors.threads;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author NaveenWodeyar
 *
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SharedQueueTest {

    private SharedQueue sharedQueue;

    @BeforeEach
    public void setUp() {
        sharedQueue = new SharedQueue();
    }

    @Test
    public void testProduceAndConsume() throws InterruptedException {
        // Start a producer thread
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    sharedQueue.produce(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start a consumer thread
        executorService.submit(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    int value = sharedQueue.consume();
                    System.out.println("Consumed: " + value);
                    assertEquals(i, value); // Ensure the consumer gets the correct value
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS); // Wait for threads to finish
    }

    @Test
    public void testProduceWhenQueueIsFull() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        
        // Fill the queue
        for (int i = 1; i <= 10; i++) {
            sharedQueue.produce(i);
        }

        // Ensure queue is full
        executorService.submit(() -> {
            try {
                // Attempt to produce another item, this should block until space is available
                sharedQueue.produce(11);
                System.out.println("Produced after space became available");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
    }

    @Test
    public void testConsumeWhenQueueIsEmpty() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // Start a consumer thread
        executorService.submit(() -> {
            try {
                // This will block as the queue is empty
                int value = sharedQueue.consume();
                System.out.println("Consumed: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        sharedQueue = null;
    }
}
