package com.collectors.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author NaveenWodeyar
 *
 */

public class ThreadSafeCounter {
    private final AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeCounter counter = new ThreadSafeCounter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Hame tu aponene loota gere mo kaha,\r\n"
        		+ "dum ta meri kashti be doobi waha jaha pani kam ta");
        System.out.println("Final count: " + counter.getCount());
    }
}

