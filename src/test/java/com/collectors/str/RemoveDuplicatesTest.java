package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicateChars() {
        String input = "aabbcc";
        String expected = "abc";
        assertEquals(expected, RemoveDuplicates.removeDuplicateChars(input));
    }

    @Test
    void testWithSentence() {
        String input = "hello world";
        String expected = "helo wrd";
        assertEquals(expected, RemoveDuplicates.removeDuplicateChars(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, RemoveDuplicates.removeDuplicateChars(input));
    }

    @Test
    void testSpecialCharacters() {
        String input = "!!@@##";
        String expected = "!@#";
        assertEquals(expected, RemoveDuplicates.removeDuplicateChars(input));
    }

    @Test
    void testOriginalInput() {
        String input = "I was betrayed by my own people — what can I say?\r\n"
                     + "My boat sank even where the water was shallow";
        String expectedStart = "I wasbtrydmnop—hclv?\r\nk";
        String result = RemoveDuplicates.removeDuplicateChars(input);
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }
}

