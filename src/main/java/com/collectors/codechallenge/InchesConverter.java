package com.collectors.codechallenge;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */

public class InchesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input in inches
        System.out.print("Enter value in inches: ");
        double inches = scanner.nextDouble();

        // Conversion logic
        double centimeters = inches * 2.54;
        double feet = inches / 12;
        double meters = centimeters / 100;
        double millimeters = centimeters * 10;

        // Display results
        System.out.println("\nConverted Values:");
        System.out.printf("Centimeters: %.2f cm\n", centimeters);
        System.out.printf("Feet: %.2f ft\n", feet);
        System.out.printf("Meters: %.2f m\n", meters);
        System.out.printf("Millimeters: %.2f mm\n", millimeters);

        scanner.close();
    }
}
