package com.collectors.threads;

import java.util.concurrent.*;
/**
 * @author NaveenWodeyar
 *
 */
import java.util.concurrent.locks.*;

public class ReadWriteLockExample {
    private static final ReadWriteLock lock = new ReentrantReadWriteLock();
    private static int sharedData = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable reader = () -> {
            lock.readLock().lock();
            try {
                System.out.println("Reader reading value: " + sharedData);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.readLock().unlock();
            }
        };

        Runnable writer = () -> {
            lock.writeLock().lock();
            try {
                sharedData++;
                System.out.println("Writer writing value: " + sharedData);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.writeLock().unlock();
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 5; i++) {
            executor.submit(reader);
        }

        for (int i = 0; i < 2; i++) {
            executor.submit(writer);
        }

        executor.shutdown();
    }
}
