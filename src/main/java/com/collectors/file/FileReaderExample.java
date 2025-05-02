package com.collectors.file;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author NaveenWodeyar
 *
 */

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("git.txt")) {
            int content;
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content); // Print character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
