package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

class StreamDigitExtractorTest {

    @Test
    void testMixedAlphaNumericStrings() {
        List<String> input = Arrays.asList("a1b2c3", "123abc", "xyz789");
        long expected = 112233789L;
        assertEquals(expected, StreamDigitExtractor.extractDigitsAsNumber(input));
    }

    @Test
    void testOnlyDigits() {
        List<String> input = Arrays.asList("123", "456", "789");
        long expected = 123456789L;
        assertEquals(expected, StreamDigitExtractor.extractDigitsAsNumber(input));
    }

    @Test
    void testNoDigits() {
        List<String> input = Arrays.asList("abc", "xyz", "def");
        assertThrows(NumberFormatException.class, () -> {
            StreamDigitExtractor.extractDigitsAsNumber(input);
        });
    }

    @Test
    void testEmptyList() {
        List<String> input = Collections.emptyList();
        assertThrows(NumberFormatException.class, () -> {
            StreamDigitExtractor.extractDigitsAsNumber(input);
        });
    }

    @Test
    void testSingleString() {
        List<String> input = Arrays.asList("9a8b7");
        long expected = 987L;
        assertEquals(expected, StreamDigitExtractor.extractDigitsAsNumber(input));
    }
}

