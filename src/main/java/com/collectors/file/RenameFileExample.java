package com.collectors.file;

import java.io.File;

/**
 * @author NaveenWodeyar
 *
 */

public class RenameFileExample {
    public static void main(String[] args) {
        File oldFile = new File("oldfile.txt");
        File newFile = new File("newfile.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
