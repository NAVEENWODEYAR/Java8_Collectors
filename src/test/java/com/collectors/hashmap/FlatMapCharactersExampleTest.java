package com.collectors.hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FlatMapCharactersExampleTest {

    @Test
    public void testGetUniqueCharacters() {
        List<String> words = Arrays.asList("hello", "world", "java");

        List<Character> expected = Arrays.asList('h', 'e', 'l', 'o', 'w', 'r', 'd', 'j', 'a', 'v');
        List<Character> result = FlatMapCharactersExample.getUniqueCharacters(words);

        // Since the order may vary, we sort both lists before comparing
        Collections.sort(expected);
        Collections.sort(result);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyList() {
        List<String> words = Collections.emptyList();
        List<Character> result = FlatMapCharactersExample.getUniqueCharacters(words);
        assertTrue(result.isEmpty(), "Result should be an empty list when input is empty");
    }

    @Test
    public void testSingleWord() {
        List<String> words = Arrays.asList("apple");
        List<Character> expected = Arrays.asList('a', 'p', 'l', 'e');
        List<Character> result = FlatMapCharactersExample.getUniqueCharacters(words);

        Collections.sort(expected);
        Collections.sort(result);

        assertEquals(expected, result);
    }

    @Test
    public void testMultipleIdenticalWords() {
        List<String> words = Arrays.asList("hello", "hello", "hello");
        List<Character> expected = Arrays.asList('h', 'e', 'l', 'o');
        List<Character> result = FlatMapCharactersExample.getUniqueCharacters(words);

        Collections.sort(expected);
        Collections.sort(result);

        assertEquals(expected, result);
    }
}
