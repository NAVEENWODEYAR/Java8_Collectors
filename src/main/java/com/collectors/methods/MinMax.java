
package com.collectors.methods;

import java.util.*;
/**
 * @author Naveen K Wodeyar
 *
 */
public class MinMax {

	static void maxLength() {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        String max = stationeryList.stream().max(Comparator.comparing(String::length)).get();
        Object[] array = stationeryList.parallelStream().sorted(Comparator.comparing(String::length)).distinct().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(max);
	}
	public static void main(String[] str) {
		maxLength();
	}
}
