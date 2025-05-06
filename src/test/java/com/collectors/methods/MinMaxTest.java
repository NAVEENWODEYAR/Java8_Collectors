package com.collectors.methods;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author NaveenWodeyar
 *
 */

public class MinMaxTest {

    @Test
    public void testMaxLengthAndSortedDistinctList() {
        List<String> stationeryList = Arrays.asList(
            "Pen", "Eraser", "Note Book", "Pen",
            "Pencil", "Stapler", "Note Book", "Pencil"
        );

        // Find the max length item
        String max = stationeryList.stream()
            .max(Comparator.comparing(String::length))
            .orElse(null);

        // Sort and distinct by length
        Object[] sortedDistinctArray = stationeryList.parallelStream()
            .sorted(Comparator.comparing(String::length))
            .distinct()
            .toArray();

        // Assert max
        assertThat(max).isEqualTo("Note Book");

        // Expected distinct sorted by length
        List<String> expectedSortedDistinct = List.of("Pen", "Eraser", "Pencil", "Stapler", "Note Book");

        // Cast to List<String> for comparison
        List<String> actual = Arrays.stream(sortedDistinctArray)
            .map(Object::toString)
            .collect(Collectors.toList());

        assertThat(actual).containsExactlyElementsOf(expectedSortedDistinct);
    }
}

