package com.collectors.coding;

/**
 * @author Naveen K Wodeyar
 * @date 25-02-2024,
 * Write a Java program to reverse a given string without using any built-in functions,
 */

public class StrReverse {
    static String stringReverse(String st) {
	String rev="";
	for(int i=st.length()-1; i>=0; i--) {
	    rev += st.charAt(i);
		}
	stringreverseUsingStrBuilder(st);
	return rev;
    }
    
    static void stringreverseUsingStrBuilder(String st) {
    	StringBuilder sb = new StringBuilder(st);
    	System.out.println("Original string:"+st+"-Reverse string:"+sb.reverse());
    }
    
    public static void main(String[] args) {
	System.out.println("\nString Reverse\n");
	System.out.println(stringReverse("System"));
    }
}
