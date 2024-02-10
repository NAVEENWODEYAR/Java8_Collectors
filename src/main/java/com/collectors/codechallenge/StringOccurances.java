
package com.collectors.codechallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *@author Naveen K Wodeyar,
 *@date 10-02-2024 
 */
public class StringOccurances {

//    find the number of occurrences of an word in an String, using for loop,
    static void stringOccurrence(String st,String s) {
	String str[] = st.toLowerCase().split(" ");
	int count=0;
//	System.out.println(Arrays.toString(str));
	for(int i=0; i<str.length; i++) {
	    if(str[i].equalsIgnoreCase(s))
		count = count+1;
	    else
		count = 1;
	}
	System.out.println("String "+st+" occurs,"+count+" times");
    }
    
//    using Collections,
    static int strOccurrences(String st,String s) {
	List<String> wordsList = new ArrayList(Arrays.asList(st.toLowerCase().split(" ")));
	return Collections.frequency(wordsList, s);
    }
    
    public static void main(String[] args) {
	stringOccurrence("Welcome to Java programming,Java is secure & strong","Java");
    }
}
