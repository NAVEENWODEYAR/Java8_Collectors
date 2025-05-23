package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class BracketDemo {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("Example 1: If without brackets");
        if (x > 0)
            System.out.println("x is positive");
            System.out.println("This line always prints (BUG!)"); // Looks like part of if-block, but isn't

        System.out.println("\nExample 2: If with correct brackets");
        if (x > 0) {
            System.out.println("x is positive");
            System.out.println("This line is also part of the if-block");
        }

        System.out.println("\nExample 3: Loop without brackets");
        for (int i = 0; i < 3; i++)
            System.out.println("Loop iteration: " + i);
            // Below line is not part of the loop (looks like it is!)
            System.out.println("Not in loop (BUG!)");

        System.out.println("\nExample 4: Nested if-else without braces");
        int y = -5;
        if (x > 0)
            if (y > 0)
                System.out.println("x and y are positive");
            else
                System.out.println("y is not positive, but is x?"); // Ambiguous else

        System.out.println("\nExample 5: Correct nested if-else with braces");
        if (x > 0) {
            if (y > 0) {
                System.out.println("x and y are positive");
            } else {
                System.out.println("y is not positive");
            }
        }

        System.out.println("\nExample 6: Recommended practice – Always use braces!");
    }
}
