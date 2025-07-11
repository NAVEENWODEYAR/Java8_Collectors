package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class TrickyWithExceptions {

    // Custom exception
    static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    // Recursive method with exception handling and parentheses
    public static int computeSum(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Negative input: " + n);
        }
        return (n == 0) ? 0 : n + computeSum(n - 1);
    }

    // Method to safely parse integer
    public static int safeParse(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: \"" + input + "\"");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Parentheses affect precedence
        int result1 = 10 + 5 * 2;          // 20
        int result2 = (10 + 5) * 2;        // 30
        System.out.println("Without parentheses: " + result1);
        System.out.println("With parentheses   : " + result2);

        // Input parsing with exception handling
        String input = "12a";
        int parsed = safeParse(input);
        System.out.println("Parsed input: " + parsed);

        // Exception handling demo
        try {
            int sum = computeSum(5); // Valid input
            System.out.println("Sum of 0 to 5: " + sum);

            sum = computeSum(-3); // Will throw exception
            System.out.println("Sum of 0 to -3: " + sum); // Won't reach here
        } catch (NegativeNumberException e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}

