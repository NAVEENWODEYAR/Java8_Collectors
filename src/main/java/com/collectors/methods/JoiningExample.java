package com.collectors.methods;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class JoiningExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        String names = people.stream()
            .map(Person::getName)
            .collect(Collectors.joining(", "));

        System.out.println("People: " + names);
    }
}
