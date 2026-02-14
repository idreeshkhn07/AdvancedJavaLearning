package com.example.oppsconcept.accessmodifiers.test;


import com.example.oppsconcept.accessmodifiers.school.Student;
import com.example.oppsconcept.accessmodifiers.zoo.Dog;

public class test {
    public static void main(String[] args) {

        Dog dog =new Dog("Bob");
        dog.makeSound();
        dog.setDogSound("Woof");
        dog.makeSound();
        dog.wagTail();

    }
}
