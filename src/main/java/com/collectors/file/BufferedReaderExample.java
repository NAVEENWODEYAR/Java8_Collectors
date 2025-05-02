package com.collectors.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author NaveenWodeyar
 *
 */

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("git.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Print each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
