package com.collectors.methods;

import java.util.*;
import java.util.stream.Collectors;


/**
 * @author NaveenWodeyar
 *
 */

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class GroupingByExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        Map<Integer, List<Person>> groupedByAge = people.stream()
            .collect(Collectors.groupingBy(Person::getAge));

        groupedByAge.forEach((age, persons) -> {
            System.out.println("Age " + age + ":");
            persons.forEach(person -> System.out.println(person.getName()));
        });
    }
}
