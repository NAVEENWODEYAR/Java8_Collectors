
package com.collectors.hashmap;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author Naveen K Wodeyar,
 * @date 11/06/2024,
 */
public class HashMpCls {

	static void hmMethods() {
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put("1", 1);
		hashMap.putIfAbsent("1", 2);
		hashMap.put("2",2);
		hashMap.put(new Object(), new TreeMap<>());
		
		hashMap.entrySet().forEach(System.out::println);
		
	}
	public static void main(String[] args) {
		hmMethods();
	}

}
