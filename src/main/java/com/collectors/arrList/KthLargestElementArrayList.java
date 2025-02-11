package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class KthLargestElementArrayList {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 7, 10, 4, 3, 20, 15);

        int k = 4;
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(k + "th Largest Element: " + list.get(k - 1));
    }
}
