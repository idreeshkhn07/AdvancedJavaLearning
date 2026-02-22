package com.example.oppsconcept.OppsToEnumExamples.Encapsulation;

public class BankAccount {

    private long accountNumber;

    private double balance;

    public void deposit(double amount){

        if(amount > 0){
            balance += amount;
            System.out.println("Deposited amount" + amount);
        }else{
            System.out.println("Invalid amount" + amount);
        }

    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew Amount" + amount);
        }else {
            System.out.println("Invalid amount or Insufficient balance");
        }

    }

    public double getBalance() {
        return balance;
    }



    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}
