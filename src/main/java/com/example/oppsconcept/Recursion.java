package com.example.oppsconcept;

public class Recursion {

    public static void main(String[] args){

        System.out.println(factorial(5));

    }


    public static int factorial(int n){

        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
//        int res = 1;
//
//        for (int i = 1; i <= n; i++){
//            res = res * i;
//        }
//
//        return res;
    }
}
