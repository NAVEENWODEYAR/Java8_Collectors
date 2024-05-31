
package com.collectors.numbers;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 31/05/2024
 * @apiNote,find sum of first 10 natural numbers,
 */
public class SumOfNumbers {

	private static int sum;

	static Integer sumOfNaturalNos() {
		return IntStream.range(0, 10).sum();
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfNaturalNos());
	}

}
