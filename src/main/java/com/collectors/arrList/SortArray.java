
package com.collectors.arrList;

import java.util.Arrays;

/**
 * @author Naveen K Wodeyar
 * @date 14/06/2024
 * @apiNote 
 *
 */
public class SortArray {

	static int[] arr = {1,3,2,6,5,4,9};
	
	static void sortArray() {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		sortArray();
	}

}
 