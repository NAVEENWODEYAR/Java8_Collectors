package com.collectors.compare;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class StudentSortingExampleTest {

    private List<Students> getSampleStudents() {
        return Arrays.asList(
            new Students("John", 20, 85.5),
            new Students("Alice", 19, 92.0),
            new Students("Bob", 21, 92.0),
            new Students("john", 22, 85.5),
            new Students("Eve", 20, 75.0)
        );
    }

    @Test
    public void testNaturalOrderByName() {
        List<Students> students = getSampleStudents();
        List<String> sortedNames = students.stream()
                .sorted()
                .map(Students::getName)
                .collect(Collectors.toList());

        assertEquals(Arrays.asList("Alice", "Bob", "Eve", "John", "john"), sortedNames);
    }

    @Test
    public void testCustomOrderByMarksThenAge() {
        List<Students> students = getSampleStudents();
        List<String> sorted = students.stream()
                .sorted(new StudentMarksComparator())
                .map(s -> s.getName() + "-" + s.getMarks())
                .collect(Collectors.toList());

        assertEquals("Alice-92.0", sorted.get(0));
        assertEquals("Bob-92.0", sorted.get(1));
        assertEquals("John-85.5", sorted.get(2));
        assertEquals("john-85.5", sorted.get(3));
        assertEquals("Eve-75.0", sorted.get(4));
    }
}

