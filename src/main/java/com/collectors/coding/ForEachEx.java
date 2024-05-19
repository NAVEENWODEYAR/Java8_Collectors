package com.collectors.coding;

public class ForEachEx {

    static void forEachLoop() {
	String [] names = {"A","B","C","D","E"};
	
	for (String st : names) {
	    System.out.println(st+":"+st.toLowerCase());
		forEachLoop(); 
		}
    }
    public static void main(String[] args) {
    	System.out.println("\n\n");
    }
}
