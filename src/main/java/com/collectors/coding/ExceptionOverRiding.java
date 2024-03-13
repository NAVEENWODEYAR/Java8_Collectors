package com.collectors.coding;

import javax.management.RuntimeErrorException;
// Parent class with NullPointerException,
class Parent{
	public void test() throws NullPointerException{
	    System.out.println("Parent Class");
	    throw new NullPointerException("NullPointerException in Parent class,");
	}
}
class Child extends Parent{
    @Override
    public void test() throws RuntimeException{
	System.out.println("Child class");
	throw new RuntimeException("RuntimeException,");
    }
}
public class ExceptionOverRiding extends Parent{

    public static void main(String[] args) {
	new Child().test();
    }  
}
