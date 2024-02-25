package com.collectors.coding;

public class PrimeNumber {

    // method to check if a given number is prime,
    static boolean isPrime(int n) {
	if(n<=1)
	    return false;
	for(int i=2; i<=Math.sqrt(i); i++) {
	    if(n%2==0)
		return false;
	}
	return true;
    }
    
    public static void main(String[] args) {
	if(isPrime(5))
	    System.out.println("Prime");
	else
	    System.out.println("Not prime,");
    }
}
