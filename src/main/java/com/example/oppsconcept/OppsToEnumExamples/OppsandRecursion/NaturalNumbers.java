package com.example.oppsconcept.OppsToEnumExamples.OppsandRecursion;

public class NaturalNumbers {

    public static void main(String[] args){
        System.out.println(sumOfNNaturalNumbers(6));
    }


    public static int sumOfNNaturalNumbers(int n){

        if( n == 1){
            return 1;
        }

        return n + sumOfNNaturalNumbers(n-1);
    }
}
