package com.collectors.coding;

public class SystemExit1 {

    public static void main(String[] args) {
	System.out.println("System.exit()");
	int a=0;int b=0;
	try {
	    System.out.println(a+b);
	} catch (Exception e) {
	    System.out.println(e.getStackTrace());
	    System.exit(0);
	}finally {
	    System.out.println("Finally block,");
	}
    }

}
