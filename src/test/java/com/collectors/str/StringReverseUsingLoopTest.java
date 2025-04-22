package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

class StringReverseUsingLoopTest {

    StringReverseUsingLoop reverser = new StringReverseUsingLoop();

    @Test
    void testNormalString() {
        assertEquals("esrever", reverser.reverseString("reverse"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", reverser.reverseString(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", reverser.reverseString("a"));
    }

    @Test
    void testPalindrome() {
        assertEquals("madam", reverser.reverseString("madam"));
    }

    @Test
    void testWithSpaces() {
        assertEquals("dlroW olleH", reverser.reverseString("Hello World"));
    }

    @Test
    void testWithSpecialCharacters() {
        assertEquals("!@#321", reverser.reverseString("123#@!"));
    }

    @Test
    void testWithNullInput() {
        assertThrows(NullPointerException.class, () -> reverser.reverseString(null));
    }
}
