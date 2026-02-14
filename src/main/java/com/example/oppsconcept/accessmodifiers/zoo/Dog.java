package com.example.oppsconcept.accessmodifiers.zoo;

import static java.lang.Character.getName;

public class Dog extends Animal {

    public Dog( String name){
        super(name , "bark");
    }

    public void wagTail() {
        System.out.println(getName() + " its wagging it's tail." );
    }

    private String getName() {
        return getClass().getName();
    }

    public void setDogSound(String newSound){
        changeSound(newSound) ;
    }
}
