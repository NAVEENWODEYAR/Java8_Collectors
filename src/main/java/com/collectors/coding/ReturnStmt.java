package com.collectors.coding;

public class ReturnStmt {

    static int add(int a,int b) {
	System.out.println("return in try and catch block,");
	try {
	    System.out.println("inside try block");
	    System.exit(0);
	    return a-b;
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    return -1;
	}
	finally {
	    System.out.println("inside finally blcok,");
	}
    }
    public static void main(String[] args) {
	add(1, 1);

    }

}
