package com.collectors.arrList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */
class KthLargestElementArrayListTest {

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
    public void testKthLargestElement() {
        // Create the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 7, 10, 4, 3, 20, 15);

        // Define k for the test
        int k = 4;

        // Sort the list in reverse order and retrieve the k-th largest element
        Collections.sort(list, Collections.reverseOrder());
        int kthLargest = list.get(k - 1);

        // Expected result (the 4th largest element)
        int expected = 7;

        // Verify that the k-th largest element is correct
        assertEquals(expected, kthLargest);
    }

    @Test
    public void testKthLargestEdgeCase() {
        // Edge case: when k is 1 (largest element)
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        int k = 1;
        Collections.sort(list, Collections.reverseOrder());
        int kthLargest = list.get(k - 1);

        // The largest element in the list is 5
        int expected = 5;

        assertEquals(expected, kthLargest);
    }

    @Test
    public void testKthLargestOutOfBounds() {
        // Edge case: when k is greater than the size of the list
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 7, 10, 4);

        int k = 5;  // Out of bounds
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Collections.sort(list, Collections.reverseOrder());
            list.get(k - 1);
        });
    }

    @Test
    public void testKthLargestSingleElement() {
        // Edge case: when the list contains only one element
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10);

        int k = 1;
        Collections.sort(list, Collections.reverseOrder());
        int kthLargest = list.get(k - 1);

        // Only one element, it should be 10
        int expected = 10;

        assertEquals(expected, kthLargest);
    }

}
