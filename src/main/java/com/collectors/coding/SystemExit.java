package com.collectors.coding;

public class SystemExit {

    static void roundOf() {
	int a=0;int b=0;
	try {
	    System.out.println(Math.round(a+b));
	    System.exit(0);
	} catch (Exception e) {
	    System.out.println(e.getStackTrace());
	    // JVM will terminate here, finally block won't execute,
	    System.exit(0);
	}finally {
	    System.out.println("Inside Finally block,");
	}
    }

    public static void main(String[] args) {

    }

}
