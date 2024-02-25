
package com.collectors.coding;

import java.util.Scanner;

public class PalindromeString {

    private static boolean palindrome;

     // Palindrome using length,
    static boolean isPalindrome(String st) {
	st.toLowerCase();
	int left = 0;
	int right = st.length()-1;
	while(left<right) {
	    if(st.charAt(left)!=st.charAt(right)) {
		return false;
	    }
	    left++;
	    right--;
	}
	return true;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String st = sc.next();
	if(isPalindrome(st))
	    System.out.println("Palindrome");
	else
	    System.out.println("Not an Palindrome");
    }

}
