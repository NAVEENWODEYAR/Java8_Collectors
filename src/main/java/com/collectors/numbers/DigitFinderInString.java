 package com.collectors.numbers;

import java.util.*;
/**
 * @author Naveen K Wodeyar
 * @date 01/06/2024
 * @apiNote,find out those strings which start with a number in the list/array,
 */
public class DigitFinderInString {
	static List<String> strList = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

	static void isDigit() {
		strList.stream().filter(st->Character.isDigit(st.charAt(0))).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		isDigit();
	}

}
