package com.collectors.arrList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class ArrList {

	static void arrEx() {
		System.out.println("/nArray/n");
		String[] strArr = new String[10];
		
	}
	
	public static void main(String[] args) {
		System.out.println("/n Re-sizable array with Default initial capacity 10 & Load Factor 0.75F/n");
		
		List<String> arrList = new ArrayList<String>(20);
		System.out.println(arrList.size());
		arrList.add("1");
		arrList.add("2");
		System.out.println("First Element:"+arrList.getFirst()+"  "+arrList);
		arrList.remove(arrList.size()-1);
		arrList.add(arrList.size()-1, null);
		System.out.println(arrList.toString());
	}

}
