package com.collectors.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author NaveenWodeyar
 *
 */

public class NioFileMoveExample {
    public static void main(String[] args) {
        Path source = Paths.get("oldfile.txt");
        Path destination = Paths.get("newfile.txt");
        try {
            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);  // Move file
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
