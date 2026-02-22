package com.example.oppsconcept.EnumDemo.EnumExample;

public class Main {
    public static void main(String[] args) {

        Status pendingstatus = Status.PENDING;
        Status failedstatus = Status.PENDING;
        Status activestatus = Status.PENDING;

        System.out.println(pendingstatus);
        System.out.println(failedstatus);
        System.out.println(activestatus);

        System.out.println(OrderStatus.SUCCESS.getMessage());

        int apply = Operation.ADD.apply(5, 10);
        System.out.println(apply);

    }
}
