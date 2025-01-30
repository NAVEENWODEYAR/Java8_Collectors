package com.collectors.arrList;

/**
 * @author Naveen K Wodeyar
 * @date 14/06/2024
 * @apiNote sorting an array
 *
 */
import java.util.Arrays;

public class SortArray {

	static int[] arr = {1,3,2,6,5,4,9,8};
	
 // Using Arrays.sort
	static void sortArray() {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
// Using for-loop,
	static void sortArrayUsingLoop(int[] intArray) {
		int[] sortedArray = {};
		for(int i=0; i<=intArray.length-1; i++) {
			if(intArray[i] < intArray[i]-1) {
				sortedArray = intArray;
			}
		}
	System.out.println("####$$$$");	System.out.println(Arrays.toString(sortedArray));
	System.out.println("####$$$$");
	}
	
	public static void main(String[] args) {
		sortArray();
		sortArrayUsingLoop(arr);
	}

}
 