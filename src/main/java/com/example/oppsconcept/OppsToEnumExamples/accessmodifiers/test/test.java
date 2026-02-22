package com.example.oppsconcept.OppsToEnumExamples.accessmodifiers.test;


import com.example.oppsconcept.OppsToEnumExamples.accessmodifiers.zoo.Dog;

public class test {
    public static void main(String[] args) {

        Dog dog =new Dog("Bob");
        dog.makeSound();
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();

    }
}
