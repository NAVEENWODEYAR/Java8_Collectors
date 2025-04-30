package com.collectors.threads;

import org.junit.jupiter.api.Test;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author NaveenWodeyar
 *
 */

public class CyclicBarrierDemoTest {

    @Test
    void testAllThreadsReachBarrier() throws InterruptedException {
        final int THREAD_COUNT = 3;
        CountDownLatch latch = new CountDownLatch(THREAD_COUNT);

        CyclicBarrier barrier = new CyclicBarrier(THREAD_COUNT, () ->
            System.out.println("Barrier action executed")
        );

        Runnable workerTask = () -> {
            try {
                Thread.sleep((int) (Math.random() * 1000)); // simulate work
                barrier.await();
                latch.countDown(); // signal completion
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(workerTask).start();
        }

        // Wait for all threads to count down, max 5 seconds
        boolean allThreadsCompleted = latch.await(5, TimeUnit.SECONDS);
        assertTrue(allThreadsCompleted, "Not all threads completed as expected");
    }
}

