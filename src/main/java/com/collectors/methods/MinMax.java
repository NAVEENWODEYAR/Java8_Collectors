
package com.collectors.methods;

import java.util.*;
/**
 * @author Naveen K Wodeyar
 *
 */
public class MinMax {

	static void maxLength() {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Optional<String> max = stationeryList.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());
	}
	public static void main(String[] str) {
		maxLength();
	}
}
