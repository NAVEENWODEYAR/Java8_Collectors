package com.collectors.java23;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 *
 */

public class ScopedValueExample {

	public static void main(String[] args) {
        var scopedValue = ScopedValue.of("Hello, Java 23!");
        
        // Inside a new thread
        var thread = new Thread(() -> {
            System.out.println(scopedValue.get());
        });
        
        thread.start();
    }
}
