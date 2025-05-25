package com.collectors.loops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InfiniteButSafeTest {

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
        InfiniteButSafe.main(new String[]{});
        String expectedOutput = "0\n1\n2\n3\n4\n";
        String actualOutput = outputStream.toString().replace("\r\n", "\n"); // normalize for Windows
        assertEquals(expectedOutput, actualOutput);
    }
}

