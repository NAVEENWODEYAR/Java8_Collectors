package com.collectors.str;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class GroupWordsByLength {
    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "code", "is", "fun", "cool");
        System.out.println(groupByLength(words));
    }
}

