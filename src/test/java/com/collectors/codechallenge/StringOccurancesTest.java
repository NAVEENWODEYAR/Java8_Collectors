package com.collectors.codechallenge;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StringOccurancesTest {

    @Test
    void testStrOccurrencesWithCollections() {
        String input = "apple banana apple orange banana apple";
        int result = StringOccurances.strOccurrences(input, "apple");
        assertEquals(3, result);

        result = StringOccurances.strOccurrences(input, "banana");
        assertEquals(2, result);

        result = StringOccurances.strOccurrences(input, "grape");
        assertEquals(0, result);
    }

    @Test
    void testStringOccurrenceWithPrintOutput() {
        // Capture system output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        StringOccurances.stringOccurrence("hello world hello", "hello");

        String expected = "String hello world hello occurs,2 times";
        assertTrue(output.toString().trim().contains(expected));

        // Reset System.out
        System.setOut(System.out);
    }

    @Test
    void testStrOccurrence17WithStream() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        StringOccurances.strOccurrence17("java java python java c++", "java");

        assertTrue(output.toString().contains("Word java occurred 3 times"));

        System.setOut(System.out);
    }
}
