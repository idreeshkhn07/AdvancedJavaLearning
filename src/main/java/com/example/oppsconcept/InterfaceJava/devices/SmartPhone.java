package com.example.oppsconcept.InterfaceJava.devices;

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void takePhoto() {
        System.out.println("Taking Photo from SmartPhone");
    }

    @Override
    public void makeVideo() {
        System.out.println("Make Video from SmartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("Play Music from SmartPhone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music from SmartPhone");
    }

    @Override
    public void takeCall(String number) {
        System.out.println("Taking call " + number);
    }

    @Override
    public void endCall() {
        System.out.println();
    }
}
