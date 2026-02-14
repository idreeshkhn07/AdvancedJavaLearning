package com.example.oppsconcept.Encapsulation;

public class Test {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(786788);
        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);

        System.out.println(bankAccount.getBalance());

    }
}



/*
    Student student = new Student();
        student.setAge(-15);
        System.out.println(student.getAge());

 */