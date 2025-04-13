package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */

public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		  int numberOfItems = 1_000_000; // M (adjust to test performance)
	        
	        SharedQueue queue = new SharedQueue();
	        Runtime runtime = Runtime.getRuntime();
	        
	     // Garbage collect and record memory before
	        runtime.gc();
	        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
	        long startTime = System.currentTimeMillis();
	        
	 
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        
        producer.start();
        consumer.start();
        long endTime = System.currentTimeMillis();
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        
        System.out.println("Time taken (ms): " + (endTime - startTime));
        System.out.println("Approx. Memory used (bytes): " + (memoryAfter - memoryBefore));
    
    }
}
