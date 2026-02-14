package com.example.oppsconcept.Car;

public class CarProperty {

    String color;

    String brand;

    String model;

    int year;

    int speed;

    public void acceleration(int increment){
        speed += increment;
    }

    public void deacceleration(int decrement){
        speed -= decrement;
    }
}
