package com.collectors.codechallenge;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class FirstNonRepeating {
	public static char firstNonRepeatingCharacter(String str) {
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> charCountMap.get(c) == 1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No non-repeating character found"));
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingCharacter(input);
        System.out.println("First non-repeating character: " + result);
    }
}
