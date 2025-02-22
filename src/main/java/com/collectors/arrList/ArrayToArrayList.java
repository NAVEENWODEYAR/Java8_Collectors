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

public class ArrayToArrayList {

	// Define the desired format
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMyyyy HH:mm");

	static void arrToArayList(LocalDateTime time) {
		String formattedTime = time.format(formatter);
		System.out.println(formattedTime);

		String array[] = new String[] { "Java", "Docker", "Kubernates" };
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
		System.out.println("\n" + time);
		System.out.println("\nArray: " + Arrays.toString(array));
		System.out.println("\nArrayList: " + arrayList);
		System.out.println("\nCollections.addAll(): " + Collections.addAll(arrayList, array));
		ArrayList<Object> arrayList2 = new ArrayList<>();
		arrayList2.addAll(Arrays.asList(array));
		System.out.println("\nArrayList.addAll(): " + arrayList2);
		System.out.println("\nUsing streams");
		List<String> list = Arrays.stream(array).toList();
		System.out.println(list);
	}

	static void listToArray(List<String> list) {
		System.out.println("\n" + LocalDateTime.now().format(formatter));
		System.out.println("\nArraylist to Array");
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		System.out.println("\n####\n");
		arrToArayList(LocalDateTime.now());
		listToArray(new ArrayList<String>(Arrays.asList("ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF")));
	}

}
