package com.collectors.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalVsNullCheck {

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }

    static final int NUM_RECORDS = 10_000_000;

    public static void main(String[] args) {
        // Generate test data with some nulls
        List<Person> people = new ArrayList<>(NUM_RECORDS);
        for (int i = 0; i < NUM_RECORDS; i++) {
            people.add(i % 10 == 0 ? null : new Person("Person " + i));  // ~10% nulls
        }

        System.gc(); // Suggest GC to clean up before measuring
        long memoryBefore, memoryAfter, startTime, endTime;

        // --- Traditional Null Check ---
        System.out.println("Starting Traditional Null Check...");
        memoryBefore = getUsedMemory();
        startTime = System.nanoTime();

        long count1 = 0;
        for (Person p : people) {
            if (p != null) {
                String name = p.getName();
                if (name != null && name.startsWith("Person")) {
                    count1++;
                }
            }
        }

        endTime = System.nanoTime();
        memoryAfter = getUsedMemory();
        System.out.println("Traditional Count: " + count1);
        System.out.println("Time (ms): " + (endTime - startTime) / 1_000_000);
        System.out.println("Memory (MB): " + (memoryAfter - memoryBefore) / (1024 * 1024));

        // --- Optional Check ---
        System.out.println("\nStarting Optional Check...");
        System.gc();
        memoryBefore = getUsedMemory();
        startTime = System.nanoTime();

        long count2 = 0;
        for (Person p : people) {
            Optional<Person> optionalPerson = Optional.ofNullable(p);
            count2 += optionalPerson
                .map(Person::getName)
                .filter(name -> name.startsWith("Person"))
                .isPresent() ? 1 : 0;
        }

        endTime = System.nanoTime();
        memoryAfter = getUsedMemory();
        System.out.println("Optional Count: " + count2);
        System.out.println("Time (ms): " + (endTime - startTime) / 1_000_000);
        System.out.println("Memory (MB): " + (memoryAfter - memoryBefore) / (1024 * 1024));
    }

    private static long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}
