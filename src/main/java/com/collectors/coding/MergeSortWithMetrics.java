package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class MergeSortWithMetrics {

    // Merge Sort main function
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1) {
            array[k++] = L[i++];
        }

        while (j < n2) {
            array[k++] = R[j++];
        }
    }

    // Driver method
    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Original array:");
        printArray(array);

        // Measure start time and memory
        long startTime = System.nanoTime();
        long startMemory = getUsedMemory();

        // Perform Merge Sort
        mergeSort(array, 0, array.length - 1);

        // Measure end time and memory
        long endTime = System.nanoTime();
        long endMemory = getUsedMemory();

        System.out.println("\nSorted array:");
        printArray(array);

        // Display time and space metrics
        long durationNano = endTime - startTime;
        double durationMs = durationNano / 1_000_000.0;

        long memoryUsedBytes = endMemory - startMemory;
        double memoryUsedKB = memoryUsedBytes / 1024.0;

        System.out.printf("\nTime taken: %.3f ms\n", durationMs);
        System.out.printf("Memory used: %.2f KB\n", memoryUsedKB);
    }

    public static void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    // Get current memory usage
    public static long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();  // Hint GC to get more accurate result
        return runtime.totalMemory() - runtime.freeMemory();
    }
}
