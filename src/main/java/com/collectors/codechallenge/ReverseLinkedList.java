
package com.collectors.codechallenge;

import java.util.*;
/**
 * @author Naveen K Wodeyar
 * @date 15/06/2024
 *
 */
public class ReverseLinkedList {

	static void lnkList(List<Integer> list){
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
						list.add(5);
						list.add(1);
						list.add(4);
						list.add(2);
		lnkList(list);
	}

}
