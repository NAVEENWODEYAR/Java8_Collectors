package com.collectors.pattern;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

public class WordStartWithATest {

    @Test
    public void testWordsStartingWithA() {
        String input = "Apples are amazing and awesome.";
        List<String> expected = List.of("Apples", "are", "amazing", "and", "awesome");
        List<String> actual = WordStartWithA.getWordsStartingWithA(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoMatchingWords() {
        String input = "Bananas taste better than oranges.";
        List<String> actual = WordStartWithA.getWordsStartingWithA(input);
        assertTrue(actual.isEmpty(), "Expected no matching words");
    }

    @Test
    public void testEmptyInput() {
        String input = "";
        List<String> actual = WordStartWithA.getWordsStartingWithA(input);
        assertTrue(actual.isEmpty(), "Expected no words from empty input");
    }

    @Test
    public void testCaseSensitivity() {
        String input = "Alpha beta ALPHA beta";
        List<String> expected = List.of("Alpha", "ALPHA");
        List<String> actual = WordStartWithA.getWordsStartingWithA(input);
        assertEquals(expected, actual);
    }
}
