package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class LogicalBracketsDemo {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;
        boolean isVIP = false;
        boolean hasInvitation = true;

        // Example 1: Without brackets – relies on operator precedence
        if (age >= 18 && hasID || isVIP)
            System.out.println("Allowed entry (no brackets)"); // TRUE, but logic may be misleading

        // Example 2: With proper grouping using brackets
        if ((age >= 18 && hasID) || isVIP)
            System.out.println("Allowed entry (correct grouping)"); // More explicit and clear

        // Example 3: Change grouping logic
        if (age >= 18 && (hasID || isVIP))
            System.out.println("Allowed entry (alternative logic)"); // Different meaning!

        // Example 4: More complex condition
        if ((age >= 18 && hasID) || (isVIP && hasInvitation)) {
            System.out.println("Allowed due to age & ID OR VIP & invitation");
        }

        // Example 5: Dangerous example – without brackets, could misinterpret logic
        if (age >= 18 && hasID || isVIP && hasInvitation)
            System.out.println("WARNING: Ambiguous logic without brackets");
    }
}

