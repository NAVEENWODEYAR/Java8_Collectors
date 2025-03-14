package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */
public class Producer implements Runnable {

	private SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int value = (int) (Math.random() * 100);
                queue.produce(value);
                System.out.println("Produced: " + value);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
