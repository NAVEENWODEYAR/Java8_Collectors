
package com.collectors.arrList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * @author Naveen K Wodeyar
 * @apiNote,find the most repeated element in an array
 *
 */
public class MostRepeatedElement {

    static List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

	static void freqOfElement() {
		Map<String, Long> collect = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	public static void main(String[] args) {

	}

}
