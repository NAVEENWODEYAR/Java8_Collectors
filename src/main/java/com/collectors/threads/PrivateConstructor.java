package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */
public class PrivateConstructor {

    private PrivateConstructor() {
        System.out.println("This is private");
    }

    public static void getInstance() {
        new PrivateConstructor(); // allowed inside class
    }
}

 class AccessPrivate {
    public static void main(String[] args) {
        // new Secret(); // ❌ Error
    	PrivateConstructor.getInstance(); // ✅ Works
    }
}
