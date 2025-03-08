package com.collectors.series;

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

class FiboSeriesTest {

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
	    void testFiboSeriesFirstFewNumbers() {
	        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34}; // The first 10 Fibonacci numbers
	        int n = 10;
	        
	        // Capture the output of the method
	        StringBuilder output = new StringBuilder();
	        FiboSeries.fibSeries(n);
	        
	        // Compare output with the expected result
	        String[] outputValues = output.toString().split(", ");
	        for (int i = 0; i < n; i++) {
	            assertEquals(expected[i], Integer.parseInt(outputValues[i].trim()));
	        }
	    }

	    // Test if the method handles small n correctly (n = 1)
	    @Test
	    void testFiboSeriesWithN1() {
	        int[] expected = {0};
	        int n = 1;
	        
	        StringBuilder output = new StringBuilder();
	        FiboSeries.fibSeries(n);
	        
	        String[] outputValues = output.toString().split(", ");
	        assertEquals(expected[0], Integer.parseInt(outputValues[0].trim()));
	    }

	    // Test if the method handles n = 0 correctly (should output nothing)
	    @Test
	    void testFiboSeriesWithN0() {
	        int n = 0;
	        
	        StringBuilder output = new StringBuilder();
	        FiboSeries.fibSeries(n);
	        
	        assertTrue(output.toString().isEmpty());
	    }

	    // Test to ensure the function throws an exception for negative n
	    @Test
	    void testFiboSeriesWithNegativeN() {
	        int n = -5;
	        
	        try {
	            FiboSeries.fibSeries(n);
	            fail("The method should throw an exception for negative values of n");
	        } catch (IllegalArgumentException e) {
	            assertEquals("n must be a non-negative integer", e.getMessage());
	        }
	    }

}
