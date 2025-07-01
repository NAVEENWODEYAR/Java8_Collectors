package com.collectors.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author NaveenWodeyar
 *
 */

public class CurrentDateTime {
    // Method to get current date and time in custom format
    public String getFormattedDateTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a EEEE MMMM yyyy", Locale.ENGLISH);
        return now.format(formatter);
    }

    public static void main(String[] args) {
        CurrentDateTime dateTime = new CurrentDateTime();
        String formattedDateTime = dateTime.getFormattedDateTime();
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
