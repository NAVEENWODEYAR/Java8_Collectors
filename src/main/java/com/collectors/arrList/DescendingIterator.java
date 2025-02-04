package com.collectors.arrList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author NaveenWodeyar
 *
 */

public class DescendingIterator {

	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
      
        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JDBC"); 
        System.out.println(list); 
        
        Iterator<String> it = list.descendingIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

	}

}
