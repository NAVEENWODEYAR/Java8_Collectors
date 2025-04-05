package com.collectors.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author NaveenWodeyar
 *
 */

public class MaxValueKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Alice", 25);
        map.put("Bob", 35);

        // Finding key with maximum value
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Key with maximum value: " + maxKey + " with value " + maxValue);
    }
}
