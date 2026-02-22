package com.example.oppsconcept.OppsToEnumExamples.ExceptionHandling.CustomException;

public class InsufficientFunds extends Exception {

    public InsufficientFunds() {


        super("You Don't Have money get your bank Balance Up");
    }
}
