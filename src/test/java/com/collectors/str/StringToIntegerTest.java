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

class StringToIntegerTest {

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
	    void testValidPositiveInteger() {
	        assertEquals(42, StringToInteger.myAtoi("42"));
	    }

	    @Test
	    void testValidNegativeInteger() {
	        assertEquals(-42, StringToInteger.myAtoi("-42"));
	    }

	    @Test
	    void testIntegerWithLeadingSpaces() {
	        assertEquals(42, StringToInteger.myAtoi("   42"));
	    }

	    @Test
	    void testIntegerWithTrailingSpaces() {
	        assertEquals(42, StringToInteger.myAtoi("42   "));
	    }

	    @Test
	    void testInvalidInputWithNonDigits() {
	        assertEquals(0, StringToInteger.myAtoi("42abc"));
	    }

	    @Test
	    void testInputWithOnlySpaces() {
	        assertEquals(0, StringToInteger.myAtoi("   "));
	    }

	    @Test
	    void testInputWithEmptyString() {
	        assertEquals(0, StringToInteger.myAtoi(""));
	    }

	    @Test
	    void testInputWithPlusSign() {
	        assertEquals(42, StringToInteger.myAtoi("+42"));
	    }

	    @Test
	    void testLargeNumber() {
	        assertEquals(2147483647, StringToInteger.myAtoi("2147483647"));
	    }

	    @Test
	    void testLargeNegativeNumber() {
	        assertEquals(-2147483648, StringToInteger.myAtoi("-2147483648"));
	    }

	    @Test
	    void testNumberOverflow() {
	        assertEquals(2147483647, StringToInteger.myAtoi("2147483648"));
	    }

	    @Test
	    void testNumberUnderflow() {
	        assertEquals(-2147483648, StringToInteger.myAtoi("-2147483649"));
	    }

}
