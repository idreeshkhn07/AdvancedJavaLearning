package com.example.oppsconcept.innerclasses.localinnerclasses;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Cloud9", 10, 5);
        hotel.reserveRoom("Idreesh", 1);
        hotel.reserveRoom("Akshit", 7);
        hotel.reserveRoom("", 7);

    }
}
