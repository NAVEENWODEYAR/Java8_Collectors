package com.collectors.coding;

/**
 * @author NaveenWodeyar
 *
 */

public class ThreadTrick extends Thread {
    public void run() {
        try {
            join(); // Joining itself
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Thread executed");
    }

    public static void main(String[] args) {
        new ThreadTrick().start();
    }
}
