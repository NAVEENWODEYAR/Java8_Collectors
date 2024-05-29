
package com.collectors.codechallenge;

import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @apiNote frequency of each character in a string using Java 8 streams
 * @date 29/05/2024
 */
public class CharFrequency {

	static void charFrequency() {
        String str = "Java Concept Of The Day";
        		str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);

	}
	
	public static void main(String[] args) {
		charFrequency();
	}

}
