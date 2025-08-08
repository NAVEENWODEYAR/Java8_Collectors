package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

public class PerformanceUtil {

    @FunctionalInterface
    public interface CodeBlock {
        void run();
    }

    public static void measurePerformance(CodeBlock codeBlock) {
        // Start time
        long startTime = System.nanoTime();

        // Start memory
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest GC to get more accurate memory usage
        long startMemory = runtime.totalMemory() - runtime.freeMemory();

        // Run the provided code
        codeBlock.run();

        // End time
        long endTime = System.nanoTime();

        // End memory
        long endMemory = runtime.totalMemory() - runtime.freeMemory();

        // Results
        long timeTakenNano = endTime - startTime;
        double timeTakenMillis = timeTakenNano / 1_000_000.0;
        long memoryUsedBytes = endMemory - startMemory;
        double memoryUsedKB = memoryUsedBytes / 1024.0;
        double memoryUsedMB = memoryUsedKB / 1024.0;

        // Output
        System.out.println("=== Performance Report ===");
        System.out.printf("Time taken: %d ns (%.3f ms)%n", timeTakenNano, timeTakenMillis);
        System.out.printf("Memory used: %d bytes (%.3f KB / %.6f MB)%n", 
                          memoryUsedBytes, memoryUsedKB, memoryUsedMB);
        System.out.println("==========================");
    }
}
