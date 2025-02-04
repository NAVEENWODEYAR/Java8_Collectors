package com.collectors.arrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author NaveenWodeyar
 *
 */

public class RemoveDuplicatesInArrayList {
	
	public static void main(String[] args) {
		
		List<String> asList =  Arrays.asList("A","B","C","D","E","A","F","G","A","I","J","A");
		System.out.println("\n####\n");
		System.out.println("Original List "+asList);
		
		Set<String> set = new HashSet<String>(asList);
		System.out.println("After removing duplicates "+set);
	}

}
