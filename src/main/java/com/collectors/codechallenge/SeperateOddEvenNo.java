
package com.collectors.codechallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * Given a list of integers, separate odd and even numbers?
 *
 */
public class SeperateOddEvenNo {
	
	static void oddEvenExtractor(List<Integer> list) {
		
		List<Integer> collect = list.stream().filter(n->n/2 ==0).collect(Collectors.toList());
		System.out.println(collect);
		
		
	}

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		oddEvenExtractor(asList);
	}
}
