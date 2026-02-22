package com.example.oppsconcept.EnumDemo;

public enum Day {

    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    Day(String lower) {
        System.out.println("Our constructor called");
        this.lower = lower;
    }

    private String lower;

    public String getLower() {
        return lower;
    }

    // Methods in Enums
    public void display(){
        System.out.println("Today is " + this.name());
    }
}
