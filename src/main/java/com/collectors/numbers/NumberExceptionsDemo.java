package com.collectors.numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */

public class NumberExceptionsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. NumberFormatException
            System.out.print("Enter a number as string (e.g., '123'): ");
            String numStr = scanner.nextLine();
            int parsedNumber = Integer.parseInt(numStr);
            System.out.println("Parsed number: " + parsedNumber);

            // 2. ArithmeticException
            System.out.print("Enter a number to divide 100 by: ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor;
            System.out.println("100 / " + divisor + " = " + result);

            // 3. InputMismatchException
            scanner.nextLine(); // Clear buffer
            System.out.print("Enter an integer: ");
            int userInt = scanner.nextInt();
            System.out.println("You entered: " + userInt);

            // 4. NullPointerException
            String nullValue = null;
            try {
                int fromNull = Integer.parseInt(nullValue);
                System.out.println("Parsed from null: " + fromNull);
            } catch (NullPointerException e) {
                System.err.println("NullPointerException: Cannot parse null to a number.");
            }

            // 5. ArrayIndexOutOfBoundsException
            int[] numbers = {10, 20, 30};
            System.out.print("Enter index to access (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);

        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException: Please enter a valid numeric string.");
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.err.println("InputMismatchException: Invalid input type. Please enter an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: Index is out of valid range.");
        } catch (Exception e) {
            System.err.println("General Exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed. Program terminated.");
        }
    }
}
