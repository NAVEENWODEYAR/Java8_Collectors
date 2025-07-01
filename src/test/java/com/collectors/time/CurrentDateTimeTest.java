/**
 * 
 */
package com.collectors.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author NaveenWodeyar
 *
 */

public class CurrentDateTimeTest {

    @Test
    public void testFormattedDateTimePattern() {
        CurrentDateTime dateTime = new CurrentDateTime();
        String output = dateTime.getFormattedDateTime();

        // Validate pattern like "07:45 AM Tuesday July 2025"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a EEEE MMMM yyyy", Locale.ENGLISH);

        // Try parsing it back to LocalDateTime (by appending a dummy date if needed)
        assertDoesNotThrow(() -> {
            // Can't parse back to LocalDateTime without seconds, so just check pattern match
            assertTrue(output.matches("\\d{2}:\\d{2} [AP]M [A-Za-z]+ [A-Za-z]+ \\d{4}"));
        });
    }
}
