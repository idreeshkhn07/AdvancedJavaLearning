package com.example.oppsconcept.ExceptionHandling.CustomException;

public class InsufficientFunds extends Exception {

    public InsufficientFunds() {


        super("You Don't Have money get your bank Balance Up");
    }
}
