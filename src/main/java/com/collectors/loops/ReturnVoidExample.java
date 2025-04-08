package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class ReturnVoidExample {

    // Method to print a message and exit the method early using return
    public static void printMessage(String message) {
        if (message == null || message.isEmpty()) {
            System.out.println("No message provided!");
            return; // Exiting early if the message is empty or null
        }
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        printMessage(""); // Will print "No message provided!"
        printMessage("Hello, Java!"); // Will print "Message: Hello, Java!"
    }
}

