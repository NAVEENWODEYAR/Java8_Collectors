package com.collectors.str;

import java.util.HashMap;

/**
 * @author NaveenWodeyar
 *
 */

public class FirstNonRepeatingString {
	public static char firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        
        return '\0'; // No non-repeating character
    }

    public static void main(String[] args) {
        String s = "swiss";
        System.out.println(firstNonRepeating(s)); // Output: w
    }
}
