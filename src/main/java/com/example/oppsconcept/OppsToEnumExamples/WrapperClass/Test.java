package com.example.oppsconcept.OppsToEnumExamples.WrapperClass;

public class Test {

    public static void main(String[] args) {

        Integer i = 10;
        i.toString(10);
        System.out.println(i);
        System.out.println(Integer.max(7, 10));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.min(2,8));
        String str = "123";
        Integer j = Integer.valueOf(str);
        System.out.println(j);
    }
}

