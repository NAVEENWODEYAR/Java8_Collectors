package com.collectors.hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramCheckerTest {

	@Test
	public void testAnagrams() {
		// Test when the strings are anagrams
		assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
		assertTrue(AnagramChecker.areAnagrams("triangle", "integral"));
		assertTrue(AnagramChecker.areAnagrams("evil", "vile"));
	}

	@Test
	public void testNotAnagrams() {
		// Test when the strings are not anagrams
		assertFalse(AnagramChecker.areAnagrams("hello", "world"));
		assertFalse(AnagramChecker.areAnagrams("java", "python"));
		assertFalse(AnagramChecker.areAnagrams("apple", "pale"));
	}

	@Test
	public void testDifferentLengths() {
		// Test when the strings have different lengths
		assertFalse(AnagramChecker.areAnagrams("abc", "ab"));
		assertFalse(AnagramChecker.areAnagrams("hello", "helloo"));
	}

	@Test
	public void testEmptyStrings() {
		// Test when both strings are empty
		assertTrue(AnagramChecker.areAnagrams("", ""));
	}

	@Test
	public void testNullInputs() {
		// Test when one or both strings are null
		assertFalse(AnagramChecker.areAnagrams(null, "test"));
		assertFalse(AnagramChecker.areAnagrams("test", null));
		assertFalse(AnagramChecker.areAnagrams(null, null));
	}
}
