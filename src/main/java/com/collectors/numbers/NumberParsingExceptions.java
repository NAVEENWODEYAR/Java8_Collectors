package com.collectors.numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */

public class NumberParsingExceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. NumberFormatException – invalid integer string
        try {
            System.out.print("Enter an integer (e.g., 123): ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Parsed int: " + number);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: Invalid integer input.");
        }

        // 2. NumberFormatException – invalid double string
        try {
            System.out.print("Enter a double (e.g., 12.34): ");
            String input = scanner.nextLine();
            double dbl = Double.parseDouble(input);
            System.out.println("Parsed double: " + dbl);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: Invalid double input.");
        }

        // 3. NullPointerException – parsing null
        try {
            String nullStr = null;
            int value = Integer.parseInt(nullStr);
            System.out.println("Parsed from null: " + value);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: Cannot parse null.");
        }

        // 4. InputMismatchException – scanner trying to parse invalid type
        try {
            System.out.print("Enter a float (e.g., 3.14): ");
            float floatValue = scanner.nextFloat(); // fails if input is not a valid float
            System.out.println("Parsed float: " + floatValue);
        } catch (InputMismatchException e) {
            System.err.println("InputMismatchException: Not a valid float.");
            scanner.nextLine(); // clear the bad input from scanner buffer
        }

        // 5. IllegalArgumentException – parsing edge cases
        try {
            System.out.print("Enter a string for Boolean parsing (true/false): ");
            String boolInput = scanner.nextLine();
            if (!boolInput.equalsIgnoreCase("true") && !boolInput.equalsIgnoreCase("false")) {
                throw new IllegalArgumentException("Only 'true' or 'false' allowed.");
            }
            boolean bool = Boolean.parseBoolean(boolInput);
            System.out.println("Parsed boolean: " + bool);
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        }

        scanner.close();
        System.out.println("Parsing demo complete.");
    }
}
