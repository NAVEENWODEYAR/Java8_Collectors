package com.collectors.file;

import java.io.File;

/**
 * @author NaveenWodeyar
 *
 */

public class ListFilesExample {
    public static void main(String[] args) {
        File directory = new File("path/to/directory");
        String[] fileList = directory.list();
        if (fileList != null) {
            for (String file : fileList) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory is empty or does not exist.");
        }
    }
}
