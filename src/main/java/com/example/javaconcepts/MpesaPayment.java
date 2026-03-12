package com.example.javaconcepts;
// this file implements the PaymentServiceInterface interface and provides the signature specified in the PaymentServiceInterface interface

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("mpesa") //Tells Spring to manage this class (for dependecy injection)
@Primary //Spring will use this by default
public class MpesaPayment implements PaymentServiceInterface {
    @Override
    public void payment(double amount) {
        System.out.println("Payment amount via Mpesa  is " + amount);
    }
}
