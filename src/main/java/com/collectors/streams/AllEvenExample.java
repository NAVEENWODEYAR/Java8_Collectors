package com.collectors.streams;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class AllEvenExample {

	 public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
	        
	        boolean areAllEven = numbers.stream()
	                                    .allMatch(n -> n % 2 == 0);  // Check if all numbers are even
	        
	        System.out.println("Are all numbers even? " + areAllEven);
	    }
}
