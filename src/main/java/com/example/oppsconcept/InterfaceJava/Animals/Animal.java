package com.example.oppsconcept.InterfaceJava.Animals;

public interface Animal {

    public static final int MAX_AGE = 120;

    public abstract void eat();

    void sleep();

    public static void info(){
        System.out.println("This is an animal Interface");
    }

    public default void isRunning(){
        System.out.println("Animal is running");
    }
}
