
package com.collectors.coding;

import java.util.Arrays;
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
	 static String s1 = "RaceCar";
    static String s2 = "CarRace";
    
	 static void anagramTest() {
	   
	    boolean equals = Stream.of(s1.toUpperCase().split("")).sorted().collect(Collectors.joining()).equals(Stream.of(s2.toUpperCase().split("")).sorted().collect(Collectors.joining()));
	    System.out.println(equals?"Anagrams":"Not anagrams");
	    System.out.println("\n%n%s\n "+anagramTest1());
	 }
	 
	 static Boolean anagramTest1() {
		 anagramTest2();
		return s1.length() == s2.length() && s1.chars().map(Character::toLowerCase).sorted().toArray().equals(s2.chars().sorted().toArray());
	 }
	 
	 static Boolean anagramTest2() {
		 return Arrays.equals(Stream.of(s1.toUpperCase()).sorted().toArray(),Stream.of(s2.toUpperCase()).sorted().toArray());
	 }

	
	public static void main(String[] args) {
		anagramTest();
	}

}
