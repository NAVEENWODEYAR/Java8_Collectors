package com.collectors.arrList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class ReverseArray {
	
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy HH:mm");
	
	static void revrseArrayList(List<Integer> list){
		System.out.println("\n"+LocalDateTime.now().format(formatter));
		System.out.println("Original list: "+list);
		Collections.reverse(list);
		System.out.println("\nReversed list: "+list);
	}
	
	public static void main(String[] args) {
		revrseArrayList(new ArrayList<Integer>(Arrays.asList(2,4,6,8,1,3,5,7,9)));
	}

}
