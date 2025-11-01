package com.collectors.codechallenge;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */


public class BikeSpeedSuggester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bike's weight in kilograms: ");
        double weight = scanner.nextDouble();

        double suggestedSpeed;

        if (weight < 100) {
            suggestedSpeed = 120; // lightweight bike
        } else if (weight < 150) {
            suggestedSpeed = 100; // medium bike
        } else if (weight < 200) {
            suggestedSpeed = 80;  // heavy bike
        } else {
            suggestedSpeed = 60;  // very heavy bike
        }

        System.out.println("Suggested cruising speed: " + suggestedSpeed + " km/h");

        scanner.close();
    }
}
