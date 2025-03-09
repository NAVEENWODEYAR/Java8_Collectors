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
class LargestOfThreeTest {

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
	
	 // Method to test the logic of finding the largest of three numbers
    @Test
    void testLargestOfThree() {
        // Test cases
        assertEquals(20, LargestOfThree.findLargest(10, 20, 15)); // b is largest
        assertEquals(30, LargestOfThree.findLargest(30, 20, 10)); // a is largest
        assertEquals(25, LargestOfThree.findLargest(10, 20, 25)); // c is largest
        assertEquals(100, LargestOfThree.findLargest(100, 100, 100)); // All are the same
    }

}
