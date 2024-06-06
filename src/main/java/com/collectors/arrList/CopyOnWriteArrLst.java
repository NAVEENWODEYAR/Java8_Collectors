
package com.collectors.arrList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrLst {

	public class Main {
	    public static void main(String[] args) {
	        // Create a CopyOnWriteArrayList
	        List<String> list = new CopyOnWriteArrayList<>();

	        // Add elements to the list
	        list.add("One");
	        list.add("Two");
	        list.add("Three");

	        // Iterate over the list
	        System.out.println("List contents:");
	        for (String s : list) {
	            System.out.println(s);
	        }

	        // Modify the list while iterating
	        System.out.println("\nModifying list during iteration:");
	        for (String s : list) {
	            System.out.println(s);
	            if (s.equals("Two")) {
	                list.add("Four");
	            }
	        }

	        // Print the list again to see the changes
	        System.out.println("\nList contents after modification:");
	        for (String s : list) {
	            System.out.println(s);
	        }
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
