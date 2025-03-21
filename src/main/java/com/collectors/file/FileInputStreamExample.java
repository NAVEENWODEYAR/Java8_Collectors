package com.collectors.file;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author NaveenWodeyar
 *
 */

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("input.txt")) {
            int content;
            while ((content = fileInputStream.read()) != -1) {
                System.out.print((char) content); // Print byte as character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

