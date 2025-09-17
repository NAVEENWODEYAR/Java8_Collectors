package com.collectors.codechallenge;

import java.util.Scanner;
import java.util.*;
/**
 * @author NaveenWodeyar
 *
 */

public class BabyNameSuggester {
    
    // Sample data
    static Map<String, Map<String, List<String>>> babyNames = new HashMap<>();

    public static void main(String[] args) {
        populateBabyNames();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Baby Name Suggester!");
        System.out.print("Enter gender (boy/girl): ");
        String gender = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter religion (Hindu/Muslim/Christian): ");
        String religion = scanner.nextLine().trim().toLowerCase();

        List<String> names = getSuggestedNames(gender, religion);

        if (names != null && !names.isEmpty()) {
            System.out.println("\nSuggested " + gender + " baby names for " + religion + ":");
            for (String name : names) {
                System.out.println(" - " + name);
            }
        } else {
            System.out.println("Sorry, no names found for the given criteria.");
        }

        scanner.close();
    }

    // Populate names
    private static void populateBabyNames() {
        // Hindu names
        Map<String, List<String>> hinduNames = new HashMap<>();
        hinduNames.put("boy", Arrays.asList("Aarav", "Vivaan", "Aditya", "Krishna"));
        hinduNames.put("girl", Arrays.asList("Aanya", "Diya", "Isha", "Lakshmi"));

        // Muslim names
        Map<String, List<String>> muslimNames = new HashMap<>();
        muslimNames.put("boy", Arrays.asList("Ayaan", "Zayan", "Ibrahim", "Omar"));
        muslimNames.put("girl", Arrays.asList("Amina", "Fatima", "Zara", "Noor"));

        // Christian names
        Map<String, List<String>> christianNames = new HashMap<>();
        christianNames.put("boy", Arrays.asList("Ethan", "Noah", "Luke", "Samuel"));
        christianNames.put("girl", Arrays.asList("Grace", "Chloe", "Faith", "Hannah"));

        babyNames.put("hindu", hinduNames);
        babyNames.put("muslim", muslimNames);
        babyNames.put("christian", christianNames);
    }

    // Get suggestions
    private static List<String> getSuggestedNames(String gender, String religion) {
        Map<String, List<String>> religionMap = babyNames.get(religion.toLowerCase());
        if (religionMap != null) {
            return religionMap.get(gender.toLowerCase());
        }
        return null;
    }
}

