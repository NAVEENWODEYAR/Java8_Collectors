package com.collectors.coding;

public class StrReverse {

    /**
     * @author Naveen K Wodeyar
     * @date 25-02-2024,
     * Write a Java program to reverse a given string without using any built-in functions,
     */
    
    static String stringReverse(String st) {
	String rev="";
	for(int i=st.length()-1; i>=0; i--) {
	    rev += st.charAt(i);
	}
	return rev;
    }
    public static void main(String[] args) {
	System.out.println("String Reverse");
	System.out.println(stringReverse("System"));
    }
}
