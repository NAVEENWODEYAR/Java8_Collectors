
package com.collectors.codechallenge;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @apiNote frequency of each character in a string using Java 8 streams
 * @date 29/05/2024
 */
public class CharFrequency {

	static void charFrequency() {
        String str = "Java Concept Of The Day";
        		str.chars().mapToObj(c->(char)c).filter(c->c !=' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::print);
		elementFrequency();
	}
	
	static void elementFrequency() {
        List<String> strList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil","  ","4525234","121 34fsf  ,");
        strList.stream()
        .filter(st -> st.trim().length() > 0 && st.chars().anyMatch(Character::isLetterOrDigit))
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		charFrequency();
	}

}
