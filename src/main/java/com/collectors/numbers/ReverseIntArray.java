
package com.collectors.numbers;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 31/05/2024
 * @apiNote ,Reverse an integer array
 */
public class ReverseIntArray {

	static  int[] array = new int[] {5, 1, 7, 3, 9, 6};

	static void reverArray() {
		int[] array2 = IntStream.rangeClosed(1, array.length).map(i->array[array.length-i]).toArray();
		System.out.println(Arrays.toString(array)+" "+Arrays.toString(array2));
	}
	
	public static void main(String[] args) {
		reverArray();
	}

}
