package com.collectors.lnllst;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */

class LinkedListReverseWithStream {
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        return list.stream()
                   .collect(Collectors.collectingAndThen(Collectors.toList(), 
                           lst -> {
                               Collections.reverse(lst);
                               return new LinkedList<>(lst);
                           }));
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original LinkedList: " + list);
        LinkedList<Integer> reversedList = reverseLinkedList(list);
        System.out.println("Reversed LinkedList: " + reversedList);
    }
}
