package com.collectors.lnllst;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

class LinkedListToString {
    public static String convertToString(LinkedList<Integer> list) {
        return list.stream()
                   .map(String::valueOf) // Convert integers to strings
                   .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + list);
        String result = convertToString(list);
        System.out.println("LinkedList as String: " + result);
    }
}

