package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

public class ParamShadow {
    int x = 50;

    public void setX(int x) {
        x = x; // ambiguous: assigns parameter to itself
    }

    public static void main(String[] args) {
        ParamShadow obj = new ParamShadow();
        obj.setX(100);
        System.out.println(obj.x); // Still 50!
    }
}

