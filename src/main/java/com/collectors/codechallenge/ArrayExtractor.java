
package com.collectors.codechallenge;

import java.util.Arrays;

/**
 * @author Naveen K WOdeyar
 * @date 12/06/2024
 * @apiNote, 
 *
 */
public class ArrayExtractor {

	static void arraySeperator(int[] arr) {
		int[] array = Arrays.stream(arr).boxed().sorted().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(array));
	}
	
	public static void main(String[] args) {
		int [] arr = {0,1,1,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,1};
		arraySeperator(arr);
	}

}
 