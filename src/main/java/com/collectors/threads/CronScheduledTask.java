package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.concurrent.*;

public class CronScheduledTask {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Running health check at " + System.currentTimeMillis());
        scheduler.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);
    }
}

