
package com.collectors.codechallenge;

/**
 *@author Naveen K Wodeyar,
 *@date 10-02-2024 
 */
public class StringOccurances {
    /**
     * find the number of occurrences of an word in an String,
     */
    public void stringOccurrence(String st) {
	String str[] = st.toLowerCase().split("");
	int count=0;
	for(int i=0; i<=str.length; i++) {
	    if(str[i].equalsIgnoreCase(st))
		count++;
	}
	System.out.println("String "+st+" occurs,"+count+" times");
    }
    public static void main(String[] args) {

    }
}
