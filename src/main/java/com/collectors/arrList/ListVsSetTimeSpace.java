package com.collectors.arrList;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetTimeSpace {

    private static final int ELEMENTS = 100000;

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        // ---------- LIST ----------
        runtime.gc(); // Clear unused memory
        long listMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long listStartTime = System.nanoTime();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }

        long listEndTime = System.nanoTime();
        long listMemoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // ---------- SET ----------
        runtime.gc(); // Clear unused memory
        long setMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long setStartTime = System.nanoTime();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ELEMENTS; i++) {
            set.add(i);
        }

        long setEndTime = System.nanoTime();
        long setMemoryAfter = runtime.totalMemory() - runtime.freeMemory();

        // ---------- RESULTS ----------
        System.out.println("List Time (ns): " + (listEndTime - listStartTime));
        System.out.println("List Memory Used (bytes): " + (listMemoryAfter - listMemoryBefore));

        System.out.println();

        System.out.println("Set Time (ns): " + (setEndTime - setStartTime));
        System.out.println("Set Memory Used (bytes): " + (setMemoryAfter - setMemoryBefore));
    }
    
}
