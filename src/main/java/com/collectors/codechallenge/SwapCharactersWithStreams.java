package com.collectors.codechallenge;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class SwapCharactersWithStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Characters to swap
        System.out.print("Enter first character to swap: ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("Enter second character to swap: ");
        char ch2 = scanner.next().charAt(0);

        // Stream-based transformation
        String swapped = input.chars()
                .mapToObj(c -> {
                    if (c == ch1) return String.valueOf(ch2);
                    else if (c == ch2) return String.valueOf(ch1);
                    else return String.valueOf((char) c);
                })
                .collect(Collectors.joining());

        // Output
        System.out.println("Swapped string: " + swapped);
    }
}
