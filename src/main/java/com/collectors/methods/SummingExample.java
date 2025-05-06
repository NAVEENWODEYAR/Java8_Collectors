package com.collectors.methods;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class SummingExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        int totalAge = people.stream()
            .collect(Collectors.summingInt(Person::getAge));

        System.out.println("Total age: " + totalAge);
    }
}
