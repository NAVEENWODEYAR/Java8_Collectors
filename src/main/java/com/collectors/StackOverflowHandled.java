package com.collectors;

/**
 * @author NaveenWodeyar
 *
 */

public class StackOverflowHandled {

    static int depth = 0;

    public static void recursiveMethod() {
        depth++;
        System.out.println("Recursion depth: " + depth);
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught at depth: " + depth);
        }

        // This line will now be seen, because we control the stack depth
        System.out.println("Program continues after handling the error.");
    }
}

