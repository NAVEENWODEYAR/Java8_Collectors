package com.collectors.str;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */
class PalindromeUsingRecursionTest {

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
	    public void testPalindromeSimple() {
	        assertTrue(PalindromeUsingRecursion.isPalindrome("madam"));
	        assertTrue(PalindromeUsingRecursion.isPalindrome("racecar"));
	    }

	    @Test
	    public void testNotPalindrome() {
	        assertFalse(PalindromeUsingRecursion.isPalindrome("hello"));
	        assertFalse(PalindromeUsingRecursion.isPalindrome("world"));
	    }

	    @Test
	    public void testSingleCharacter() {
	        assertTrue(PalindromeUsingRecursion.isPalindrome("a"));
	    }

	    @Test
	    public void testEmptyString() {
	        assertTrue(PalindromeUsingRecursion.isPalindrome(""));
	    }

	    @Test
	    public void testPalindromeWithSpaces() {
	        assertFalse(PalindromeUsingRecursion.isPalindrome("nurses run"));
	    }

	    @Test
	    public void testPalindromeWithMixedCase() {
	        assertFalse(PalindromeUsingRecursion.isPalindrome("Madam"));
	    }

	    @Test
	    public void testPalindromeWithSpecialCharacters() {
	        assertFalse(PalindromeUsingRecursion.isPalindrome("m@dam"));
	    }

	    @Test
	    public void testNullInput() {
	        assertThrows(NullPointerException.class, () -> {
	            PalindromeUsingRecursion.isPalindrome(null);
	        });
	    }

}
