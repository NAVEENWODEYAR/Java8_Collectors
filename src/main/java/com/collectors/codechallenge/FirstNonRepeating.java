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
        
        // Return null character (indicating no non-repeating character found)
        return '\0'; // '\0' is a char and indicates no result
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char result = findFirstNonRepeating(str);
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
