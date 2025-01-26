package com.collectors.arrList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author NaveenWodeyar
 *
 */

public class ArrList {

	static void arrEx() { 
		System.out.println("\nArray\n");
		String[] strArr = new String[10];//declaration
		try {
			System.out.println("strArr "+strArr[strArr.length]);
		} catch (Exception e) {
			System.out.println("Exception "+e.getLocalizedMessage());
		}
		
		int a[]={33,3,4,5};//declaration, instantiation and initialization  
		System.out.println("Accessing the elements of array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	static void anonymousArray(String[] strArr) {
		System.out.println("\nAnonymous Array");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\n Re-sizable array with Default initial capacity 10 & Load Factor 0.75F\n");
		arrEx();
		List<String> arrList = new ArrayList<String>(20);
		System.out.println(arrList.size());
		arrList.add("1");
		arrList.add("2");
		System.out.println("First Element:"+arrList.getFirst()+"  "+arrList);
		arrList.remove(arrList.size()-1);
		arrList.add(arrList.size()-1, null);
		System.out.println(arrList.toString());
		System.out.println("\n####\n");
		anonymousArray(new String[]{"One","Two","Three","Four"});
	}

}
