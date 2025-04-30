package com.collectors.threads;

/**
 * @author NaveenWodeyar
 *
 */

class ABCPrinter {
    private int state = 0;

    public void printLetter(char letter, int targetState) {
        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                while (state % 3 != targetState) {
                    try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
                System.out.print(letter);
                state++;
                notifyAll();
            }
        }
    }
}

public class PrintABC {
    public static void main(String[] args) {
        ABCPrinter printer = new ABCPrinter();

        new Thread(() -> printer.printLetter('A', 0)).start();
        new Thread(() -> printer.printLetter('B', 1)).start();
        new Thread(() -> printer.printLetter('C', 2)).start();
    }
}

