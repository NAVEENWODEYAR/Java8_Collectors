package com.collectors.coding;

/**
 * Program to compare gold prices from starting years
 * 
 * @author Naveen K Wodeyar
 * @date 06-Jan-2026
 */

public class GoldPriceComparison {

    public static void main(String[] args) {

        // Years
        int[] years = {2010, 2015, 2020, 2023, 2025};

        // Gold prices per 10 grams (example values in INR)
        double[] goldPrices = {18500, 26343, 48651, 60000, 65000};

        System.out.println("Year\tGold Price (per 10g)\tIncrease from Previous Year");

        for (int i = 0; i < years.length; i++) {
            if (i == 0) {
                System.out.println(years[i] + "\t" + goldPrices[i] + "\t\t\t---");
            } else {
                double increase = goldPrices[i] - goldPrices[i - 1];
                System.out.println(years[i] + "\t" + goldPrices[i] + "\t\t\t" + increase);
            }
        }

        // Compare starting year with latest year
        double totalIncrease = goldPrices[goldPrices.length - 1] - goldPrices[0];
        double percentageIncrease = (totalIncrease / goldPrices[0]) * 100;

        System.out.println("\nComparison Summary:");
        System.out.println("Starting Year : " + years[0]);
        System.out.println("Ending Year   : " + years[years.length - 1]);
        System.out.println("Total Increase: " + totalIncrease);
        System.out.println("Percentage Growth: " + String.format("%.2f", percentageIncrease) + "%");
    }
}
