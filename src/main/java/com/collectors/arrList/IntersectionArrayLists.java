package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class IntersectionArrayLists {
	public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);
        Collections.addAll(list2, 4, 5, 6, 7);

        HashSet<Integer> set = new HashSet<>(list1);
        set.retainAll(list2);  
        System.out.println("Intersection: " + set);
    }
}
