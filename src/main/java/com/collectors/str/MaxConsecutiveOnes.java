package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int num : nums) {
            count = (num == 1) ? count + 1 : 0;
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(arr));
    }
}

