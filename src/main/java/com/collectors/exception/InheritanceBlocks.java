package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

class Parent {
    static {
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent non-static block");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child non-static block");
    }

    public Child() {
        System.out.println("Child constructor");
    }
}

public class InheritanceBlocks {
    public static void main(String[] args) {
        System.out.println("Main starts");
        Child c = new Child();
    }
}
