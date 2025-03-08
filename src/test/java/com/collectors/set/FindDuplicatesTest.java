package com.collectors.set;

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

class FindDuplicatesTest {

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
	
	 // Test case to check if the duplicates are found correctly
    @Test
    void testFindDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 1, 6, 2, 7};
        
        List<Integer> duplicates = FindDuplicates.findDuplicates(arr);
        
        // Verify the expected duplicates are found
        assertEquals(2, duplicates.size());  // Expect 2 duplicates
        
        // Check if the correct duplicates are found
        assertTrue(duplicates.contains(1));  // 1 is a duplicate
        assertTrue(duplicates.contains(2));  // 2 is a duplicate
    }

    // Test case for array with no duplicates
    @Test
    void testFindDuplicatesNoDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        List<Integer> duplicates = FindDuplicates.findDuplicates(arr);
        
        // Verify that there are no duplicates
        assertTrue(duplicates.isEmpty());
    }

    // Test case for array with all duplicates
    @Test
    void testFindDuplicatesAllDuplicates() {
        int[] arr = {1, 1, 1, 1, 1, 1};
        
        List<Integer> duplicates = FindDuplicates.findDuplicates(arr);
        
        // Verify that 1 is the only duplicate
        assertEquals(1, duplicates.size());  // Only one type of duplicate, 1
        
        // Verify that 1 is included in the duplicates
        assertTrue(duplicates.contains(1));
    }

    // Test case for empty array (no elements)
    @Test
    void testFindDuplicatesEmptyArray() {
        int[] arr = {};
        
        List<Integer> duplicates = FindDuplicates.findDuplicates(arr);
        
        // Verify that there are no duplicates in an empty array
        assertTrue(duplicates.isEmpty());
    }

    // Test case for array with one element (no duplicates)
    @Test
    void testFindDuplicatesSingleElement() {
        int[] arr = {1};
        
        List<Integer> duplicates = FindDuplicates.findDuplicates(arr);
        
        // Verify that there are no duplicates in an array with only one element
        assertTrue(duplicates.isEmpty());
    }

}
