/**
 * 
 */
package com.collectors.optional;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author NaveenWodeyar
 *
 */
class OptionalMethodsTest {



	    OptionalMethods example = new OptionalMethods();

	    @Test
	    void testGetNameOrElse_withNull() {
	        String result = example.getNameOrElse(null);
	        assertEquals("Default Name", result);
	    }

	    @Test
	    void testGetNameOrElse_withValue() {
	        String result = example.getNameOrElse("Alice");
	        assertEquals("Alice", result);
	    }

	    @Test
	    void testGetNameOrElseGet_withNull() {
	        String result = example.getNameOrElseGet(null);
	        assertEquals("Generated Name", result);
	    }

	    @Test
	    void testGetNameOrElseGet_withValue() {
	        String result = example.getNameOrElseGet("Bob");
	        assertEquals("Bob", result);
	    }

	    @Test
	    void testGetNameOrElseThrow_withValue() {
	        String result = example.getNameOrElseThrow("Charlie");
	        assertEquals("Charlie", result);
	    }

	    @Test
	    void testGetNameOrElseThrow_withNull() {
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            example.getNameOrElseThrow(null);
	        });
	        assertEquals("Name is missing", exception.getMessage());
	    }
	}

