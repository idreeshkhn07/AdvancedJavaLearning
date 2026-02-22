package com.example.oppsconcept.OppsToEnumExamples.EnumDemo.EnumExample;

public enum Status {

        SUCCESS,
        FAILED,
        PENDING;

        public void printMessage() {
            System.out.println("Current status: " + this.name());
        }
    }

