package com.collectors.codechallenge;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */

public class SwapCharactersByChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input characters to swap
        System.out.print("Enter first character to swap: ");
        char ch1 = scanner.next().charAt(0);

        System.out.print("Enter second character to swap: ");
        char ch2 = scanner.next().charAt(0);

        // Check if both characters exist in the string
        int index1 = input.indexOf(ch1);
        int index2 = input.indexOf(ch2);

        if (index1 == -1 || index2 == -1) {
            System.out.println("One or both characters not found in the string.");
            return;
        }

        // Convert string to char array for modification
        char[] charArray = input.toCharArray();

        // Swap characters at their first occurrence
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;

        // Output the result
        String swappedString = new String(charArray);
        System.out.println("Swapped string: " + swappedString);
    }
}
