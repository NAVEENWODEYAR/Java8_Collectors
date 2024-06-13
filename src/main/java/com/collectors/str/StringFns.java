
package com.collectors.str;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 13/06/2024
 *
 */
public class StringFns {
	static String st = new String("India");
	
	static void strRev() {
//		 st.chars().mapToObj(c->(char)c).sorted(Comparator.reverseOrder()).forEach(System.out::print);
		 String collect = IntStream.rangeClosed(1, st.length()).mapToObj(c->st.charAt(st.length()-c)).map(Object::toString).collect(Collectors.joining());
		 System.out.println(collect);
		 
		 String st = "String";
		 String collect2 = Arrays.stream(st.split("")).collect(Collectors.collectingAndThen(Collectors.toList(), list->{Collections.reverse(list);return list.stream();})).collect(Collectors.joining());
		 System.out.println(collect2);
		 
		 //using StringBuilder(),
		 StringBuilder sb = new StringBuilder(st);
		 System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		strRev();
	}

}
