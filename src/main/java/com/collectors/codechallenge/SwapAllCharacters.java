package com.collectors.codechallenge;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */

public class SwapAllCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the characters to swap
        System.out.print("Enter first character to swap: ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("Enter second character to swap: ");
        char ch2 = scanner.next().charAt(0);

        // Check if at least one of the characters exists
        if (input.indexOf(ch1) == -1 && input.indexOf(ch2) == -1) {
            System.out.println("Neither character found in the string.");
            return;
        }

        // Swap all occurrences
        StringBuilder swapped = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == ch1) {
                swapped.append(ch2);
            } else if (c == ch2) {
                swapped.append(ch1);
            } else {
                swapped.append(c);
            }
        }

        // Output result
        System.out.println("Swapped string: " + swapped.toString());
    }
}
