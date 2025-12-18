package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println(original == reverse ? "Palindrome" : "Not a Palindrome");
    }
    
}
