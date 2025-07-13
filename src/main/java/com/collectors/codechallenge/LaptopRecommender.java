package com.collectors.codechallenge;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class LaptopRecommender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double budget = getBudget(scanner);
            String usageType = getUsageType(scanner);

            LaptopRecommendation recommendation = recommendLaptop(budget, usageType);

            System.out.println("\n=== Recommended Laptop ===");
            System.out.println("Usage Type     : " + usageType);
            System.out.println("Budget         : ₹" + budget);
            System.out.println("Recommendation : " + recommendation.model);
            System.out.println("Specs          : " + recommendation.specs);
            System.out.println("Remarks        : " + recommendation.remarks);

        } catch (InputMismatchException e) {
            System.err.println("Invalid input! Please enter correct values.");
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double getBudget(Scanner scanner) {
        System.out.print("Enter your maximum budget (₹): ");
        return scanner.nextDouble();
    }

    private static String getUsageType(Scanner scanner) {
        System.out.println("Select your primary usage:");
        System.out.println("1. Office Work");
        System.out.println("2. Programming");
        System.out.println("3. Gaming");
        System.out.println("4. Student");
        System.out.println("5. Content Creation (Video/Graphics)");
        System.out.print("Enter option (1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        return switch (choice) {
            case 1 -> "Office Work";
            case 2 -> "Programming";
            case 3 -> "Gaming";
            case 4 -> "Student";
            case 5 -> "Content Creation";
            default -> throw new IllegalArgumentException("Invalid usage option");
        };
    }

    private static LaptopRecommendation recommendLaptop(double budget, String usageType) {
        LaptopRecommendation recommendation = new LaptopRecommendation();

        if (budget < 30000) {
            recommendation.model = "Entry-Level Laptop";
            recommendation.specs = "Intel Celeron / 4GB RAM / 256GB SSD";
            recommendation.remarks = "Basic tasks only (Docs, browsing)";
            return recommendation;
        }

        switch (usageType) {
            case "Office Work" -> {
                if (budget < 40000)
                    recommendation.set("Lenovo IdeaPad Slim 3", "Intel i3, 8GB RAM, 256GB SSD", "Great for MS Office, emails.");
                else if (budget < 60000)
                    recommendation.set("HP 15s", "Intel i5, 16GB RAM, 512GB SSD", "Smooth multitasking, Teams/Zoom ready.");
                else
                    recommendation.set("Dell Inspiron 14", "Intel i7, 16GB RAM, 1TB SSD", "Powerful office performer.");
            }

            case "Programming" -> {
                if (budget < 40000)
                    recommendation.set("Acer Aspire 3", "Ryzen 3, 8GB RAM, 256GB SSD", "Entry dev tasks, coding practice.");
                else if (budget < 65000)
                    recommendation.set("ASUS Vivobook", "Intel i5, 16GB RAM, 512GB SSD", "Great for Java, Python, VS Code.");
                else
                    recommendation.set("MacBook Air M1", "8GB RAM, 256GB SSD", "Excellent battery & performance.");
            }

            case "Gaming" -> {
                if (budget < 55000)
                    recommendation.set("Avoid gaming laptops under ₹55,000", "Not recommended", "Raise budget or go refurbished.");
                else if (budget < 80000)
                    recommendation.set("HP Victus", "Intel i5, 16GB RAM, RTX 3050", "Good for 1080p gaming.");
                else
                    recommendation.set("ASUS ROG / Lenovo Legion", "i7/Ryzen 7, RTX 3060 or above", "High FPS gaming & streaming.");
            }

            case "Student" -> {
                if (budget < 35000)
                    recommendation.set("Avita Pura / Infinix", "Intel Celeron / 8GB RAM", "Basic browsing & online classes.");
                else if (budget < 55000)
                    recommendation.set("Acer Aspire 5", "i5, 8GB RAM, 512GB SSD", "Great for projects and study.");
                else
                    recommendation.set("Lenovo Slim 5", "i5/i7, 16GB RAM", "Smooth for multitasking & future-proof.");
            }

            case "Content Creation" -> {
                if (budget < 60000)
                    recommendation.set("Not suitable", "Need at least i5 + 16GB RAM + GPU", "Raise budget for smooth editing.");
                else if (budget < 90000)
                    recommendation.set("Acer Nitro 5", "i5/i7, 16GB RAM, RTX 3050", "Good for video editing/photoshop.");
                else
                    recommendation.set("MacBook Pro M2", "Unified 16GB RAM, 512GB SSD", "Excellent for Final Cut Pro & Adobe tools.");
            }

            default -> recommendation.set("Unknown", "Specs not available", "Invalid usage type.");
        }

        return recommendation;
    }

    // Inner class to hold recommendation details
    static class LaptopRecommendation {
        String model;
        String specs;
        String remarks;

        void set(String model, String specs, String remarks) {
            this.model = model;
            this.specs = specs;
            this.remarks = remarks;
        }
    }
}
