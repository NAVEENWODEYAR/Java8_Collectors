package com.collectors.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author NaveenWodeyar
 *
 */

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, World!");  // Write text to file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
