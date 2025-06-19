package com.collectors.arrList;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CollectionStreamUtilsTest {

    @Test
    void testTopNFrequentWords() {
        List<String> input = List.of("apple", "banana", "apple", "cherry", "banana", "apple");
        assertEquals(List.of("apple", "banana"), CollectionStreamUtils.topNFrequentWords(input, 2));
    }

    @Test
    void testSortByValueDesc() {
        Map<String, Integer> input = Map.of("a", 2, "b", 5, "c", 1);
        LinkedHashMap<String, Integer> sorted = CollectionStreamUtils.sortByValueDesc(input);
        assertEquals(List.of("b", "a", "c"), new ArrayList<>(sorted.keySet()));
    }

    @Test
    void testGroupByCity() {
        Map<String, String> people = Map.of("Alice", "NY", "Bob", "LA", "Charlie", "NY");
        Map<String, List<String>> grouped = CollectionStreamUtils.groupByCity(people);
        assertEquals(List.of("Alice", "Charlie"), grouped.get("NY"));
    }

    @Test
    void testGroupAnagrams() {
        List<String> words = List.of("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String, List<String>> grouped = CollectionStreamUtils.groupAnagrams(words);
        assertTrue(grouped.get("aet").containsAll(List.of("eat", "tea", "ate")));
    }

    @Test
    void testFindDuplicates() {
        List<String> list = List.of("a", "b", "c", "a", "b");
        assertEquals(Set.of("a", "b"), CollectionStreamUtils.findDuplicates(list));
    }

    @Test
    void testGetDuplicateCounts() {
        List<String> list = List.of("a", "b", "c", "a", "b", "a");
        Map<String, Long> counts = CollectionStreamUtils.getDuplicateCounts(list);
        assertEquals(3L, counts.get("a"));
        assertEquals(2L, counts.get("b"));
    }

    @Test
    void testFlattenAndDistinct() {
        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(2, 3), List.of(3, 4));
        assertEquals(List.of(1, 2, 3, 4), CollectionStreamUtils.flattenAndDistinct(nested));
    }

    @Test
    void testPartitionEvenOdd() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> partitioned = CollectionStreamUtils.partitionEvenOdd(list);
        assertEquals(List.of(2, 4), partitioned.get(true));
        assertEquals(List.of(1, 3, 5), partitioned.get(false));
    }

    @Test
    void testCountWordFrequency() {
        String text = "Apple apple banana, apple!";
        Map<String, Long> freq = CollectionStreamUtils.countWordFrequency(text);
        assertEquals(3L, freq.get("apple"));
        assertEquals(1L, freq.get("banana"));
    }

    @Test
    void testCleanAndSort() {
        List<String> input = Arrays.asList("banana", null, "apple", "cherry", null);
        List<String> sorted = CollectionStreamUtils.cleanAndSort(input);
        assertEquals(List.of("apple", "banana", "cherry"), sorted);
    }
}
