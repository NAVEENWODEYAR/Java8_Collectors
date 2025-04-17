package com.collectors.loops;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */

public class LoopTrickTest {

    @Test
    public void testLoopOutput() {
        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run main method
        LoopTrick.main(null);

        // Restore original output
        System.setOut(originalOut);

        // Expected output
        String expected = "Start  End End End";

        // Remove any extra whitespace or newlines
        String actual = outContent.toString().trim();

        assertEquals(expected, actual);
    }
}