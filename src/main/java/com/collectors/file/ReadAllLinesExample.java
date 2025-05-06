package com.collectors.file;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class ReadAllLinesExample {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("git.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

