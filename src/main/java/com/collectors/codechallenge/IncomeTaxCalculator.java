package com.collectors.codechallenge;

import java.util.Scanner;

/**
 * @author NaveenWodeyar
 *
 */

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get salary input
        System.out.print("Enter your annual salary (in ₹): ");
        double salary = scanner.nextDouble();

        double tax = calculateIncomeTax(salary);

        System.out.println("Your calculated income tax is: ₹" + tax);
    }

    // Method to calculate income tax based on slabs
    public static double calculateIncomeTax(double income) {
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.20;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
        }

        return tax;
    }
}
