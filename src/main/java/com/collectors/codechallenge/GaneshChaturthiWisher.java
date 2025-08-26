package com.collectors.codechallenge;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * @author NaveenWodeyar
 *
 */

public class GaneshChaturthiWisher {

    // Known Ganesh Chaturthi dates (Gregorian calendar)
    private static final Set<LocalDate> GANESH_CHATURTHI_DATES = new HashSet<>();

    static {
        // Add known Ganesh Chaturthi dates here (update yearly)
        GANESH_CHATURTHI_DATES.add(LocalDate.of(2023, 9, 19));
        GANESH_CHATURTHI_DATES.add(LocalDate.of(2024, 9, 7));
        GANESH_CHATURTHI_DATES.add(LocalDate.of(2025, 8, 27));
        GANESH_CHATURTHI_DATES.add(LocalDate.of(2026, 9, 15));
        GANESH_CHATURTHI_DATES.add(LocalDate.of(2027, 9, 5));
        // Add more years as needed
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        if (GANESH_CHATURTHI_DATES.contains(today)) {
            System.out.println("🙏 Happy Ganesh Chaturthi! May Lord Ganesha bless you with wisdom, prosperity, and good fortune! 🐘");
        } else {
            System.out.println("Today is not Ganesh Chaturthi. Wishing you a great day!");
        }
    }
}
