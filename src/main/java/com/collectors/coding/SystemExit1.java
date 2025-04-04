package com.collectors.coding;

/**
 * @author Naveen K Wodeyar
 * @date 25-02-2024,
 * @System.exit() is a method used to terminate the Java Virtual Machine (JVM) and stop the running application. It takes a single argument, an integer status code, which is typically used to indicate the reason for the termination.
 */

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
