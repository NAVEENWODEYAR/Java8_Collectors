package com.collectors.arrList;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */
class EvenNumbersTest {

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
    public void testGetEvenNumbers() {
        // Define test cases
        int start = 1;
        int end = 20;
        
        // Call the method
        List<Integer> result = EvenNumbers.getEvenNumbers(start, end);
        
        // Assert the result
        assertNotNull(result);
        assertEquals(10, result.size());  // There should be 10 even numbers between 1 and 20
        
        // Check if the list contains the correct even numbers
        assertTrue(result.contains(2));
        assertTrue(result.contains(4));
        assertTrue(result.contains(6));
        assertTrue(result.contains(8));
        assertTrue(result.contains(10));
        assertTrue(result.contains(12));
        assertTrue(result.contains(14));
        assertTrue(result.contains(16));
        assertTrue(result.contains(18));
        assertTrue(result.contains(20));
        
        // Ensure the list does not contain any odd numbers
        assertFalse(result.contains(1));
        assertFalse(result.contains(3));
        assertFalse(result.contains(5));
    }

    @Test
    public void testGetEvenNumbersWithNoEvenNumbers() {
        // Test a range where there are no even numbers (e.g., 1 to 1)
        int start = 1;
        int end = 1;
        
        List<Integer> result = EvenNumbers.getEvenNumbers(start, end);
        
        // Assert the result is an empty list
        assertNotNull(result);
        assertEquals(0, result.size());
    }
    
    @Test
    public void testGetEvenNumbersWithNegativeRange() {
        // Test with a negative range
        int start = -10;
        int end = 10;
        
        List<Integer> result = EvenNumbers.getEvenNumbers(start, end);
        
        // Assert the result
        assertNotNull(result);
        assertEquals(11, result.size());  // From -10 to 10, inclusive, there are 11 even numbers
        
        // Check if the list contains the correct even numbers
        assertTrue(result.contains(-10));
        assertTrue(result.contains(-8));
        assertTrue(result.contains(-6));
        assertTrue(result.contains(-4));
        assertTrue(result.contains(-2));
        assertTrue(result.contains(0));
        assertTrue(result.contains(2));
        assertTrue(result.contains(4));
        assertTrue(result.contains(6));
        assertTrue(result.contains(8));
        assertTrue(result.contains(10));
    }

}
