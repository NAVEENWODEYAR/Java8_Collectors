package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5};
        int newLength = removeDuplicates(arr);
        System.out.println("Array without duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int length = 1;
        for (int i = 1; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[length++] = arr[i];
            }
        }
        return length;
    }
}
