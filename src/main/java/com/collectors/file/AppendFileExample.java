package com.collectors.file;

import java.io.*;

/**
 * @author NaveenWodeyar
 *
 */

public class AppendFileExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("git.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.newLine();
            bw.write("Git is a distributed version control system, meaning it keeps track of changes made to files over time, allowing multiple developers to work on the same project simultaneously and safely. It's used primarily in software development to manage source code and collaborative workflows.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

