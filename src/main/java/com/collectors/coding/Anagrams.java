
package com.collectors.coding;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 30/05/3034
 * @apiNote 
 * {@link #Anagrams()}
 *
 */
public class Anagrams {

	 static void anagramTest() {
	    String s1 = "RaceCar";
	    String s2 = "CarRace";

	    System.out.println(Stream.of(s1, s2)
	        .map(s -> Stream.of(s.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining()))
	        .distinct()
	        .count() == 1 ? "Two strings are anagrams" : "Two strings are not anagrams");
	}

	
	public static void main(String[] args) {
		anagramTest();
	}

}
