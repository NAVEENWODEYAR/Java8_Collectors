package com.collectors.lnllst;

import java.util.*;
import java.util.stream.*;

/**
 * @author NaveenWodeyar
 *
 */


class LinkedListFlatten {
    public static LinkedList<Integer> flatten(List<LinkedList<Integer>> listOfLists) {
        return listOfLists.stream()
                          .flatMap(List::stream) // Flatten the list of lists
                          .collect(Collectors.toCollection(LinkedList::new));
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(4, 5));
        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(6, 7));
        
        List<LinkedList<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
        System.out.println("List of Lists: " + listOfLists);
        LinkedList<Integer> flattenedList = flatten(listOfLists);
        System.out.println("Flattened LinkedList: " + flattenedList);
    }
}
