package com.collectors.codechallenge;

import java.util.HashMap;

/**
 * @author NaveenWodeyar
 *
 */

public class FirstNonRepeating {

	public static char findFirstNonRepeating(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of characters
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }
        return "-1"; // Return -1 if no non-repeating character is found
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("First non-repeating character: " + findFirstNonRepeating(str));
    }
}
