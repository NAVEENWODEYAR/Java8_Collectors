package com.collectors.loops;

/**
 * @author NaveenWodeyar
 *
 */

public class LoopWithMultipleVariables {
	public static void main(String[] args) {
        for (int i = 0, j = 5; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
