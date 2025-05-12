package com.collectors.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author NaveenWodeyar
 *
 */

class WriteTask implements Runnable {
    private final String fileName;
    private final String content;

    public WriteTask(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    public synchronized void run() {
        try (FileWriter writer = new FileWriter(fileName, true)) { // append mode
            writer.write(content + "\n");
            System.out.println(Thread.currentThread().getName() + " wrote to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class ConcurrentFileWrit {
    public static void main(String[] args) {
        String fileName = "output.txt";

        Thread t1 = new Thread(new WriteTask(fileName, "Line from thread 1"));
        Thread t2 = new Thread(new WriteTask(fileName, "Line from thread 2"));
        Thread t3 = new Thread(new WriteTask(fileName, "Line from thread 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}

