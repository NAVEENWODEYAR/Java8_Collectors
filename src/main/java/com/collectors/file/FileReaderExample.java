package com.collectors.file;

/**
 * @author NaveenWodeyar
 *
 */
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("input.txt")) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content); // Print character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
