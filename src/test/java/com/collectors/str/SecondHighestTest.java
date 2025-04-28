package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

class SecondHighestTest {

    @Test
    void testSecondHighest_NormalCase() {
        List<Integer> input = Arrays.asList(5, 3, 9, 1, 5, 7, 9);
        assertEquals(7, SecondHighest.secondHighest(input).orElseThrow());
    }

    @Test
    void testSecondHighest_WithDuplicatesOnly() {
        List<Integer> input = Arrays.asList(2, 2, 2);
        assertTrue(SecondHighest.secondHighest(input).isEmpty());
    }

    @Test
    void testSecondHighest_SingleElement() {
        List<Integer> input = Collections.singletonList(42);
        assertTrue(SecondHighest.secondHighest(input).isEmpty());
    }

    @Test
    void testSecondHighest_EmptyList() {
        assertTrue(SecondHighest.secondHighest(Collections.emptyList()).isEmpty());
    }
}
