
package com.collectors.coding;

import java.util.stream.Collectors;
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
	    String s1 = "RaceCarq";
	    String s2 = "CarRace";

	    boolean equals = Stream.of(s1.toUpperCase().split("")).sorted().collect(Collectors.joining()).equals(Stream.of(s2.toUpperCase().split("")).sorted().collect(Collectors.joining()));
	    System.out.println(equals?"Anagrams":"Not anagrams");
	 }

	
	public static void main(String[] args) {
		anagramTest();
	}

}
