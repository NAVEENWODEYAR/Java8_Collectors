package com.collectors.str;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class RepeatedCharacterCount {
    public static void main(String[] args) {
        String input = "Hame tu aponene loota gere mo kaha,\r\n"
        		+ "dum ta meri kashti be doobi waha jaha pani kam ta";

        // Using streams to count occurrences of characters
        Map<Character, Long> charCountMap = input.chars()
                .mapToObj(c -> (char) c) // Convert int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Group by character and count occurrences

        // Print characters that have more than 1 occurrence
        System.out.println("Repeated characters:");
        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filter for repeated characters
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
