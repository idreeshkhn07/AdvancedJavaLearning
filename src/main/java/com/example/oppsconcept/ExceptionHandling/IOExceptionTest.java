package com.example.oppsconcept.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOExceptionTest {

    public static void main(String[] args) throws FileNotFoundException {

        method2();
        System.out.println("Hello");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("TextFile");
        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            throw new FileNotFoundException("opps");
        }
    }
}
