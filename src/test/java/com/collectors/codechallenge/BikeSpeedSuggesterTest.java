package com.collectors.codechallenge;

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

public class BikeSpeedSuggesterTest {

    @Test
    void testLightWeightBike() {
        assertEquals(120, BikeSpeedSuggester.suggestSpeed(90));
    }

    @Test
    void testMediumWeightBike() {
        assertEquals(100, BikeSpeedSuggester.suggestSpeed(120));
    }

    @Test
    void testHeavyBike() {
        assertEquals(80, BikeSpeedSuggester.suggestSpeed(170));
    }

    @Test
    void testVeryHeavyBike() {
        assertEquals(60, BikeSpeedSuggester.suggestSpeed(220));
    }

    @Test
    void testBoundaryValues() {
        assertEquals(120, BikeSpeedSuggester.suggestSpeed(99.9));
        assertEquals(100, BikeSpeedSuggester.suggestSpeed(100));
        assertEquals(80, BikeSpeedSuggester.suggestSpeed(150));
        assertEquals(60, BikeSpeedSuggester.suggestSpeed(200));
    }

    @Test
    void testInvalidWeight() {
        assertThrows(IllegalArgumentException.class, () -> {
            BikeSpeedSuggester.suggestSpeed(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            BikeSpeedSuggester.suggestSpeed(-50);
        });
    }
}
