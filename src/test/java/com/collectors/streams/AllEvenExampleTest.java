package com.collectors.streams;

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
class AllEvenExampleTest {

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
    void testAllEven() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean areAllEven = numbers.stream()
                                    .allMatch(n -> n % 2 == 0);
        assertTrue(areAllEven, "All numbers should be even.");
    }

    @Test
    void testNotAllEven() {
        List<Integer> numbers = Arrays.asList(2, 3, 6, 8, 10);
        boolean areAllEven = numbers.stream()
                                    .allMatch(n -> n % 2 == 0);
        assertFalse(areAllEven, "Not all numbers are even.");
    }

    @Test
    void testEmptyList() {
        List<Integer> numbers = Arrays.asList();
        boolean areAllEven = numbers.stream()
                                    .allMatch(n -> n % 2 == 0);
        assertTrue(areAllEven, "An empty list should be considered as all-even.");
    }

}
