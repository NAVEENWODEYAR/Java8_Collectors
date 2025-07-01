package com.collectors.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * @author NaveenWodeyar
 *
 */

public class DateFormatExamples {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        String[] patterns = {
            "yyyy-MM-dd",
            "dd/MM/yyyy",
            "MM/dd/yyyy",
            "EEEE, MMMM d, yyyy",
            "hh:mm a",
            "HH:mm:ss",
            "yyyy-MM-dd'T'HH:mm:ss",
            "hh:mm a EEEE MMMM yyyy",
            "EEE, d MMM yyyy HH:mm:ss",
            "yyyy.MM.dd G 'at' HH:mm:ss",
            "dd-MM-yyyy HH:mm:ss",
            "yyyy/MM/dd HH:mm:ss",
            "MMMM dd, yyyy",
            "dd MMMM yyyy",
            "EEEE dd MMMM yyyy"
        };

        System.out.println("Current Date & Time Formats:\n");

        for (String pattern : patterns) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
            String formatted = now.format(formatter);
            System.out.printf("Pattern: %-30s → %s%n", pattern, formatted);
        }
    }
}
