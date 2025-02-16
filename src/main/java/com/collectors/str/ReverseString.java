package com.collectors.str;

/**
 * @author NaveenWodeyar
 * Reverse a String Without Using Recursion or In-built Functions
 */

public class ReverseString {

	public static void main(String[] args) {
        String input = "HelloWorld";
        char[] strArray = input.toCharArray();
        int left = 0, right = strArray.length - 1;

        while (left < right) {
            // Swap the characters
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;

            // Move the pointers towards the middle
            left++;
            right--;
        }

        String reversedString = new String(strArray);
        System.out.println("Reversed String: " + reversedString);
    }
}
