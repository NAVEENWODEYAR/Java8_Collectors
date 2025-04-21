package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

public class SubstringMatchTest {

	@Test
	public void testContainsString_found() {
		assertTrue(SubstringMatch.containsString("Two"), "Expected to find 'Two' as substring.");
	}

	@Test
	public void testContainsString_notFound() {
		assertFalse(SubstringMatch.containsString("Five"), "Expected not to find 'Five'.");
	}

	@Test
	public void testContainsStringJava8_found() {
		assertTrue(SubstringMatch.containsStringJava8("Four"), "Expected to find 'Four' as substring.");
	}

	@Test
	public void testContainsStringJava8_notFound() {
		assertFalse(SubstringMatch.containsStringJava8("Six"), "Expected not to find 'Six'.");
	}

	// Optional: Benchmark Test (not a unit test, just prints time/memory)
	@Test
	public void benchmarkBothMethods() {
		System.out.println("\n--- Benchmark Output ---");
		SubstringMatch.containsString("Two");
		SubstringMatch.containsStringJava8("Two");
	}
}
