package com.collectors.streams;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class LongestStringExample {

	 public static void main(String[] args) {
	        List<String> words = Arrays.asList("apple", "banana", "cherry", "kiwi", "mango");
	        
	        Optional<String> longestWord = words.stream()
	                                           .max(Comparator.comparingInt(String::length));
	        longestWord.ifPresent(word -> System.out.println("Longest word: " + word));
	    }
}
