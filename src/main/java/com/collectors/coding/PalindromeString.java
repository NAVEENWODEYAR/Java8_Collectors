
package com.collectors.coding;

import java.util.*;
import java.util.stream.*;

public class PalindromeString {
	static boolean isPalindrome(String st) {
		
		st.toLowerCase();
		int left = 0;
		int right = st.length() - 1;
		while (left < right) {
			if (st.charAt(left) != st.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	static Boolean isPalindromeStr(String st) {
		return IntStream.range(0, st.length()/2).noneMatch(s->st.charAt(s) != st.charAt(st.length()-1));
	}

	static Boolean isPalindromeString(String st) {
		isPalindrome(st);
		return IntStream.range(0, st.length()/2).allMatch(s->Character.toLowerCase(st.charAt(s)) == Character.toLowerCase(st.charAt(st.length()-s-1)));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("\nEnter an string:");
			String st = sc.next();
			if (isPalindrome(st))
				System.out.println("Palindrome");
			else
				System.out.println("Not an Palindrome");
		}catch (Exception e) {
			e.getCause();
		}finally {
			sc.close();
		}
	}
}
