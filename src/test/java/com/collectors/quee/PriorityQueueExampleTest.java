package com.collectors.quee;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

class PriorityQueueExampleTest {

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
	    public void testPriorityQueueOrder() {
	        // Create a priority queue from the example method
	        PriorityQueue<Integer> pQueue = PriorityQueueExample.createPriorityQueue();

	        // Expected order of elements in the priority queue (ascending order)
	        Integer[] expectedOrder = {9, 17, 21, 31, 37, 41, 67};

	        // Poll elements from the priority queue and check if they match expected order
	        for (Integer expected : expectedOrder) {
	            Integer actual = pQueue.poll();
	            assertEquals(expected, actual, "The elements should be in ascending order.");
	        }

	        // After polling all elements, the queue should be empty
	        assertTrue(pQueue.isEmpty(), "PriorityQueue should be empty after polling all elements.");
	    }

}
