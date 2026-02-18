package com.example.oppsconcept.innerclasses.Payment;

public class Test {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(787);
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println(" Paid " + amount + " Using Credit Card");
            }
        });

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println(" Paid " + amount + " Using PayPal");
            }
        });
    }

}
