package com.example.javaconcepts;
// this file implements the PaymentServiceInterface interface and provides the signature specified in the PaymentServiceInterface interface
public class MpesaPayment implements PaymentServiceInterface {
    @Override
    public void payment(double amount) {
        System.out.println("Payment amount via Mpesa  is " + amount);
    }
}
