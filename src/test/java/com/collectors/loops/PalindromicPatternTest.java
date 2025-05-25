package com.collectors.loops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromicPatternTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testMainOutput() {
        PalindromicPattern.main(new String[]{});

        String expectedOutput = String.join("\n",
            "        1 ",
            "      2 1 2 ",
            "    3 2 1 2 3 ",
            "  4 3 2 1 2 3 4 ",
            "5 4 3 2 1 2 3 4 5 ",
            ""
        );

        String actualOutput = outputStream.toString().replace("\r\n", "\n"); // Normalize line endings
        assertEquals(expectedOutput, actualOutput);
    }
}

