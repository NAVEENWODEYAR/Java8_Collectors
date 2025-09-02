package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

import java.util.Scanner;

//Abstract class for Bank
abstract class Bank {
 abstract double getInterestRate(String loanType);
}

//SBI Bank
class SBI extends Bank {
 double getInterestRate(String loanType) {
     switch (loanType.toLowerCase()) {
         case "home":
             return 8.5;
         case "car":
             return 9.0;
         case "personal":
             return 11.5;
         default:
             return 0.0;
     }
 }
}

//HDFC Bank
class HDFC extends Bank {
 double getInterestRate(String loanType) {
     switch (loanType.toLowerCase()) {
         case "home":
             return 8.3;
         case "car":
             return 9.2;
         case "personal":
             return 12.0;
         default:
             return 0.0;
     }
 }
}

//ICICI Bank
class ICICI extends Bank {
 double getInterestRate(String loanType) {
     switch (loanType.toLowerCase()) {
         case "home":
             return 8.6;
         case "car":
             return 9.1;
         case "personal":
             return 11.8;
         default:
             return 0.0;
     }
 }
}

public class LoanInterestChecker {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Choose a bank: SBI, HDFC, ICICI");
     String bankChoice = sc.nextLine();

     System.out.println("Choose a loan type: Home, Car, Personal");
     String loanType = sc.nextLine();

     Bank bank;

     switch (bankChoice.toUpperCase()) {
         case "SBI":
             bank = new SBI();
             break;
         case "HDFC":
             bank = new HDFC();
             break;
         case "ICICI":
             bank = new ICICI();
             break;
         default:
             System.out.println("Invalid bank choice.");
             sc.close();
             return;
     }

     double rate = bank.getInterestRate(loanType);
     if (rate > 0) {
         System.out.println("Interest Rate for " + loanType + " loan at " + bankChoice.toUpperCase() + " is: " + rate + "%");
     } else {
         System.out.println("Invalid loan type.");
     }

     sc.close();
 }
}
