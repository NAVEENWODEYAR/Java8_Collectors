package com.collectors.file;

import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class WriteFileNIO {
    public static void main(String[] args) {
        List<String> content = Arrays.asList("Line 1", "Line 2", "Line 3");
        try {
            Files.write(Paths.get("output.txt"), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
