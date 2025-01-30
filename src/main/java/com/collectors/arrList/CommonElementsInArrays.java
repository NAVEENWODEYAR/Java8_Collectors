package com.collectors.arrList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Naveen K Wodeyar
 * @date 31/05/2024
 *
 */

public class CommonElementsInArrays {
	
	 static List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
     
     static List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
     
     List<String> list3 = new CopyOnWriteArrayList<>();
     		
	static void commonElements() {
		list1.stream().filter(list2::contains).forEach(System.out::println);
	}

	public static void main(String[] args) {
		commonElements();
	}

}
