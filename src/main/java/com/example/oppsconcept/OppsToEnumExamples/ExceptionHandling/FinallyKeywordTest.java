package com.example.oppsconcept.OppsToEnumExamples.ExceptionHandling;

public class FinallyKeywordTest {

    public static void main(String[] args) {
        System.out.println(divide(10,4));
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        } catch (Exception e){
            return -1;
        } finally {
            System.out.println("Bye");
        }

    }
}
