package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONComparator {

    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * Compares two JSON strings for structural and value equality.
     *
     * @param json1 First JSON string
     * @param json2 Second JSON string
     * @return true if both JSON structures are equal
     */
    public static boolean areEqual(String json1, String json2) {
        try {
            JsonNode tree1 = mapper.readTree(json1);
            JsonNode tree2 = mapper.readTree(json2);
            return tree1.equals(tree2);
        } catch (Exception e) {
            throw new RuntimeException("Invalid JSON provided", e);
        }
    }

    /**
     * Returns the difference between two JSON objects.
     */
    public static String findDifference(String json1, String json2) {
        try {
            JsonNode tree1 = mapper.readTree(json1);
            JsonNode tree2 = mapper.readTree(json2);

            if (tree1.equals(tree2)) {
                return "No differences — JSON structures are identical.";
            }

            return "Differences found:\nJSON 1:\n" + tree1.toPrettyString() +
                   "\nJSON 2:\n" + tree2.toPrettyString();

        } catch (Exception e) {
            throw new RuntimeException("Invalid JSON provided", e);
        }
    }
}

