package com.collectors.codechallenge;

import java.util.Scanner;

public class MentalHealthCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Mental Health Self-Assessment Tool");
        System.out.println("Please answer the following questions honestly (1 = Never, 2 = Rarely, 3 = Sometimes, 4 = Often, 5 = Always)\n");

        score += askQuestion(scanner, "1. I have been feeling down, depressed, or hopeless.");
        score += askQuestion(scanner, "2. I have little interest or pleasure in doing things.");
        score += askQuestion(scanner, "3. I feel nervous, anxious, or on edge.");
        score += askQuestion(scanner, "4. I have trouble relaxing.");
        score += askQuestion(scanner, "5. I have trouble falling or staying asleep, or sleep too much.");
        score += askQuestion(scanner, "6. I feel tired or have little energy.");
        score += askQuestion(scanner, "7. I have been feeling bad about myself—or that I am a failure.");

        // Analyze score
        System.out.println("\n--- Assessment Result ---");
        if (score <= 10) {
            System.out.println("Your responses suggest you are doing well. Keep taking care of your mental health!");
        } else if (score <= 20) {
            System.out.println("You may be experiencing mild symptoms of stress or anxiety. Consider taking breaks and practicing self-care.");
        } else if (score <= 30) {
            System.out.println("You may be experiencing moderate mental health challenges. It might help to talk to a friend or seek professional support.");
        } else {
            System.out.println("You may be experiencing significant mental health concerns. Please consider reaching out to a mental health professional.");
        }

        System.out.println("\nNote: This is not a diagnosis. For any concerns, consult a healthcare provider.");
        scanner.close();
    }

    // Method to ask a question and return the response as a score
    private static int askQuestion(Scanner scanner, String question) {
        int answer = 0;
        while (true) {
            try {
                System.out.print(question + " ");
                answer = Integer.parseInt(scanner.nextLine());
                if (answer >= 1 && answer <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return answer;
    }
}
