
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
	public static void main(String[] args) {
		System.out.println(palinndrome("level")?"Palindrome":"Not palindrome");
	}

}
