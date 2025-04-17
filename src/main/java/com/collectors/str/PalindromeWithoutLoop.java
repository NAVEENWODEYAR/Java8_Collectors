package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */

public class PalindromeWithoutLoop {
	static String check(String s) {
        long startTime = System.nanoTime();

        boolean isPalindrome = new StringBuilder(s).reverse().toString().equals(s);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Time taken (ns): " + duration);
        return isPalindrome ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println("Is 'madam' a palindrome? " + check("madam"));
        System.out.println("Is 'chatgpt' a palindrome? " + check("chatgpt"));
    }
}
