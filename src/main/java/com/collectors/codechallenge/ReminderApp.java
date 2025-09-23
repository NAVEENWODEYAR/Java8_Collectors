package com.collectors.codechallenge;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author NaveenWodeyar
 *
 */

public class ReminderApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get reminder message
        System.out.print("Enter your reminder message: ");
        String message = scanner.nextLine();

        // Get delay time in seconds
        System.out.print("Set reminder after how many seconds? ");
        int delayInSeconds = scanner.nextInt();

        // Create TimerTask
        TimerTask reminderTask = new TimerTask() {
            public void run() {
                System.out.println("Reminder: " + message);
            }
        };

        // Schedule task
        Timer timer = new Timer();
        timer.schedule(reminderTask, delayInSeconds * 1000);

        System.out.println("Reminder set! You'll be notified in " + delayInSeconds + " seconds.");
    }
}
