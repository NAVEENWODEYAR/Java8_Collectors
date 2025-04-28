package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

class GroupWordsByLengthTest {

    @Test
    void testGroupByLength_MixedLengths() {
        List<String> input = Arrays.asList("java", "code", "is", "fun", "cool");
        Map<Integer, List<String>> result = GroupWordsByLength.groupByLength(input);

        assertEquals(Arrays.asList("is"), result.get(2));
        assertEquals(Arrays.asList("fun"), result.get(3));
        assertTrue(result.get(4).containsAll(Arrays.asList("java", "code", "cool")));
    }

    @Test
    void testGroupByLength_EmptyList() {
        assertTrue(GroupWordsByLength.groupByLength(Collections.emptyList()).isEmpty());
    }

    @Test
    void testGroupByLength_SameLengthWords() {
        List<String> input = Arrays.asList("go", "hi", "to");
        Map<Integer, List<String>> result = GroupWordsByLength.groupByLength(input);
        assertEquals(1, result.size());
        assertEquals(3, result.get(2).size());
    }
}

