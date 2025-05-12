package com.collectors.file;

import java.io.*;
import java.util.*;


public class DetectDuplicateLines {
    public static void main(String[] args) {
        Set<String> uniqueLines = new HashSet<>();
        Set<String> duplicateLines = new LinkedHashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!uniqueLines.add(line)) {
                    duplicateLines.add(line);
                }
            }

            System.out.println("Duplicate lines:");
            duplicateLines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
