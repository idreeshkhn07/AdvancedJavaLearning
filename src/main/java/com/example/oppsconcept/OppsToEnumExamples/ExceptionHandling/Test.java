package com.example.oppsconcept.OppsToEnumExamples.ExceptionHandling;

public class Test {

    public static void main(String[] args) {
        int[] numerator  = {10,20,5,25};
        int[] denominator = {5,12,0,5};
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(divide(numerator[i], denominator[i]));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception :  (");
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return 1;
        }
    }
}
