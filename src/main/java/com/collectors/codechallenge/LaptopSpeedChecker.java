/**
 * 
 */
package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

public class LaptopSpeedChecker {

    public static void main(String[] args) {
        System.out.println("===== Laptop Performance Info =====");
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory (MB): " + Runtime.getRuntime().freeMemory() / (1024 * 1024));
        System.out.println("Total memory (MB): " + Runtime.getRuntime().totalMemory() / (1024 * 1024));
        System.out.println("Max memory (MB): " + Runtime.getRuntime().maxMemory() / (1024 * 1024));

        // Try to get OS details
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));
    }
}
