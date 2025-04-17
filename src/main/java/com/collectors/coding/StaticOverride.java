package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

class Tata {
    static void sayHi() {
        System.out.println("Hi from Parent");
    }
}

class Appa extends Tata {
    static void sayHi() {
        System.out.println("Hi from Child");
    }
}

public class StaticOverride {
    public static void main(String[] args) {
        Tata t = new Appa();
        t.sayHi(); 
    }
}
