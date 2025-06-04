package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class OptionalWithList {
    private List<String> names;

    public OptionalWithList(List<String> names) {
        this.names = names != null ? names : new ArrayList<>();
    }

    public Optional<String> findName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name to search cannot be null");
        }

        return names.stream()
                    .filter(n -> n.equalsIgnoreCase(name))
                    .findFirst();
    }

    public String getNameOrDefault(String name) {
        try {
            return findName(name).orElse("Default Name");
        } catch (IllegalArgumentException e) {
            return "Invalid Name";
        }
    }

    public String getNameOrGenerated(String name) {
        try {
            return findName(name).orElseGet(() -> "Generated Name");
        } catch (IllegalArgumentException e) {
            return "Generated Name";
        }
    }

    public int getNameLength(String name) {
        try {
            return findName(name)
                    .map(String::length)
                    .orElseThrow(() -> new NoSuchElementException("Name not found in list"));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Invalid input provided");
        }
    }

    public Optional<String> getFilteredName(String prefix) {
        if (prefix == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }

        return names.stream()
                    .filter(name -> name.startsWith(prefix))
                    .findFirst();
    }
}
