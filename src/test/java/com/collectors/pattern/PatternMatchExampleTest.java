package com.collectors.pattern;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

public class PatternMatchExampleTest {

    @Test
    public void testPatternFound() {
        String input = "I love Java programming!";
        String pattern = "Java";
        assertTrue(PatternMatchExample.isPatternFound(input, pattern), "Pattern should be found.");
    }

    @Test
    public void testPatternNotFound() {
        String input = "I love Python programming!";
        String pattern = "Java";
        assertFalse(PatternMatchExample.isPatternFound(input, pattern), "Pattern should not be found.");
    }

    @Test
    public void testEmptyPattern() {
        String input = "I love Java";
        String pattern = "";
        assertTrue(PatternMatchExample.isPatternFound(input, pattern), "Empty pattern should always match.");
    }

    @Test
    public void testEmptyInput() {
        String input = "";
        String pattern = "Java";
        assertFalse(PatternMatchExample.isPatternFound(input, pattern), "Pattern should not match empty input.");
    }
}

