package com.example.oppsconcept.OppsToEnumExamples.ExceptionHandling.CustomException;

public class Test {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(10);
        try{
            bankAccount.withdraw(11);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
