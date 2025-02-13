package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class MissingNumber {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 4, 5, 6);

        int n = 6; 
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : list) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}
