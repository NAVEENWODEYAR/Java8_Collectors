package com.collectors.arrList;

import java.util.ArrayList;

/**
 * @author NaveenWodeyar
 *
 */

public class ArrayListTimeComplexity {

    public static void main(String[] args) {

        int size = 200000;
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements at end → O(1) amortized
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Add at end time: " + (end - start) + " ns");

        // Access element → O(1)
        start = System.nanoTime();
        int value = list.get(size / 2);
        end = System.nanoTime();
        System.out.println("Access (get) time: " + (end - start) + " ns");

        // Add at beginning → O(n)
        start = System.nanoTime();
        list.add(0, -1);
        end = System.nanoTime();
        System.out.println("Add at beginning time: " + (end - start) + " ns");

        // Remove from beginning → O(n)
        start = System.nanoTime();
        list.remove(0);
        end = System.nanoTime();
        System.out.println("Remove from beginning time: " + (end - start) + " ns");

        // Search element → O(n)
        start = System.nanoTime();
        boolean found = list.contains(size - 1);
        end = System.nanoTime();
        System.out.println("Search (contains) time: " + (end - start) + " ns");
    }
    
}
