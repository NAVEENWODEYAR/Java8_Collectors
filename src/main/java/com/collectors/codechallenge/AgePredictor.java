package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.Scanner;

public class AgePredictor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter your height in cm:");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight in kg:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your gender (M/F):");
        char gender = scanner.next().toUpperCase().charAt(0);

        // Calculate BMI
        double heightInMeters = height / 100.0;
        double bmi = weight / (heightInMeters * heightInMeters);

        // Estimate age using naive logic
        int estimatedAge = estimateAge(height, weight, bmi, gender);

        System.out.println("Estimated Age: " + estimatedAge + " years");

        scanner.close();
    }

    // Dummy estimation logic based on BMI and gender
    public static int estimateAge(double height, double weight, double bmi, char gender) {
        if (bmi < 18.5) {
            return (gender == 'M') ? 18 : 17;
        } else if (bmi < 22) {
            return (gender == 'M') ? 25 : 23;
        } else if (bmi < 27) {
            return (gender == 'M') ? 35 : 32;
        } else if (bmi < 32) {
            return (gender == 'M') ? 45 : 42;
        } else {
            return (gender == 'M') ? 55 : 50;
        }
    }
}
