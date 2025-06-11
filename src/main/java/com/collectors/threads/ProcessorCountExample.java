package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */

public class ProcessorCountExample {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of available processors (cores): " + cores);
    }
}
