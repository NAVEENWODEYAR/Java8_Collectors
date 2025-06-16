package com.collectors.arrList;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class SafeIterationWithTryCatch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String item = it.next();
                if (item.equals("B")) {
                    it.remove();  // ✅ Safe removal
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught ConcurrentModificationException: " + e);
        }

        System.out.println("Final List: " + list);
    }
}
