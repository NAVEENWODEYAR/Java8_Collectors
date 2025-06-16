package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */


public class ConcurrentModificationWithHandling {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        try {
            for (String item : list) {
                if (item.equals("B")) {
                    list.remove(item); // ❌ Causes ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException: " + e);
        }

        System.out.println("Final List: " + list);
    }
}
