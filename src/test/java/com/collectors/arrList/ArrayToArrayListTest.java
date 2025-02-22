package com.collectors.arrList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author NaveenWodeyar
 *
 */
class ArrayToArrayListTest {

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
	
	 @Test
	    public void testArrToArrayList() {
	        // Mock current time for consistent output
	        LocalDateTime time = LocalDateTime.of(2025, 2, 22, 12, 30);  
	        
	        String[] array = {"Java", "Docker", "Kubernates"};
	        List<String> expectedList = new ArrayList<>(Arrays.asList(array));
	        
	        // Creating ArrayList using Arrays.asList
	        ArrayList<String> actualList = new ArrayList<>(Arrays.asList(array));

	        // Check if the list created by Arrays.asList() is correct
	        assertEquals(expectedList, actualList);
	    }

	    @Test
	    public void testListToArray() {
	        // Convert ArrayList to array
	        List<String> list = new ArrayList<>(Arrays.asList("ANDROID", "JSP", "JAVA", "STRUTS"));
	        Object[] array = list.toArray();

	        // Check if the conversion from ArrayList to Array is correct
	        assertArrayEquals(new Object[]{"ANDROID", "JSP", "JAVA", "STRUTS"}, array);
	    }

	    @Test
	    public void testFormattedTime() {
	        // Verify that the formatted time output is correct
	        LocalDateTime time = LocalDateTime.of(2025, 2, 22, 12, 30);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy HH:mm");
	        String formattedTime = time.format(formatter);

	        // Expected formatted time
	        String expectedTime = "22Feb2025 12:30";
	        
	        // Validate the formatted time
	        assertEquals(expectedTime, formattedTime);
	    }

}
