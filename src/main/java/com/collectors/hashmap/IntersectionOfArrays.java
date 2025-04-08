package com.collectors.hashmap;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class IntersectionOfArrays {
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        // Store the elements of arr1 in HashMap with count
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check for elements in arr2 that exist in arr1
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1); // To avoid duplicates
            }
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        System.out.println("Intersection: " + findIntersection(arr1, arr2));
    }
}

