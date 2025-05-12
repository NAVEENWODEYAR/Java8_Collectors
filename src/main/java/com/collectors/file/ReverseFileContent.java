package com.collectors.file;

import java.io.*;
import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ReverseFileContent {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            Collections.reverse(lines);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("reversed.txt"))) {
                for (String reversedLine : lines) {
                    writer.write(reversedLine);
                    writer.newLine();
                }
            }

            System.out.println("File reversed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
