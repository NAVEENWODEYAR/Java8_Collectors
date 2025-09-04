package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

public class AadhaarService {

    // Simulated method to fetch Aadhaar details (mocked)
    public static String getAadhaarDetails(String aadhaarNumber) {
        // Validate Aadhaar number format
        if (!aadhaarNumber.matches("\\d{12}")) {
            return "Invalid Aadhaar number. Must be 12 digits.";
        }

        // Simulated response (you'd actually call an API here)
        if (aadhaarNumber.equals("123412341234")) {
            return """
                Name: Rahul Sharma
                DOB: 1990-05-21
                Gender: Male
                Address: 123, Sector 10, New Delhi, India
                """;
        } else {
            return "No details found for Aadhaar number: " + aadhaarNumber;
        }
    }

    public static void main(String[] args) {
        // Simulate input
        String aadhaarNumber = "123412341234";
        String details = getAadhaarDetails(aadhaarNumber);

        // Display details
        System.out.println(details);
    }
}
