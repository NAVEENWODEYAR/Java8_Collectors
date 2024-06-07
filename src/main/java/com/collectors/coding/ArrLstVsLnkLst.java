package com.collectors.coding;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 21/05/2024
 *
 */
public class ArrLstVsLnkLst {
	
	static void arrLst() {
		List<Integer> intList = new ArrayList<>();
						intList.add(0);
						intList.add(1);
						intList.add(3);
						intList.add(2);
						intList.add(4);
		System.out.println(intList);
		lnkLst();
	}
	
	static void lnkLst() {
		List<Integer> intList = new LinkedList<>();
						intList.add(0);
						intList.add(1);
						intList.add(3);
						intList.add(2);
						intList.add(4);
		System.out.println("\n"+intList+"\n");

	}
	
	public static void main(String[] args) {
		arrLst();
	}

}
