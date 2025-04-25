package com.collectors.numbers;

import java.util.*;

/**
 * @author NaveenWodeyar
 *
 */

public class AutoboxingCast {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(100); // int → Integer → Object

        try {
            String str = (String) list.get(0); // Wrong cast
        } catch (ClassCastException e) {
            System.out.println("Autoboxing trap: " + e.getMessage());
        }
    }
}
