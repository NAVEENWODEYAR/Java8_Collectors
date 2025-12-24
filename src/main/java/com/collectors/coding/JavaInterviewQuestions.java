package com.collectors.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class JavaInterviewQuestions {

    public static void main(String[] args) {

        List<String> questions = new ArrayList<>();

        questions.add("1. Reverse a string without using built-in methods");
        questions.add("2. Check if a number is a palindrome");
        questions.add("3. Find the factorial of a number");
        questions.add("4. Check if a number is prime");
        questions.add("5. Find the Fibonacci series up to N terms");
        questions.add("6. Find the largest and smallest number in an array");
        questions.add("7. Remove duplicate elements from an array");
        questions.add("8. Find the second largest number in an array");
        questions.add("9. Count the occurrence of characters in a string");
        questions.add("10. Sort an array without using built-in sort");
        questions.add("11. Swap two numbers without using a third variable");
        questions.add("12. Check if two strings are anagrams");
        questions.add("13. Find missing number in an array");
        questions.add("14. Reverse a linked list");
        questions.add("15. Implement Singleton class");

        System.out.println("Most Asked Java Interview Coding Questions:\n");

        for (String question : questions) {
            System.out.println(question);
        }
    }
}
