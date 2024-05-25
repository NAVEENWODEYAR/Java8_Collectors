
package com.collectors.codechallenge;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * Given a list of integers, separate odd and even numbers?
 *
 */
public class SeperateOddEvenNo {
	
	static void oddEvenExtractor(List<Integer> listOfIntegers) {
		listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0))
        .forEach((isEven, numbers) -> System.out.printf("--------------%n%s Numbers%n--------------%n%s", isEven ? "Even" : "Odd", numbers.stream().map(String::valueOf).collect(Collectors.joining(System.lineSeparator()))));
		
		System.out.println("\n\n");
		listOfIntegers.parallelStream().collect(Collectors.partitioningBy(n -> n%2 ==0)).entrySet().forEach(System.out::println);
	}
	
	static void nthLargestNumber(List<Integer> list) {
		Integer _2ndLargestNo = list.parallelStream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseGet(()->0);
		System.out.println(_2ndLargestNo);
	}

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,9,3,4,5,6,7,8);
		nthLargestNumber(asList);
	}
}
