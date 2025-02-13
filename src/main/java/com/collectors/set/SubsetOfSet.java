package com.collectors.set;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class SubsetOfSet {

	 public static void main(String[] args) {
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	        
	        set1.add(1);
	        set1.add(2);

	        set2.add(1);
	        set2.add(2);
	        set2.add(3);
	        
	        System.out.println(set2.containsAll(set1)); // Output: true
	    }
}
