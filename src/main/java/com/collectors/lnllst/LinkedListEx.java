package com.collectors.lnllst;

import java.util.LinkedList;

/**
 * @author NaveenWodeyar
 *
 */

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		 
        //Adding elements at the end of the list
        list.add(10);
        list.addLast(20);
        list.offer(30);
        list.offerLast(40);
  
        System.out.println(list);      //Output : [10, 20, 30, 40]
 
        //Adding elements at the beginning of the list
        list.offerFirst(1);
        list.addFirst(2);
  
        System.out.println(list);  
        
      //Removing the elements from the head of the LinkedList
        list.poll();
        list.pollFirst();
        list.remove();
        list.removeFirst();
  
        System.out.println(list);     //Output : [FIVE, SIX, SEVEN]
 
        //Removing elements from the end of the LinkedList
         list.pollLast();
        list.removeLast();
        
      //Replacing an element at index 2 with "ZERO"
        list.set(2, 1);
        
        //Retrieving the elements from the head
        System.out.println(list.element());     
        System.out.println(list.getFirst());     
        System.out.println(list.peek());        
        System.out.println(list.peekFirst());     
        
        //Retrieving the elements from the tail
        System.out.println(list.peekLast());     
        System.out.println(list.getLast());     
        
      //Removing the first occurrence of "J2EE"
        list.removeFirstOccurrence("J2EE"); 
        System.out.println(list);     
       
        //Removing the last occurrence of "J2EE"
        list.removeLastOccurrence("J2EE");
        System.out.println(list);    
	}

}
