package com.collectors.ternary;

/**
 * @author NaveenWodeyar
 *
 */

public class IfElseTrick {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5)
            if (x < 20)
                System.out.println("x is between 5 and 20");
            else
                System.out.println("x is not greater than 5");
    }
}
