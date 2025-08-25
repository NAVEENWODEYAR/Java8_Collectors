package com.collectors.codechallenge;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author NaveenWodeyar
 *
 */

public class PhoneEmailValidator {

    // Regex pattern for a valid Indian phone number (10 digits, starts with 6-9)
    private static final String PHONE_NUMBER_PATTERN = "^[6-9]\\d{9}$";

    // Regex pattern for a valid email address
    private static final String EMAIL_ADDRESS_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches(PHONE_NUMBER_PATTERN, phoneNumber);
    }

    public static boolean isValidEmailAddress(String emailAddress) {
        return Pattern.matches(EMAIL_ADDRESS_PATTERN, emailAddress);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate phone number
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("✅ Valid phone number.");
        } else {
            System.out.println("❌ Invalid phone number.");
        }

        // Input and validate email address
        System.out.print("Enter email address: ");
        String emailAddress = scanner.nextLine();

        if (isValidEmailAddress(emailAddress)) {
            System.out.println("✅ Valid email address.");
        } else {
            System.out.println("❌ Invalid email address.");
        }

        scanner.close();
    }
}
