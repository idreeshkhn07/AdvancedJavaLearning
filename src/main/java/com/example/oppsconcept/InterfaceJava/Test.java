package com.example.oppsconcept.InterfaceJava;

import com.example.oppsconcept.InterfaceJava.Animals.Animal;
import com.example.oppsconcept.InterfaceJava.Animals.Cat;
import com.example.oppsconcept.InterfaceJava.Animals.Dog;
import com.example.oppsconcept.InterfaceJava.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
        // Multiple Inheritance

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.takeCall("1881818181");
        smartPhone.endCall();
        smartPhone.takePhoto();

        // Static and Default Method
//        Dog dog = new Dog();
//        dog.eat();
//        Cat cat = new Cat();
//        cat.sleep();
//        System.out.println(Dog.MAX_AGE);
//        Animal.info();
//        dog.isRunning();
//        cat.isRunning();
    }
}
