package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */
public class ReverseWordsWithoutFunctions {
	    public static void main(String[] args) {
	        String input = "Hello Java World";
	        StringBuilder sb = new StringBuilder();
	        int end = input.length();

	        for (int i = input.length() - 1; i >= 0; i--) {
	            if (input.charAt(i) == ' ' || i == 0) {
	                sb.append(input.substring(i == 0 ? i : i + 1, end)).append(" ");
	                end = i;
	            }
	        }
	        System.out.println(sb.toString().trim()); // olleH avaJ dlroW
	    }
	}

