/**
 * 
 */
package com.collectors.ternary;

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
class MultipleConditionsTest {

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
	
	 // Test cases to check different conditions for numbers
    @Test
    void testCheckNumber() {
        assertEquals("Positive Even", MultipleConditions.checkNumber(4)); // Positive even number
        assertEquals("Positive Odd", MultipleConditions.checkNumber(5));  // Positive odd number
        assertEquals("Negative Even", MultipleConditions.checkNumber(-6)); // Negative even number
        assertEquals("Negative Odd", MultipleConditions.checkNumber(-7));  // Negative odd number
        assertEquals("Zero", MultipleConditions.checkNumber(0));           // Zero
    }

}
