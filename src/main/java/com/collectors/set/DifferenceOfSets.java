package com.collectors.set;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class DifferenceOfSets {

	public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.removeAll(set2); // Difference operation
        System.out.println(set1); // Output: [1]
    }
}
