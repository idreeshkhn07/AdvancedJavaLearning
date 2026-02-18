package com.example.oppsconcept.innerclasses.nestedinnerclass;

public class Test {
    public static void main(String[] args) {

        Computer computer = new Computer( "HP", "LL765", "Ubuntu");
        computer.getOs();
        computer.displayInfo();

        Computer.USB usb = new Computer.USB("C");
        usb.displayInfo();
    }
}
