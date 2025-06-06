package com.collectors.compare;

import java.util.Comparator;

/**
 * @author NaveenWodeyar
 *
 */

public class StudentMarksComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        // First by marks (descending)
        int markCompare = Double.compare(s2.getMarks(), s1.getMarks());
        if (markCompare != 0) return markCompare;

        // Then by age (ascending)
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
