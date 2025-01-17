package com.collectors.numbers;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 31/05/2024
 * @apiNote,find sum of first 10 natural numbers,
 */
public class SumOfNumbers {

	private static int sum;

	static Integer sumOfNaturalNos() {
		return IntStream.range(0, 10).sum();
	}
	
	static int sumOfDigit(int number) {
		int sum = 0;

        // Loop to extract each digit and add to sum
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10;        // Remove the last digit
        }
        return sum;
	}
	
	public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();

        // Calculate the sum of digits using Java 8 Streams
        int sum = numberStr.chars()                  // Create an IntStream of characters
                           .map(Character::getNumericValue)  // Convert each character to its numeric value
                           .sum();                         // Sum all the numeric values

        // Output the result
        System.out.println("Sum of the digits: " + sum);
		Integer sumOfNaturalNos = sumOfNaturalNos();
		System.out.println(sumOfNaturalNos);
		int sumOfDigit = sumOfDigit(sumOfNaturalNos);
		System.out.println(sumOfDigit);

        // Close the scanner
        scanner.close();
    }

}
