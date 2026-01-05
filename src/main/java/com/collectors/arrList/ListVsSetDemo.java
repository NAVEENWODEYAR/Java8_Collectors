package com.collectors.arrList;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo {

    public static void main(String[] args) {

        // List example (Allows duplicates, maintains insertion order)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");   // Duplicate allowed
        list.add("Orange");

        // Set example (No duplicates, no guaranteed order)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");   // Duplicate ignored
        set.add("Orange");

        // Output
        System.out.println("List Output:");
        System.out.println(list);

        System.out.println("\nSet Output:");
        System.out.println(set);
    }
}
