package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class StringPool {
    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        String c = b.intern();

        System.out.println(a == b); // false
        System.out.println(a == c); // true
    }
}
