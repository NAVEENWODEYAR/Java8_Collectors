package com.collectors.coding;

/**
 * @author Naveen K Wodeyar
 * @date 25-02-2024,
 * @System.exit() is a method used to terminate the Java Virtual Machine (JVM) and stop the running application. It takes a single argument, an integer status code, which is typically used to indicate the reason for the termination.
 */

public class SystemExit {

	static void roundOf() {
		int a = 0;
		int b = 0;
		try {
			System.out.println(Math.round(a + b));
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			// JVM will terminate here, finally block won't execute,
			System.exit(0);
		} finally {
			System.out.println("Inside Finally block,");
		}
	}

	static void roudOfSum() {
		int a = 2;
		float b = 1.8f;
		try {
			System.out.println(Math.round(a + b));
		} catch (Exception e) {
			System.out.println(Math.ceil(a - b));
			System.exit(0);
		} finally {
			System.out.println("Inside finally block,");
		}
	}

	public static void main(String[] args) {
		roundOf();
		roudOfSum();
	}
}
