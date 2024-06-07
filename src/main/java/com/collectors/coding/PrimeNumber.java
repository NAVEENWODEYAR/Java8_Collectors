package com.collectors.coding;

import java.util.stream.IntStream;

public class PrimeNumber {

    static boolean isPrime(int n) {
	if(n<=1)
	    return false;
	for(int i=2; i<=Math.sqrt(n); i++) {
	    if(n%i==0)
		return false;
	}
	return true;
    }
    
    static Boolean isPrimee(int number) {
        boolean isPrime = number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(n -> number % n == 0);
        return isPrime;
    }
    
    public static void main(String[] args) {
    	System.out.print(isPrime(5));
	if(isPrime(9))
	    System.out.println("Prime number,");
	else 
	    System.out.println("Not prime,");
    }
    
}
