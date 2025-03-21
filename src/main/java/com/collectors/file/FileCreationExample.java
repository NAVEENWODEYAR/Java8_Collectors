package com.collectors.file;

import java.io.File;
import java.io.IOException;

/**
 * @author NaveenWodeyar
 *
 */

public class FileCreationExample {
    public static void main(String[] args) {
        File file = new File("newfile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
