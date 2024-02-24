package com.collectors.coding;

public class SystemExit {

    public static void main(String[] args) {
	System.out.println("System.exit()");
	int a=0;int b=0;
	try {
	    System.out.println(a+b);
	    System.exit(0);
	} catch (Exception e) {
	    System.out.println(e.getStackTrace());
	    // JVM will terminate here, finally block won't execute,
	    System.exit(0);
	}finally {
	    System.out.println("Finally block,");
	}
    }

}
