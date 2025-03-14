package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */

public class ProducerConsumerExample {

	public static void main(String[] args) {
        SharedQueue queue = new SharedQueue();
        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        
        producer.start();
        consumer.start();
    }
}
