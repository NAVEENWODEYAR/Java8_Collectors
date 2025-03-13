package com.collectors.coding;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author NaveenWodeyar
 *
 */

public class CounterExample {

	 private static AtomicInteger counter = new AtomicInteger(0);
	    
	    public static void main(String[] args) throws InterruptedException {
	        // Create two threads, each increments the counter 100,000 times
	        Thread t1 = new Thread(new IncrementTask());
	        Thread t2 = new Thread(new IncrementTask());
	        
	        t1.start();
	        t2.start();
	        
	        // Wait for both threads to finish
	        t1.join();
	        t2.join();
	        
	        // Final value of the counter should be 200,000
	        System.out.println("Final Counter Value: " + counter.get());
	    }
	    
	    // Runnable that increments the counter 100,000 times
	    static class IncrementTask implements Runnable {
	        @Override
	        public void run() {
	            for (int i = 0; i < 100000; i++) {
	                counter.incrementAndGet(); // Atomically increment the counter
	            }
	        }
	    }
}
