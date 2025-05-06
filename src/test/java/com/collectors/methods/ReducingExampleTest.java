
package com.collectors.methods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author NaveenWodeyar
 *
 */

public class ReducingExampleTest {

    @Test
    public void testFindOldestPerson_success() {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("Jack", 25),
            new Person("Jill", 30),
            new Person("Jake", 35)
        );

        Optional<Person> oldest = people.stream()
            .collect(Collectors.reducing((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2));

        assertThat(oldest).isPresent();
        assertThat(oldest.get().getName()).isEqualTo("Jake");
        assertThat(oldest.get().getAge()).isEqualTo(35);
    }

    @Test
    public void testFindOldestPerson_emptyList_shouldThrowException() {
        List<Person> emptyList = List.of();

        assertThrows(IllegalArgumentException.class, () -> {
            emptyList.stream()
                .collect(Collectors.reducing((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2))
                .orElseThrow(() -> new IllegalArgumentException("No people found"));
        });
    }
}

