package com.collectors.str;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class CustomSortStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "dog", "banana", "cat");

        list.sort(Comparator
            .comparingInt(String::length).reversed()
            .thenComparing(Comparator.naturalOrder()));

        System.out.println("Sorted List: " + list);
    }
}
