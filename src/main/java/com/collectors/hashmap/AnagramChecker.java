package com.collectors.hashmap;

import java.util.HashMap;

/**
 * @author NaveenWodeyar
 *
 */

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Increment the count for characters in str1
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Decrement the count for characters in str2
        for (char c : str2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        // Check if all counts are zero
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are anagrams: " + areAnagrams(str1, str2));
    }
}
