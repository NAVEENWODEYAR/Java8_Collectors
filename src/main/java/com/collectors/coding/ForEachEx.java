package com.collectors.coding;

public class ForEachEx {

    static void forEachLoop() {
	String [] names = {"A","B","C","D"};
	
	for (String st : names) {
	    System.out.println(st+":"+st.toLowerCase());
	}
    }
    
    public static void main(String[] args) {
	forEachLoop(); 
    }
}
