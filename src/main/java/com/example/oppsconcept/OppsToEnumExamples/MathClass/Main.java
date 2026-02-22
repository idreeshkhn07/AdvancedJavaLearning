package com.example.oppsconcept.OppsToEnumExamples.MathClass;

public class Main {

    public static void main(String[] args) {

        int a = 11;
        int b = 13;
        int max = Math.max( a, b);
        int min = Math.min(a,b);

        int c = -5;
        int absolute = Math.abs(c);

        double d = 1.52;
        double ceil = Math.ceil(22);
        System.out.println(ceil);

        int e = 144;
        System.out.println(Math.sqrt(e));


        Math.cos(a);
        System.out.println(a);

        System.out.println(Math.random());

        System.out.println(Math.nextAfter(1, 2 ));
    }
}
