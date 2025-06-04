package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalWithListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Optional.of - creates a non-empty Optional
        Optional<List<String>> optionalNames = Optional.of(names);
        System.out.println("Optional.of: " + optionalNames);

        // Optional.ofNullable - safe even if list is null
        Optional<List<String>> optionalNullable = Optional.ofNullable(null);
        System.out.println("Optional.ofNullable(null): " + optionalNullable);

        // Optional.empty
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Optional.empty(): " + emptyOptional);

        // Searching for a name in the list
        String searchName = "Charlie";
        Optional<String> foundName = names.stream()
                                          .filter(name -> name.equalsIgnoreCase(searchName))
                                          .findFirst();

        // isPresent
        if (foundName.isPresent()) {
            System.out.println("Found: " + foundName.get());
        } else {
            System.out.println("Name not found.");
        }

        // ifPresent
        foundName.ifPresent(name -> System.out.println("Name found using ifPresent: " + name));

        // orElse
        String defaultName = foundName.orElse("Default Name");
        System.out.println("Using orElse: " + defaultName);

        // orElseGet
        String generatedName = foundName.orElseGet(() -> "Generated Name");
        System.out.println("Using orElseGet: " + generatedName);

        // orElseThrow
        try {
            String name = foundName.orElseThrow(() -> new NoSuchElementException("Name not found"));
            System.out.println("Using orElseThrow: " + name);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        // map
        Optional<Integer> nameLength = foundName.map(String::length);
        nameLength.ifPresent(len -> System.out.println("Length of name: " + len));

        // filter
        Optional<String> filteredName = foundName.filter(name -> name.startsWith("C"));
        filteredName.ifPresent(name -> System.out.println("Filtered name: " + name));
    }
}
