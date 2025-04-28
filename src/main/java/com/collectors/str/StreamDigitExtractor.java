package com.collectors.str;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

public class StreamDigitExtractor {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a1b2c3", "123abc", "xyz789");
        long result = extractDigitsAsNumber(input);
        System.out.println(result); // Output: 112233789
    }

    public static long extractDigitsAsNumber(List<String> input) {
        String digitString = input.stream()
            .flatMap(str -> str.chars().mapToObj(c -> (char) c))
            .filter(Character::isDigit)
            .map(String::valueOf)
            .collect(Collectors.joining());

        return Long.parseLong(digitString);
    }
}

