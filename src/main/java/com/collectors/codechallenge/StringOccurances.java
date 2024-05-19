
package com.collectors.codechallenge;

import java.util.*;

/**
 *@author Naveen K Wodeyar,
 *@date 10-02-2024
 */
public class StringOccurances {
    //find the number of occurrences of an word in an String, using for loop,
    static void stringOccurrence(String st,String s) {
		String str[] = st.toLowerCase().split(" ");
		int count=0;
		for(int i=0; i<str.length; i++) {
		    if(str[i].equalsIgnoreCase(s))
			count = count+1;
		    else
			count = 1;
		}
		System.out.println("String "+st+" occurs,"+count+" times");
    }
    
    // using Collections to find frequency in an string,
    static int strOccurrences(String st,String s) {
    	List<String> wordsList = new ArrayList<String>(Arrays.asList(st.toLowerCase().split(" ")));
    	return Collections.frequency(wordsList, s);
    }
    
    static void strOccurrence17(String st,String s) {
    	long count = Arrays.stream(st.toLowerCase().split("\\s")).filter(word->word.equals(s)).count();
    	System.out.println("\nWord "+s+" occurred "+count+" times!\n");
    }
    
    public static void main(String[] args) {
    	stringOccurrence("Welcome to Java programming,Java is secure & strong","Java");
    	strOccurrence17("This is a test. This test is simple. This is only a test", "test");
    }
}
