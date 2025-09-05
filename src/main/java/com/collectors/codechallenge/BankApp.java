package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor using 'this' keyword
    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    // Deposit method using 'this' to refer to instance variable
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display account details
    public void showAccountInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Current Balance: $" + this.balance);
    }

    // Method that returns 'this' object (chaining example)
    public BankAccount getAccount() {
        return this;
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "John Doe", 500.0);

        account1.deposit(200.0);
        account1.showAccountInfo();

        // Chaining example (not necessary but shows use of 'this')
        BankAccount ref = account1.getAccount();
        ref.deposit(100.0);
        ref.showAccountInfo();
    }
}

