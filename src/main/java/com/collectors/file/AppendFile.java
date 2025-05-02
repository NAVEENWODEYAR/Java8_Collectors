package com.collectors.file;

import java.io.*;

/**
 * @author NaveenWodeyar
 *
 */

public class AppendFile {
    public static void main(String[] args) {
        String filePath = "output.txt";
        File file = new File(filePath);

        // 1. Check if file exists
        if (!file.exists()) {
            System.out.println("File does not exist. Creating new file.");
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Failed to create file.");
                e.printStackTrace();
                return;
            }
        } else {
            System.out.println("File exists.");
        }

        // Print the absolute file path
        System.out.println("File Path: " + file.getAbsolutePath());

        // 2. Read and show current contents
        System.out.println("\n--- Existing File Contents ---");
        readAndPrintFile(filePath);

        // 3. Append to the file
        try (FileWriter fw = new FileWriter(filePath, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.newLine();
            bw.write("This is an appended line.");
        } catch (IOException e) {
            System.err.println("Error while appending to file.");
            e.printStackTrace();
        }

        // 4. Read and show updated contents
        System.out.println("\n--- Updated File Contents ---");
        readAndPrintFile(filePath);
    }

    // Utility method to read and print the contents of a file
    private static void readAndPrintFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isEmpty = true;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                isEmpty = false;
            }
            if (isEmpty) {
                System.out.println("[File is empty]");
            }
        } catch (IOException e) {
            System.err.println("Error while reading file.");
            e.printStackTrace();
        }
    }
}

