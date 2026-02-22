package com.example.oppsconcept.OppsToEnumExamples.EnumDemo.EnumExample;

public enum OrderStatus {

    SUCCESS("Order Conmplete"),
    FAILED("Order Failed"),
    PENDING("Order Pending");

    private String message;

    OrderStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
