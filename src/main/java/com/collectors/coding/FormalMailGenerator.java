package com.collectors.coding;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class FormalMailGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect user inputs
        System.out.print("Enter HR Name: ");
        String hrName = sc.nextLine();

        System.out.print("Enter Your Full Name: ");
        String yourName = sc.nextLine();

        System.out.print("Enter Your Last Working Day (e.g., October 28, 2025): ");
        String lastWorkingDay = sc.nextLine();

        System.out.print("Enter Company Name: ");
        String companyName = sc.nextLine();

        System.out.print("Enter Your Department/Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Your Contact Number: ");
        String contact = sc.nextLine();

        System.out.print("Enter Your Employee ID (optional): ");
        String empId = sc.nextLine();

        // Generate email body
        String subject = "Follow-Up on Full and Final Settlement";
        String message = String.format("""
                Subject: %s

                Dear %s,

                I hope you are doing well.

                I am writing to follow up on my Full and Final (F&F) settlement. 
                I had resigned from my position at %s, and it has now been over 90 days 
                since my exit on %s. I would like to kindly request an update on the status 
                of my F&F settlement and the expected date of release.

                Please let me know if any further information or documentation 
                is required from my side to complete the process.

                Thank you for your time and assistance.

                Best regards,
                %s
                %s
                %s
                %s
                """, subject, hrName, companyName, lastWorkingDay, yourName,
                designation, empId.isEmpty() ? "" : "Employee ID: " + empId, contact);

        // Display the formatted email
        System.out.println("\n------------------------------");
        System.out.println("Generated Formal Email:");
        System.out.println("------------------------------");
        System.out.println(message);

        sc.close();
    }
}

