package com.collectors.java23;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 *
 */

public class VirtualThreadExample {

	public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();

        executorService.submit(() -> {
            System.out.println("Hello from virtual thread!");
        });

        executorService.shutdown();
    }
}
