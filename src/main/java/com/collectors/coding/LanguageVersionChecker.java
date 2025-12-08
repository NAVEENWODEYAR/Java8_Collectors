package com.collectors.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author NaveenWodeyar
 *
 */

public class LanguageVersionChecker {

    public static void main(String[] args) {

        // List of languages and the commands used to get their version information
        String[][] commands = {
                {"Java", "java", "-version"},
                {"Python", "python", "--version"},
                {"Python3", "python3", "--version"},
                {"Node.js", "node", "--version"},
                {"GCC", "gcc", "--version"},
                {"Go", "go", "version"},
                {"Ruby", "ruby", "--version"},
                {"PHP", "php", "--version"},
                {"Perl", "perl", "--version"}
        };

        for (String[] cmd : commands) {
            System.out.println("\nChecking " + cmd[0] + " version:");
            runCommand(cmd[1], cmd[2]);
        }
    }

    // Execute the version command and print the result
    private static void runCommand(String command, String versionArg) {
        try {
            ProcessBuilder pb = new ProcessBuilder(command, versionArg);
            pb.redirectErrorStream(true); // Combine standard error & output

            Process process = pb.start();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();

        } catch (Exception e) {
            System.out.println("Error executing command: " + e.getMessage());
        }
    }
}
