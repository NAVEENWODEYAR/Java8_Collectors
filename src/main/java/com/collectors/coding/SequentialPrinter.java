package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class SequentialPrinter {

	private static final int MAX_NUMBER = 100;
    private static final Object lock = new Object();
    private static int counter = 1;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrinterTask(1));
        Thread t2 = new Thread(new PrinterTask(2));
        Thread t3 = new Thread(new PrinterTask(3));

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }

    static class PrinterTask implements Runnable {
        private final int threadId;

        public PrinterTask(int threadId) {
            this.threadId = threadId;
        }

        @Override
        public void run() {
            while (counter <= MAX_NUMBER) {
                synchronized (lock) {
                    if (counter % 3 == threadId - 1) {
                        System.out.println("Thread " + threadId + ": " + counter);
                        counter++;
                        lock.notifyAll(); // Notify other threads
                    } else {
                        try {
                            lock.wait(); // Wait for the turn
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }
}
