
package com.collectors.codechallenge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @apiNote find the firstNonRepeating character in string,
 *
 */
public class NonRepeatingCharacter {

	static Character nonRepeatingChar(String st) {
		return st.chars()
		.mapToObj(c-> (char)c)
		.collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(c->c.getValue() ==1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
	}
	
	public static void main(String[] args) {
		System.out.println(nonRepeatingChar("India"));
	}

}
