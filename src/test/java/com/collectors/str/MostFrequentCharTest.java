package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

class MostFrequentCharTest {

    @Test
    void testMostFrequentChar_NormalCase() {
        assertEquals('s', MostFrequentChar.mostFrequentChar("stream stress test"));
    }

    @Test
    void testMostFrequentChar_MixedCase() {
        assertEquals('a', MostFrequentChar.mostFrequentChar("A banana"));
    }

    @Test
    void testMostFrequentChar_SingleChar() {
        assertEquals('x', MostFrequentChar.mostFrequentChar("x"));
    }

    @Test
    void testMostFrequentChar_EmptyString() {
        assertThrows(NoSuchElementException.class, () ->
            MostFrequentChar.mostFrequentChar(""));
    }
}
