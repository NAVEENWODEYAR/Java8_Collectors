package com.collectors.arrList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;


/**
 * @author NaveenWodeyar
 *
 */

public class CollectionStreamUtils {

    // 1. Top N frequent words
    public static List<String> topNFrequentWords(List<String> words, int n) {
        return words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(n)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // 2. Sort Map by value in descending order
    public static <K, V extends Comparable<V>> LinkedHashMap<K, V> sortByValueDesc(Map<K, V> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.<K, V>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));
    }

    // 3. Group people by city
    public static Map<String, List<String>> groupByCity(Map<String, String> personToCity) {
        return personToCity.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));
    }

    // 4. Group anagrams
    public static Map<String, List<String>> groupAnagrams(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(word -> {
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }));
    }

    // 5. Find duplicate elements
    public static <T> Set<T> findDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        return list.stream()
                .filter(e -> !seen.add(e))
                .collect(Collectors.toSet());
    }

    // 6. Elements with frequency > 1
    public static <T> Map<T, Long> getDuplicateCounts(List<T> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    // 7. Flatten and distinct nested lists
    public static List<Integer> flattenAndDistinct(List<List<Integer>> nestedList) {
        return nestedList.stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    // 8. Partition even and odd
    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }

    // 9. Word frequency (case-insensitive)
    public static Map<String, Long> countWordFrequency(String text) {
        return Arrays.stream(text.toLowerCase().split("\\W+"))
                .filter(w -> !w.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // 10. Remove nulls and sort
    public static List<String> cleanAndSort(List<String> input) {
        return input.stream()
                .filter(Objects::nonNull)
                .sorted()
                .collect(Collectors.toList());
    }
}

