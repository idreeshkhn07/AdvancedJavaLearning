package com.example.oppsconcept.innerclasses;

public class Car {

    private String model;

    private boolean isEngineOn;

    //Constructor
    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }


    // Inner Class

    class Engine{

        public void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + " engine Started");
            }else {
                System.out.println((model + " engine is already on"));
            }
        }

        public void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + " engine Stopping");
            }else {
                System.out.println(model + " engine is already stopped");
            }
        }
    }
}
