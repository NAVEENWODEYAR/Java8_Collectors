package com.collectors.coding;

/**
 * @author Naveen K Wodeyar
 * @date 25-02-2024,
 * @System.exit() is a method used to terminate the Java Virtual Machine (JVM) and stop the running application. It takes a single argument, an integer status code, which is typically used to indicate the reason for the termination.
 */

public class SystemExit {

    static void roundOf() {
        int a = 0;
        int b = 0;

        // Start time & memory
        long startTime = System.nanoTime();
        long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        try {
            int sum = a + b;
            long rounded = Math.round(sum);
            System.out.println("roundOf(): a = " + a + ", b = " + b + ", a + b = " + sum + ", Math.round(a + b) = " + rounded);
            System.exit(1);
        } catch (Exception e) {
            System.out.println("Exception in roundOf()");
            e.printStackTrace();
        } finally {
            System.out.println("roundOf(): Inside finally block.");
        }

        // End time & memory
        long endTime = System.nanoTime();
        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long elapsedTime = endTime - startTime;
        long memoryUsed = afterUsedMem - beforeUsedMem;

        System.out.println("roundOf() Time taken (ns): " + elapsedTime);
        System.out.println("roundOf() Memory used (bytes): " + memoryUsed);
    }

    static void roudOfSum() {
        int a = 2;
        float b = 1.8f;

        // Start time & memory
        long startTime = System.nanoTime();
        long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        try {
            float sum = a + b;
            int rounded = Math.round(sum);
            System.out.println("roudOfSum(): a = " + a + ", b = " + b + ", a + b = " + sum + ", Math.round(a + b) = " + rounded);
        } catch (Exception e) {
            double diff = a - b;
            System.out.println("Exception in roudOfSum(): Math.ceil(a - b) = " + Math.ceil(diff));
        } finally {
            System.out.println("roudOfSum(): Inside finally block.");
        }

        // End time & memory
        long endTime = System.nanoTime();
        long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        long elapsedTime = endTime - startTime;
        long memoryUsed = afterUsedMem - beforeUsedMem;

        System.out.println("roudOfSum() Time taken (ns): " + elapsedTime);
        System.out.println("roudOfSum() Memory used (bytes): " + memoryUsed);
    }

    public static void main(String[] args) {
        roundOf();
        System.out.println("------------------------------------------------");
        roudOfSum();
    }
}
