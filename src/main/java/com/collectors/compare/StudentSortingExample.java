package com.collectors.compare;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class StudentSortingExample {
    public static void main(String[] args) {
        List<Students> students = Arrays.asList(
            new Students("John", 20, 85.5),
            new Students("Alice", 19, 92.0),
            new Students("Bob", 21, 92.0),
            new Students("john", 22, 85.5),
            new Students("Eve", 20, 75.0)
        );

        // Sort using Comparable (by name)
        System.out.println("🔤 Natural Order (Comparable - by name):");
        List<Students> sortedByName = students.stream()
            .sorted()
            .collect(Collectors.toList());
        sortedByName.forEach(System.out::println);

        // Sort using Comparator (marks ↓ then age ↑)
        System.out.println("\n🎯 Custom Order (Comparator - by marks, then age):");
        List<Students> sortedByMarks = students.stream()
            .sorted(new StudentMarksComparator())
            .collect(Collectors.toList());
        sortedByMarks.forEach(System.out::println);
    }
}
