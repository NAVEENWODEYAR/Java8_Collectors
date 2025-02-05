package com.collectors.quee;

import java.util.PriorityQueue;

/**
 * @author NaveenWodeyar
 *
 */

public class PriorityQueueExample {

	 public static void main(String[] args){
		 
	        //Creating a PriorityQueue with default Comparator.
	        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
	 
	        //Inserting elements into pQueue.
	 
	        pQueue.offer(21);
	 
	        pQueue.offer(17);
	 
	        pQueue.offer(37);
	 
	        pQueue.offer(41);
	 
	        pQueue.offer(9);
	 
	        pQueue.offer(67);
	 
	        pQueue.offer(31);
	 
	        //Removing the head elements
	 
	        System.out.println(pQueue.poll());     //Output : 9
	 
	        System.out.println(pQueue.poll());     //Output : 17
	 
	        System.out.println(pQueue.poll());     //Output : 21
	 
	        System.out.println(pQueue.poll());     //Output : 31
	 
	        System.out.println(pQueue.poll());     //Output : 37
	 
	        System.out.println(pQueue.poll());     //Output : 41
	 
	        System.out.println(pQueue.poll());     //Output : 67
	        
	        // Print and remove elements in priority order (descending)
	        System.out.println("PriorityQueue (Descending Order): ");
	        while (!pQueue.isEmpty()) {
	            System.out.println(pQueue.poll());
	        }
	    }
}
