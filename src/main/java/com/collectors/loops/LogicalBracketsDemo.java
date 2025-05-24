package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class LogicalBracketsDemo {

    public static boolean isAllowedEntry(int age, boolean hasID, boolean isVIP, boolean hasInvitation) {
        // Match logic from Example 4 (best practice)
        return (age >= 18 && hasID) || (isVIP && hasInvitation);
    }

    public static void main(String[] args) {
        boolean allowed = isAllowedEntry(25, true, false, true);
        if (allowed) {
            System.out.println("Allowed entry");
        } else {
            System.out.println("Entry denied");
        }
    }
}
