package com.collectors.arrList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NaveenWodeyar
 *
 */

class OptionalWithListTest {

    OptionalWithList optionalWithList = new OptionalWithList(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));

    @Test
    void testFindNamePresent() {
        Optional<String> result = optionalWithList.findName("Charlie");
        assertTrue(result.isPresent());
        assertEquals("Charlie", result.get());
    }

    @Test
    void testFindNameNotPresent() {
        Optional<String> result = optionalWithList.findName("Eve");
        assertFalse(result.isPresent());
    }

    @Test
    void testFindNameWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> optionalWithList.findName(null));
    }

    @Test
    void testGetNameOrDefaultPresent() {
        assertEquals("Bob", optionalWithList.getNameOrDefault("Bob"));
    }

    @Test
    void testGetNameOrDefaultNotPresent() {
        assertEquals("Default Name", optionalWithList.getNameOrDefault("Eve"));
    }

    @Test
    void testGetNameOrDefaultWithNullInput() {
        assertEquals("Invalid Name", optionalWithList.getNameOrDefault(null));
    }

    @Test
    void testGetNameOrGeneratedPresent() {
        assertEquals("Alice", optionalWithList.getNameOrGenerated("Alice"));
    }

    @Test
    void testGetNameOrGeneratedNotPresent() {
        assertEquals("Generated Name", optionalWithList.getNameOrGenerated("Zara"));
    }

    @Test
    void testGetNameOrGeneratedWithNullInput() {
        assertEquals("Generated Name", optionalWithList.getNameOrGenerated(null));
    }

    @Test
    void testGetNameLengthPresent() {
        assertEquals(5, optionalWithList.getNameLength("Diana"));
    }

    @Test
    void testGetNameLengthNotPresentThrowsException() {
        assertThrows(NoSuchElementException.class, () -> optionalWithList.getNameLength("Eve"));
    }

    @Test
    void testGetNameLengthWithNullInputThrowsRuntimeException() {
        assertThrows(RuntimeException.class, () -> optionalWithList.getNameLength(null));
    }

    @Test
    void testGetFilteredNameValidPrefix() {
        Optional<String> result = optionalWithList.getFilteredName("C");
        assertTrue(result.isPresent());
        assertEquals("Charlie", result.get());
    }

    @Test
    void testGetFilteredNameWithNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> optionalWithList.getFilteredName(null));
    }
}

