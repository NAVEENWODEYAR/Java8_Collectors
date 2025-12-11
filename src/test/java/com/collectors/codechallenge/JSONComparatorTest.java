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

public class JSONComparatorTest {

    @Test
    void testEqualJson() {
        String json1 = "{ \"id\": 1, \"name\": \"Alice\" }";
        String json2 = "{ \"name\": \"Alice\", \"id\": 1 }"; // different order

        assertTrue(JSONComparator.areEqual(json1, json2),
                "JSON structures should be equal");
    }

    @Test
    void testNotEqualJson() {
        String json1 = "{ \"id\": 1, \"name\": \"Alice\" }";
        String json2 = "{ \"id\": 2, \"name\": \"Alice\" }";

        assertFalse(JSONComparator.areEqual(json1, json2),
                "JSON structures should NOT be equal");
    }

    @Test
    void testInvalidJsonThrowsException() {
        String invalidJson = "{ id: 1 name: Alice }";

        assertThrows(RuntimeException.class, () -> {
            JSONComparator.areEqual(invalidJson, invalidJson);
        });
    }

    @Test
    void testJsonDifferenceOutput() {
        String json1 = "{ \"id\": 1, \"name\": \"Alice\" }";
        String json2 = "{ \"id\": 2, \"name\": \"Bob\" }";

        String diff = JSONComparator.findDifference(json1, json2);

        assertTrue(diff.contains("Differences found"),
                "Difference message should indicate mismatch");
    }
}
