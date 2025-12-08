package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */
public class BikeSpeedSuggester {

    /**
     * Suggests a suitable bike speed based on its weight.
     * 
     * @param weight The weight of the bike in kilograms.
     * @return Suggested cruising speed in km/h.
     * @throws IllegalArgumentException if weight is not positive.
     */
    public static double suggestSpeed(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive.");
        }

        double suggestedSpeed;

        if (weight < 100) {
            suggestedSpeed = 120;
        } else if (weight < 150) {
            suggestedSpeed = 100;
        } else if (weight < 200) {
            suggestedSpeed = 80;
        } else {
            suggestedSpeed = 60;
        }

        return suggestedSpeed;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the bike's weight in kilograms: ");
        double weight = scanner.nextDouble();

        try {
            double speed = suggestSpeed(weight);
            System.out.println("Suggested cruising speed: " + speed + " km/h");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
