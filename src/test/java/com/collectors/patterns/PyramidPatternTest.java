package com.collectors.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

public class PyramidPatternTest {

    @Test
    public void testPyramidPattern() {
        // Set up the output capture
        ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(capturedOutput));

        // Test for n = 5
        int n = 5;
        PyramidPattern.main(new String[]{}); // Run the method to generate the pyramid

        // Expected output for n = 5
        String expectedOutput = "    *\n" +
                                "   ***\n" +
                                "  *****\n" +
                                " *******\n" +
                                "*********\n";

        // Compare the captured output with the expected output
        assertEquals(expectedOutput, capturedOutput.toString());

        // Restore the original System.out
        System.setOut(originalOut);
    }
}

