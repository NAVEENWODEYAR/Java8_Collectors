package com.collectors.exception;

/**
 * @author NaveenWodeyar
 *
 */

//File: BlockExample.java

public class BlockExample {

 static int staticCounter;
 int instanceCounter;

 static {
     System.out.println("Static block executed.");
     staticCounter = 100;
 }

 {
     System.out.println("Non-static block executed.");
     instanceCounter = 10;
 }

 public BlockExample() {
     System.out.println("Constructor executed.");
 }

 public static int getStaticCounter() {
     return staticCounter;
 }

 public int getInstanceCounter() {
     return instanceCounter;
 }
}
