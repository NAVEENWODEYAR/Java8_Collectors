package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};

        int slow = nums[0];
        int fast = nums[0];

        // First loop to find intersection point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Second loop to find entrance to cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        System.out.println("Duplicate: " + slow);
    }
}

