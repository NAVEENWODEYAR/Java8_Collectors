package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */

public class RaceConditionExample {

	private static int counter = 0;

    public static void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter value: " + counter); // The result will likely not be 2000 without synchronization
    }
}
