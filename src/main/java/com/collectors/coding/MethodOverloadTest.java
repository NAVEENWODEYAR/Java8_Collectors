package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class MethodOverloadTest {
	public static void main(String[] args) {
        A a = new A();
        a.show(null);
    }
}

class A {
    void show(Object o) {
        System.out.println("Object");
    }

    void show(String s) {
        System.out.println("String");
    }
}