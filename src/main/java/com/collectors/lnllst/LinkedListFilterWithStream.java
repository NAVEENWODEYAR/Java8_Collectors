package com.collectors.lnllst;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

class LinkedListFilterWithStream {
    public static LinkedList<Integer> filterEvenNumbers(LinkedList<Integer> list) {
        return list.stream()
                   .filter(x -> x % 2 == 0)
                   .collect(Collectors.toCollection(LinkedList::new));
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Original LinkedList: " + list);
        LinkedList<Integer> evenNumbers = filterEvenNumbers(list);
        System.out.println("Filtered Even Numbers: " + evenNumbers);
    }
}
