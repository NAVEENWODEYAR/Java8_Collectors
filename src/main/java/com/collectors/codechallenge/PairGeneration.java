package com.collectors.codechallenge;

import java.util.*;
import java.util.stream.*;

public class PairGeneration {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);

        List<String> pairs = list1.stream()
            .flatMap(i -> list2.stream().map(j -> "(" + i + "," + j + ")"))
            .collect(Collectors.toList());

        pairs.forEach(System.out::println);
    }
}
