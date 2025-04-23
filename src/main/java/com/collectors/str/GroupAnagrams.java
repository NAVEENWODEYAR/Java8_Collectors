package com.collectors.str;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art"};
        Map<String, List<String>> grouped = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            grouped.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        System.out.println("Grouped Anagrams: " + new ArrayList<>(grouped.values()));
    }
}

