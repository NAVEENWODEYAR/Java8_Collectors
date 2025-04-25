package com.collectors.numbers;

/**
 * @author NaveenWodeyar
 *
 */
public class OverflowExample {
	 static void CharToIntCast (String[] args) {
        char c = 'Z';
        int ascii = c;
        char next = (char)(ascii + 1);
        System.out.println("Original: " + c + ", ASCII: " + ascii + ", Next char: " + next);
    }
	 static void DoubleToByte() {
        double d = 130.56;
        byte b = (byte) d;  // narrowing + overflow
        System.out.println("Casted byte: " + b);  // Output will be -126
    }
    public static void main(String[] args) {
        int a = 257;
        byte b = (byte) a; // 257 % 256 = 1
        System.out.println("Overflow byte: " + b);
    }
}

