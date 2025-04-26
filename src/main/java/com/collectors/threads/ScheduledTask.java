package com.collectors.threads;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ScheduledTask {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Running health check at " + System.currentTimeMillis());
        scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}
