package com.collectors.set;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ArrayDuplicates {

	static int[] removeDuplicates(int[] nums) {
	    Set<Integer> set = new HashSet<>();
	    for (int num : nums) {
	        set.add(num);
	    }
	    return set.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public static void main(String[] args) {
		System.out.println("\n####\n");
		System.out.println("HashSet automatically removes duplicates,");
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10,1,2,3,4 };
		int[] removeDuplicates = removeDuplicates(intArray);
		System.out.println("\n Originl Array "+Arrays.toString(intArray));
		System.out.println("\n After removing duplicates "+Arrays.toString(removeDuplicates));

	}
}
