package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class EvenNumbers {
	 public static List<Integer> getEvenNumbers(int start, int end) {
	        List<Integer> evenNumbers = new ArrayList<>();
	        
	        // Loop through the range of numbers
	        for (int i = start; i <= end; i++) {
	            // Check if the number is even
	            if (i % 2 == 0) {
	                evenNumbers.add(i);
	            }
	        }
	        
	        return evenNumbers;
	    }
	    
	    public static void main(String[] args) {
	        int start = 1;  // Start of the range
	        int end = 20;   // End of the range

	        System.out.println("Even numbers between " + start + " and " + end + ":");
	        
	        // Get even numbers and print them
	        List<Integer> evenNumbers = getEvenNumbers(start, end);
	        for (int num : evenNumbers) {
	            System.out.println(num);
	        }
	    }
}
