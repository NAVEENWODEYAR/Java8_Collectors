package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {

        // Sample input string
        String input = "My email is test123@gmail.com and phone is 9876543210";

        // 1. RegEx to match an email address
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Create Pattern object
        Pattern emailPattern = Pattern.compile(emailRegex);

        // Create Matcher object
        Matcher emailMatcher = emailPattern.matcher(input);

        // Find and display email
        if (emailMatcher.find()) {
            System.out.println("Email found: " + emailMatcher.group());
        }

        // 2. RegEx to match a 10-digit mobile number
        String phoneRegex = "\\b[0-9]{10}\\b";

        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(input);

        // Find and display phone number
        if (phoneMatcher.find()) {
            System.out.println("Phone number found: " + phoneMatcher.group());
        }

        // 3. RegEx to check if a string contains only alphabets
        String name = "JavaRegex";

        boolean isAlphabetOnly = name.matches("[a-zA-Z]+");
        System.out.println("Contains only alphabets: " + isAlphabetOnly);

        // 4. RegEx to replace digits with '*'
        String replaced = input.replaceAll("\\d", "*");
        System.out.println("After replacing digits: " + replaced);
    }
}

