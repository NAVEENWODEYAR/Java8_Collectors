package com.collectors.series;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */
class MultiplicationTableJavaStreamsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMultiplicationTableOutput() {
        // Act
        MultiplicationTableJavaStreams.main(null);

        // Assert
        String expectedOutput = """
                Multiplication Table of 7:
                7 * 1 = 7
                7 * 2 = 14
                7 * 3 = 21
                7 * 4 = 28
                7 * 5 = 35
                7 * 6 = 42
                7 * 7 = 49
                7 * 8 = 56
                7 * 9 = 63
                7 * 10 = 70
                """;

        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }

}
