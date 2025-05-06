package com.collectors.methods;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author NaveenWodeyar
 *
 */

public class PartitioningExampleTest {

    @Test
    public void testPartitionByAge() {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        Map<Boolean, List<Person>> partitioned = people.stream()
            .collect(Collectors.partitioningBy(person -> person.getAge() >= 30));

        assertThat(partitioned).containsKeys(true, false);

        List<String> names30OrOlder = partitioned.get(true).stream()
            .map(Person::getName)
            .collect(Collectors.toList());

        List<String> namesYoungerThan30 = partitioned.get(false).stream()
            .map(Person::getName)
            .collect(Collectors.toList());

        assertThat(names30OrOlder).containsExactlyInAnyOrder("Jane", "Jill", "Jake");
        assertThat(namesYoungerThan30).containsExactlyInAnyOrder("John", "Jack");
    }
}

