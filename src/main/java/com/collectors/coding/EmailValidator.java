package com.collectors.coding;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author NaveenWodeyar
 *
 */

public class EmailValidator {

    // Regular expression for validating email
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email ID to validate:");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is NOT a valid email address.");
        }

        scanner.close();
    }
}
