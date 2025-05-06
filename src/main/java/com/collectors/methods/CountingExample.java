package com.collectors.methods;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class CountingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        Map<Integer, Long> ageCount = people.stream()
            .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

        ageCount.forEach((age, count) -> {
            System.out.println("Age " + age + ": " + count + " people");
        });
    }
}

