package com.collectors.methods;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class ReducingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        Person oldest = people.stream()
            .collect(Collectors.reducing((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2))
            .orElseThrow(() -> new IllegalArgumentException("No people found"));

        System.out.println("The oldest person is " + oldest.getName() + " with age " + oldest.getAge());
    }
}

