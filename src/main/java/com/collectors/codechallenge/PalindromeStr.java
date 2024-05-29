
package com.collectors.codechallenge;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 29/05/2024
 *  @apiNote 
 */
public class PalindromeStr {

	static void palindromeCheck(String st) {
		boolean allMatch = IntStream.range(0, st.length()/2).allMatch(s->Character.toLowerCase(st.charAt(s)) == Character.toLowerCase(st.charAt(st.length()-s-1)));
		System.out.println(allMatch?"Palindrome":"Not Palindrome");

	}
	public static void main(String[] args) {
		palindromeCheck("raceCar");
		
	}
}
