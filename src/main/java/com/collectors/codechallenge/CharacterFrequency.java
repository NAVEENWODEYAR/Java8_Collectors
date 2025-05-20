package com.collectors.codechallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * Java 7 version: Find frequency of each character in a string using loops.
 */

public class CharacterFrequency {

    static void characterFreq(String st) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Print the frequency of each character
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
    
    static void characterFreqJava8(String st) {
		st.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
	}

    public static void main(String[] args) {
        characterFreq("String");
    }
}
