package com.collectors.methods;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class PartitioningExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        Map<Boolean, List<Person>> partitionedByAge = people.stream()
            .collect(Collectors.partitioningBy(person -> person.getAge() >= 30));

        partitionedByAge.forEach((is30OrOlder, persons) -> {
            System.out.println((is30OrOlder ? "30 or older" : "Younger than 30") + ":");
            persons.forEach(person -> System.out.println(person.getName()));
        });
    }
}
