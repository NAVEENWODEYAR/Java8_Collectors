package com.collectors.str;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 14/06/2024
 */

public class Palindrome {

	static boolean palinndrome(String st) {
		return IntStream.range(0, st.length()/2).anyMatch(s->st.charAt(s)==st.charAt(st.length()-s-1));
	}

	static void palindRome(String st) {
		StringBuilder sb = new StringBuilder(st);
		System.out.println(sb.reverse());
	}
	
	static void palindromeCheck(String input) {
		Boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
	}
	
	public static void main(String[] args) {
		System.out.println(palinndrome("level")?"Palindrome":"Not palindrome");
	}

}
