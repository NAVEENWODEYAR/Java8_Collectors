package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class PalindromeArrayList {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 2, 1);

        boolean isPalindrome = true;
        for (int i = 0; i < list.size() / 2; i++) {
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
