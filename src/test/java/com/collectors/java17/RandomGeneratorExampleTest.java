package com.collectors.java17;

import static org.junit.jupiter.api.Assertions.*;
import java.util.random.RandomGenerator;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

class RandomGeneratorExampleTest extends RandomGeneratorExample {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    void testRandomInt() {
        // Create a RandomGenerator
        RandomGenerator random = RandomGenerator.of("L64X128MixRandom");

        // Get a random integer and ensure it's an integer (just an example check)
        int randomInt = random.nextInt();

        // Validate the random number is an integer
        assertNotNull(randomInt, "Random int should not be null");
        assertTrue(randomInt != 0, "Random int should not be 0"); // Just a basic validation
    }

    @Test
    void testRandomLong() {
        // Create a RandomGenerator
        RandomGenerator random = RandomGenerator.of("L64X128MixRandom");

        // Get a random long value
        long randomLong = random.nextLong();

        // Validate the random long is a valid number
        assertNotNull(randomLong, "Random long should not be null");
        assertNotEquals(0L, randomLong, "Random long should not be 0"); // Basic validation
    }

    @Test
    void testRandomIntRange() {
        // Create a RandomGenerator
        RandomGenerator random = RandomGenerator.of("L64X128MixRandom");

        // Generate a random integer within a specific range, for example, between 1 and 100
        int randomInt = random.nextInt(1, 100); 

        // Assert the random int is within the specified range
        assertTrue(randomInt >= 1 && randomInt < 100, "Random int should be in the range [1, 100)");
    }

    @Test
    void testRandomLongRange() {
        // Create a RandomGenerator
        RandomGenerator random = RandomGenerator.of("L64X128MixRandom");

        // Generate a random long within a specific range, for example, between 1 and 1,000
        long randomLong = random.nextLong(1, 1000); 

        // Assert the random long is within the specified range
        assertTrue(randomLong >= 1 && randomLong < 1000, "Random long should be in the range [1, 1000)");
    }

}
