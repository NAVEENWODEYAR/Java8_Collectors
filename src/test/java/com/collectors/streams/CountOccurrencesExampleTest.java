package com.collectors.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */
class CountOccurrencesExampleTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    void testWordCounts() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Map<String, Long> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("apple", 2L);
        expectedWordCounts.put("banana", 3L);
        expectedWordCounts.put("orange", 1L);

        Map<String, Long> wordCounts = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        assertEquals(expectedWordCounts, wordCounts, "The word counts should match the expected values.");
    }

    @Test
    void testEmptyList() {
        List<String> words = new ArrayList<>();
        
        Map<String, Long> wordCounts = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        
        assertTrue(wordCounts.isEmpty(), "The word count map should be empty for an empty list.");
    }

    @Test
    void testSingleWord() {
        List<String> words = Arrays.asList("apple");
        
        Map<String, Long> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("apple", 1L);

        Map<String, Long> wordCounts = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        assertEquals(expectedWordCounts, wordCounts, "The word count for a single word should be correct.");
    }

    @Test
    void testMultipleOccurrencesOfSingleWord() {
        List<String> words = Arrays.asList("apple", "apple", "apple");

        Map<String, Long> expectedWordCounts = new HashMap<>();
        expectedWordCounts.put("apple", 3L);

        Map<String, Long> wordCounts = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        assertEquals(expectedWordCounts, wordCounts, "The word count should be correct for multiple occurrences of a word.");
    }

}
