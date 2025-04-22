package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */

public class StringReverseUsingLoop {

	public String reverseString(String str) {
	    char[] chars = str.toCharArray();
	    for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }
	    return new String(chars);
	}

	public static void main(String[] args) {
		StringReverseUsingLoop stringReverseUsingLoop = new StringReverseUsingLoop();
		String st = "reverse";
		String reverseString = stringReverseUsingLoop.reverseString(st);
		System.out.println("\nOriginal string: {}"+st+"\nReversed string: {}"+reverseString);
	}
}
