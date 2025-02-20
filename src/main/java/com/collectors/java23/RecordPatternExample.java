package com.collectors.java23;

/**
 * @author NaveenWodeyar
 *
 */

public class RecordPatternExample {

	public static void main(String[] args) {
        Object obj = new Point(10, 20);

        // Pattern matching with a record
        if (obj instanceof Point(var x, var y)) {
            System.out.println("Point x: " + x + ", y: " + y);
        }
    }

    record Point(int x, int y) {}
}
