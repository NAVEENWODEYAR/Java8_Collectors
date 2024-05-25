
package com.collectors.codechallenge;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * How do you find frequency of each character in a string using Java 8 streams?
 */
public class CharacterFrequency {
	
	static void characterFreq(String st) {
		st.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}

	public static void main(String[] args) {
		characterFreq("String");
	}
}
